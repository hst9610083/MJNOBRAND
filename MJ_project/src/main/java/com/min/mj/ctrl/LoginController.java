package com.min.mj.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.min.mj.dtos.MJ_MemberDTO;
import com.min.mj.model.member.IMj_Member_Service;

@Controller
public class LoginController {

   @Autowired
   IMj_Member_Service service;
   // 로그인 페이지로 가는 매핑
   
   @RequestMapping(value= "/loginPage.do", method = RequestMethod.GET)
   public String login(@RequestParam(value = "error", required = false)String error,
         @RequestParam(value = "logout",required = false)String logout, Model model, Authentication user) {
      System.out.println("44");
	   
	   if (user != null) {
         UserDetails userD = (UserDetails)user.getPrincipal();
      }
      if(error != null) {
         model.addAttribute("msg", "로그인 에러");
      }
      if(logout != null) {
         model.addAttribute("msg","로그아웃 성공");
      }
      System.out.println("loginPage.do1");

      return "login";
   }


   // 로그인 후 홈페이지 가는 매핑
   @RequestMapping(value = "/result.do", method = RequestMethod.GET)
   public String maingo(Model model, Authentication user) {
      System.out.println("result");
	   if(user != null) {
         UserDetails userD = (UserDetails)user.getPrincipal();
      
         model.addAttribute("user",userD.toString());
      }
      return "logingo";
      
   }
   //   회원가입 페이지 가기 
   @RequestMapping(value = "/S_JoinUp", method = RequestMethod.GET)
   public String S_Joingo() {
      return "S_JoinUp";
   }
   @RequestMapping(value = "/C_JoinUp", method = RequestMethod.GET)
   public String C_Joingo() {
      return "C_JoinUp";
   }
   
   // 회원가입 성공 매핑
   @RequestMapping(value="/S_JoinUp.do",method = RequestMethod.POST)
   public String maingo_s(MJ_MemberDTO dto,Model model) {
      System.out.println("회원가입 정보"+ dto.toString());
      service.s_register(dto);
      return "login";
   }
   @RequestMapping(value="/C_JoinUp.do",method = RequestMethod.POST)
   public String maingo_c(MJ_MemberDTO dto,Model model) {
      System.out.println("회원가입 정보"+ dto.toString());
      service.c_register(dto);
      return "login";
   }
   
   @RequestMapping(value = "/admin/adminPage.do", method= RequestMethod.GET)
   public String adminPage() {
      return "adminPage";
   }
   @RequestMapping(value = "/AuthError.do", method = RequestMethod .GET)
   public String AuthError() {
   
      return "AuthError";
   }

}