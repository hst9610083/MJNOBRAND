package com.min.mj.ctrl;


import java.io.File;

import java.io.IOException;
import java.security.Principal;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FilenameUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.min.mj.dtos.MJ_BoardDTO;
import com.min.mj.dtos.MJ_MemberDTO;
import com.min.mj.dtos.RowNumDto;
import com.min.mj.dtos.fileDto;
import com.min.mj.model.board.IMj_Board_Service;


@Controller
public class PBoardController {

   private Logger log = LoggerFactory.getLogger(this.getClass());
   
   @Autowired
   IMj_Board_Service service;
 
   
   
   // 홍보게시판 전체글 리스트
   @RequestMapping(value="/pBoardList.do", method = RequestMethod.GET)
   public String pBoardList(Model model, HttpSession session ) {
      log.info("Welcome /BoardList.do : \t {}", new Date());
      

      //페이징 처리 DTO
      RowNumDto rowDto = null;
      //페이징처리된 리스트
      List<MJ_BoardDTO> lists = service.pplSelectBoard();
      MJ_MemberDTO mDto = (MJ_MemberDTO) session.getAttribute("mem");
      if(session.getAttribute("row")==null) {
         rowDto = new RowNumDto();
      }else {
         rowDto = (RowNumDto) session.getAttribute("row");
      }
      
      if(mDto.getAuth().trim().equalsIgnoreCase("ROLE_S")||mDto.getAuth().trim().equalsIgnoreCase("ROLE_C")) {
         rowDto.setTotal(service.BoardListTotal());
         lists = service.BoardListRow(rowDto);
      }else {
         rowDto.setTotal(service.BoardListTotal());
         lists = service.BoardListRow(rowDto);
      }
      model.addAttribute("row", rowDto);

      
      // 전체글 조회
//      MJ_BoardDTO mDto = (MJ_BoardDTO) session.getAttribute("list");
      


      model.addAttribute("lists", lists);
      
      return "pBoardList";
   }
   
   //글쓰기 이동
   @RequestMapping(value="/writeForm.do", method = RequestMethod.GET)
   public String writeForm() {
      log.info("Welcome writeForm.do :\t {}", new Date());
      return "pBoardWriteForm";
   }
   
   //글 작성
   @RequestMapping(value="/pBoardWrite.do", method = RequestMethod.POST)
   public String pboardWrite(HttpSession session, MJ_BoardDTO dto, Model model){
      log.info("Welcome boardWrite: \t {}",dto);
      MJ_MemberDTO mDto =  (MJ_MemberDTO) session.getAttribute("mem");
      dto.setId(mDto.getId());
//		MultipartFile uploadFile = dto.getUploadFile();
//		if (!uploadFile.isEmpty()) {
//			String originalFileName = uploadFile.getOriginalFilename();
//			String ext = FilenameUtils.getExtension(originalFileName);	//확장자 구하기
//			UUID uuid = UUID.randomUUID();	//UUID 구하기
//			fileName=uuid+"."+ext;
//			uploadFile.transferTo(new File("c:\\nobrand\\" + fileName));
//		}
//		dto.setRealfile(fileName);
		boolean isc = service.pplWriteBoard(dto);
		return isc?"redirect:/pBoardList.do":"redirect:/logout.do";
   }
   //글 수정 이동
   @RequestMapping(value="/pModifyForm.do", method = RequestMethod.GET)
   public String ModifypBoard(MJ_BoardDTO dto, String seq, Model model,HttpSession session){
      log.info("Welcome Modify.do : \t{}",dto);
      MJ_BoardDTO lists = service.pplgetOnBoard(seq);
      model.addAttribute("lists", lists);
      return "pModifyForm";
   }
   
   //글수정
   @RequestMapping(value="/pModify.do", method = RequestMethod.POST)
   public String Modify(MJ_BoardDTO dto,String seq, Model model,HttpSession session,MultipartFile filename){
	   log.info("Welcome Modify.do : \t{}",dto);
	   boolean isc = service.pplModifyBoard(dto);
	   return isc?"redirect:/pBoardList.do":"redirect:/logout.do";
   }
   
   
   //다중삭제
   @RequestMapping(value = "/pMultiDel.do", method = RequestMethod.POST)
   public String DelpBoard(HttpSession session,String[] chkval, HttpServletResponse response)throws IOException{
	  response.setContentType("UTF-8");
      log.info("Welcome /MultiDelete.do : \t{}",Arrays.toString(chkval));
      MJ_MemberDTO mDto = (MJ_MemberDTO) session.getAttribute("mem");
      boolean isc = false;
         Map<String, String[]> map = new HashMap<String, String[]>();
         map.put("seq_", chkval);
         isc = service.pplMultiDel(map);
      return isc?"redirect:/pBoardList.do":"redirect:/pBoardList.do";
  }
   
   //단일삭제
   @RequestMapping(value = "/pdel.do", method = RequestMethod.GET)
   public String del(String seq) {
      log.info("Welcome pdel.do : \t {}",seq);
      boolean isc = service.pplDelBoard(seq);
      return isc?"redirect:/pBoardList.do":"redirect:/logout.do";

   }
   //상세보기
   @RequestMapping(value="/pBoardDetail.do", method = RequestMethod.GET)
   public String DetailpBoard(Model model,String seq, HttpSession session,Principal principal) {
      log.info("Welcome Detail.do : \t {}", seq);
      MJ_MemberDTO mDto = (MJ_MemberDTO) session.getAttribute("mem");
      MJ_BoardDTO lists = service.pplgetOnBoard(seq);
      model.addAttribute("lists", lists);
      return "pBoardDetail";
   }
}