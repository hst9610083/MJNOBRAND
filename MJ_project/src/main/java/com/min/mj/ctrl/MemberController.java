package com.min.mj.ctrl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.min.mj.dtos.MJ_MemberDTO;
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
	public String infoBoard(Model model) {
		System.out.println(member.info());
		List<MJ_MemberDTO> memlists = member.info();
		model.addAttribute("memlists", memlists);
		return "loginaddmin";
	}

	@RequestMapping(value = "/del.do", method = RequestMethod.GET)
	public String del(HttpSession session, String[] seq, Model model) {
		log.info("Welcome del.do:\t {}", Arrays.toString(seq));
		MJ_MemberDTO mDto = (MJ_MemberDTO) member.info();
		System.out.println(mDto);

		mDto.getId();
		model.addAttribute("mDto", mDto);
		session.setAttribute("mem", mDto);
		boolean isc = false;
		return "del";
	}
}