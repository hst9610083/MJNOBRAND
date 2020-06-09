package com.min.mj.model.Chatting;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.min.mj.dtos.ChatDto;

@Service
public class Mj_ChatService implements IMj_ChatService {
	
	@Autowired
	private IMj_ChatDao dao;
	
	
	Logger log = LoggerFactory.getLogger(getClass());
	
	
	

	@Override
	public List<ChatDto> selectAllContent() {
		log.info("Welcome selectAllContent");	
		return dao.selectAllContent();
	}

	@Override
	public boolean chatWrite(ChatDto dto) {
		log.info("Welcome chatWrite : \t {}", dto);
		return dao.chatWrite(dto);
	}

}
