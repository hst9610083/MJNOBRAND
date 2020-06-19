package com.min.mj.ctrl;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.Principal;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
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
      System.out.println(mDto);
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
          return "redirect:/loginaddmin.do";
          
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

   
   
   
//   업체 아이디 찾기페이지로 가기
   @RequestMapping(value="/findId.do",method = RequestMethod.GET)
   public String f_id(MJ_MemberDTO dto,Model model) {
      System.out.println("아이디 찾기"+ dto.toString());
      return "findId";
   }
// 소비자 아이디 찾기페이지로 가기
 @RequestMapping(value="/findId_C.do",method = RequestMethod.GET)
 public String f_id_C(MJ_MemberDTO dto,Model model) {
    System.out.println("아이디 찾기"+ dto.toString());
    return "findId_C";
 }
 
 
//   비밀번호 찾기페이지로 가기
   @RequestMapping(value="/findpw.do",method = RequestMethod.GET)
   public String f_pw(MJ_MemberDTO dto,Model model) {
      System.out.println("비밀번호 찾기"+ dto.toString());
      return "findpw";
   }
   
   

   @RequestMapping(value = "/findiding.do", method = RequestMethod.POST)
   public String findiding(String email,String name, Model model,MJ_MemberDTO Mdto){
      System.out.println(email);
      System.out.println(name);
      MJ_MemberDTO id = service.findid(Mdto);
      Mdto.setEmail(email);
      Mdto.setName(name);
      if(id==null) {
      System.out.println(id+"@@@@");
    	  System.out.println("id가 없어@@@@@@@@@@");
    	  return "findId";
      }else {
      System.out.println(id.getId()+"id.getid");
      System.out.println(model.addAttribute("id", id));
      model.addAttribute("id",id);
      return "findIdAfter";
      }
   }
   
   @RequestMapping(value = "/findiding_C.do", method = RequestMethod.POST)
   public String findiding_C(int phonnum,String name, Model model,MJ_MemberDTO Mdto){
      System.out.println(phonnum);
      System.out.println(name);
      MJ_MemberDTO id = service.findid_C(Mdto);
      Mdto.setPhonnum(phonnum);
      Mdto.setName(name);
      System.out.println(id+"@@@@");
      if(id==null) {
      System.out.println(id+"kkkkkkkkkkk");
    	  System.out.println("id가 없어kkkkkkkkkkkkk");
    	  return "findId_C";
      }else {
      System.out.println(id.getId()+"id.getid");
      System.out.println(model.addAttribute("id", id));
      model.addAttribute("id",id);
      return "findIdAfter";
      }
   }
   
//   관리자페이지
//   @RequestMapping(value = "/admin/userInfo.do", method= RequestMethod.GET)
//   public String adminPage() {
//      return "userInfo";
//   }
   @RequestMapping(value = "/AuthError.do", method = RequestMethod .GET)
   public String AuthError() {
   
      return "AuthError";
   }

//   관리자페이지
//   @RequestMapping(value = "/admin/userInfo.do", method= RequestMethod.GET)
//   public String adminPage() {
//      return "userInfo";
//   }
   @RequestMapping(value = "/AuthError.do", method = RequestMethod .GET)
   public String AuthError() {
   
      return "AuthError";
   }
   

   
   @RequestMapping(value = "/idCheck.do", method = RequestMethod.POST)
   @ResponseBody
   public Map<String, String> idCheck(String id, HttpServletResponse resp) throws IOException {
      System.out.println(id);
      Map<String, String> map = new HashMap<String, String>();
      System.out.println("Welcome idCheck.do :\t {}"+ id);
      System.out.println(map+"map");
      boolean isc = service.idDuplicateCheck(id);
      System.out.println(isc+"2222");
      map.put("isc", isc+"");
//      resp.setCharacterEncoding("utf-8");
//      resp.setContentType("text/html; charset=UTF-8");
//      if(isc) {
//    	  System.out.println(isc+"true");
//    	  PrintWriter p =  resp.getWriter();
//          p.print("<script> alert('아이디가 중복됩니다.');</script>");
//          p.flush();
//      }
      if(isc) {
    	  System.out.println(isc+"true");
      }
      return map;
   }


}