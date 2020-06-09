
package com.min.mj.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.min.mj.model.member.IMj_Member_Service;

@Controller
public class LoginController {

	@Autowired
	IMj_Member_Service service;
	
	@RequestMapping(value= "/loginPate.do", method = RequestMethod.GET)
	public String login(@RequestParam(value = "error", required = false)String error,
			@RequestParam(value = "logout",required = false)String logout, Model model, Authentication user) {
		
		if (user != null) {
			UserDetails userD = (UserDetails)user.getPrincipal();
		}
		if(error != null) {
			model.addAttribute("msg", "로그인 에러");
		}
		if(logout != null) {
			model.addAttribute("msg","로그아웃 성공");
		}
		
		
		return "login";
		
	}
	
}
