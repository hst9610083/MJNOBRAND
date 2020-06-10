package com.min.mj.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.min.mj.model.Chatting.IMj_ChatService;

@Controller
public class ChatController {

	@Autowired
	private IMj_ChatService service;
	
	// /chatRoom.do
	@RequestMapping(value="/chatRoom.do", method = RequestMethod.GET)
	public String chatRoom() {

		System.out.println("※※※※※※※※※※※※※※값은 들어옵니다. 전달과정에서 오류※※※※※※※※※※※※");
		return "ChatRoom";
	}
	
	
	// /chatRoom_A.do
	@RequestMapping(value="/chatRoom_A.do", method = RequestMethod.GET)
	public String chatRoom_A() {
		
		System.out.println("※※※※※※※※※※※※※※값은 들어옵니다. 전달과정에서 오류※※※※※※※※※※※※");
		return "ChatRoom_A";
	}
	// /chatRoom_A.do
	@RequestMapping(value="/Broadsocket.do", method = RequestMethod.GET)
	public String broadsocket() {
		
		System.out.println("※※※※※※※※※※※※※※값은 들어옵니다. 전달과정에서 오류※※※※※※※※※※※※");
		return "Broadsocket";
	}
	
	
}
