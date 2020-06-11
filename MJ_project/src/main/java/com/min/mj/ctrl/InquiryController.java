
package com.min.mj.ctrl;

import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.min.mj.InquiryBoard.IConInquiry_Service;
import com.min.mj.dtos.INQUIRYBoardDto;
import com.min.mj.model.Inquiry.IMj_Inquiry_Service;

@Controller
public class InquiryController {
   private Logger log = LoggerFactory.getLogger(this.getClass());
   
   @Autowired
   private IMj_Inquiry_Service service;
   
   @Autowired
   private IConInquiry_Service service2;
   
   // 임시 문의글 게시판 전체리스트
   @RequestMapping(value="/iBoardList.do",method = RequestMethod.GET)
   public String iBoardList(Model model) {
      
      List<INQUIRYBoardDto> lists=service.Mimsi_All();
      model.addAttribute("lists",lists);
      return "iBoardList";
   }
   
      // 임시 문의글 게시판 상세보기
      @RequestMapping(value="/iBoardListDetail.do",method = RequestMethod.GET)
      public String iBoardListDetail(Model model,String seq) {
         
         INQUIRYBoardDto lists = service.Mimsi_Detail(seq);
         model.addAttribute("lists",lists);
         return "iBoardListDetail";
      }
   
   // 소비자문의게시판 (글 전체 조회)(소비자)
   @RequestMapping(value="/ConInquiryBoard.do",method = RequestMethod.GET)
   public String ConInquiryBoard(Model model) {
      
      List<INQUIRYBoardDto> lists=service2.C_allSelectBoard();
      model.addAttribute("lists",lists);
      return "ConInquiryBoard";
   }
   
   // 소비자문의게시판 글 상세 조회 (소비자)
   @RequestMapping(value="/ConInquiryBoardDetail.do",method = RequestMethod.GET)
   public String ConInquiryBoardDetail(Model model,String seq) {
      
      INQUIRYBoardDto lists=service2.C_SelectBoardDetail(seq);
      model.addAttribute("lists",lists);
      return "ConInquiryBoardDetail";
   }
   
   // 소비자문의게시판 글 입력 (소비자)
   
   
   // 소비자문의 게시판 (글 전체 조회)(업체)
   @RequestMapping(value="/SellInquiryBoard.do",method = RequestMethod.GET)
   public String SellInquiryBoard(Model model) {
      
      List<INQUIRYBoardDto> lists=service2.S_allSelectBoard();
      model.addAttribute("lists",lists);
      return "SellInquiryBoard";
   }
   
   // 소비자 문의 게시판 (글 상세 조회)(업체)
   @RequestMapping(value="/SellInquiryBoardDetail.do",method = RequestMethod.GET)
   public String SellInquiryBoardDetail(Model model,String seq) {
      
      INQUIRYBoardDto lists=service2.S_SelectBoardDetail(seq);
      model.addAttribute("lists",lists);
      return "SellInquiryBoardDetail";
   }
   
   
}
