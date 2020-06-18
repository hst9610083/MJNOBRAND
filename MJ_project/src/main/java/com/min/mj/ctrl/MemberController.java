package com.min.mj.ctrl;

import java.util.List;
import javax.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.min.mj.dtos.MJ_MemberDTO;
import com.min.mj.dtos.RowNumDto;
import com.min.mj.model.member.IMj_Member_Dao;

@Controller
public class MemberController {

	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private IMj_Member_Dao member;

	/**
	 * UserList(관리자)
	 */
	@RequestMapping(value = "/loginaddmin.do", method = RequestMethod.GET)
	public String infoBoard(Model model, HttpSession session) {
		System.out.println(member.info());
		List<MJ_MemberDTO> memlists = member.info();
		model.addAttribute("memlists", memlists);
		return "loginaddmin";
	}

	@RequestMapping(value = "/del.do", method = RequestMethod.GET)
	public String del_1(HttpSession session, String id, Model model) {
		log.info("Welcome del.do:\t {}");
		boolean isc = member.s_getout(id);
		System.out.println(isc);
		return isc?"redirect:/loginaddmin.do":"logout";
	}
	
//	자기 자신 회원탈퇴
//	@RequestMapping(value = "/del.do", method = RequestMethod.GET)
//	public String del_(HttpSession session, String[] seq, Model model,Principal principal) {
//		log.info("Welcome del.do:\t {}", Arrays.toString(seq));
//		String id = principal.getName();
//		boolean isc = member.s_getout(id);
//		System.out.println(isc+"ISC");
//		
//		return isc?"loginaddmin":"logout.do";
//	}
}