package com.min.mj.model.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.min.mj.dtos.MJ_MemberDTO;
import com.min.mj.dtos.RowNumDto;

@Service
public class Mj_Member_ServiceImpl implements IMj_Member_Service {

   @Autowired
   private IMj_Member_Dao dao;
   
   @Override
   public boolean s_register(MJ_MemberDTO dto) {
      System.out.println("ServiceImpl>>"+dto+"s_register");
      return dao.s_register(dto);
   }

   @Override
   public boolean c_register(MJ_MemberDTO dto) {
      System.out.println("ServiceImpl>>"+dto+">>c_register");
      return dao.c_register(dto);
   }

   @Override
   public MJ_MemberDTO userlogin(String id) {
      System.out.println("ServiceImpl>>"+id+">>userlogin");
      return dao.userlogin(id);
   }

   @Override
   public List<MJ_MemberDTO> s_info() {
      System.out.println("ServiceImpl>>"+">>s_info");
      return dao.s_info();
   }

   @Override
   public List<MJ_MemberDTO> c_info() {
      System.out.println("ServiceImpl>>"+">>c_info");
      return dao.c_info();
   }

   @Override
   public boolean s_getout(String id) {
      System.out.println("ServiceImpl>>"+id+">>s_getout");
      return dao.s_getout(id);
   }


   @Override
   public boolean s_modify(String id) {
      System.out.println("ServiceImpl"+id+">>s_modify");
      return dao.s_modify(id);
   }

   @Override
   public List<MJ_MemberDTO> info() {
      // TODO Auto-generated method stub
      return dao.info();
   }

   @Override
   public boolean idDuplicateCheck(String id) {
      System.out.println("idDuplicateCheck 중복검사, {}"+id);
      return dao.idDuplicateCheck(id);
   }

   @Override
   public MJ_MemberDTO findid(MJ_MemberDTO dto) {
      System.out.println("ServiceImpl>>"+dto+">>findid");
      return dao.findid(dto);
   }

   @Override
   public MJ_MemberDTO findid_C(MJ_MemberDTO dto) {
      System.out.println("ServiceImpl>>"+dto+">>findid_C");
      return dao.findid_C(dto);
   }

//   @Override
//   public List<MJ_MemberDTO> infoListRow(RowNumDto dto) {
//      System.out.println("infoListRow 페이징처리, {}"+dto);
//      return dao.infoListRow(dto);
//   }
//
//   @Override
//   public int infoListTotal() {
//      System.out.println("infoListRow 토탈 리스트, {}");
//      return dao.infoListTotal();
//   }

   

}