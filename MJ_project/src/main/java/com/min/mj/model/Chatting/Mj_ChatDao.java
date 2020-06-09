package com.min.mj.model.Chatting;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.min.mj.dtos.ChatDto;

@Repository
public class Mj_ChatDao implements IMj_ChatDao {

	@Autowired
	SqlSessionTemplate session;
	
	private Logger log = LoggerFactory.getLogger(getClass());
	private final String NS = "com.min.chat."; 
	
	
	@Override
	public List<ChatDto> selectAllContent() {
		log.info("Welcome selectAllContent");
		return session.selectList(NS+"selectAllContent");
	}

	@Override
	public boolean chatWrite(ChatDto dto) {
		log.info("Welcome chatWrite : \t {}", dto);
		int n = session.insert(NS+"chatWrite", dto);
		return (n>0) ? true:false;
	}

}
