package com.min.mj.ctrl;

import java.security.Principal;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.min.mj.dtos.MJ_MemberDTO;
import com.min.mj.model.member.IMj_Member_Service;

@Controller
public class LoginController {

   @Autowired
   IMj_Member_Service service;
   // 로그인 페이지로 가는 매핑
   
   @RequestMapping(value= "/loginPage.do", method = RequestMethod.GET)
   public String login(
		   @RequestParam(value = "error", required = false)String error,
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
      System.out.println("loginPage.do1");
      return "login";
   }


   // 소비자 로그인 후 소비자 홈페이지 가는 매핑
   @RequestMapping(value = "/result.do", method = RequestMethod.GET)
   public String maingo_c(Model model, Authentication user, Principal principal,HttpSession session) {
      String id = principal.getName();
      MJ_MemberDTO mDto = service.userlogin(id);
      System.out.println();
      mDto.getAuth();
      System.out.println(mDto.getAuth());
      mDto.getId();
      model.addAttribute("mDto",mDto);
      session.setAttribute("mem", mDto);
      if( mDto.getAuth().trim().equalsIgnoreCase("ROLE_C")) {
    	  mDto.getAuth();
    	  System.out.println(mDto.getAuth()+"C");
          return "logincon";
      }else if(mDto.getAuth().trim().equalsIgnoreCase("ROLE_S")) {
    	  mDto.getAuth();
          System.out.println(mDto.getAuth()+"S");
          return "loginseller";
      }else if(mDto.getAuth().trim().equalsIgnoreCase("ROLE_A")) {
    	  mDto.getAuth();
          System.out.println(mDto.getAuth()+"A");
          return "loginaddmin";
      }
      return "";
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
   
   @RequestMapping(value = "/admin/userInfo.do", method= RequestMethod.GET)
   public String adminPage() {
      return "userInfo";
   }
   @RequestMapping(value = "/AuthError.do", method = RequestMethod .GET)
   public String AuthError() {
   
      return "AuthError";
   }
   
   
   @RequestMapping(value = "/idCheck.do", method = RequestMethod.POST)
   @ResponseBody
   public Map<String, String> idCheck(String id){
      System.out.println(id);
      Map<String, String> map = new HashMap<String, String>();
      System.out.println("Welcome idCheck.do :\t {}"+ id);
      boolean isc = service.idDuplicateCheck(id);
      System.out.println(id);
      map.put("isc", isc+"");
      return map;
   }

}