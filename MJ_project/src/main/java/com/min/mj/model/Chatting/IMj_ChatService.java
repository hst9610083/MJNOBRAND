package com.min.mj.model.Chatting;

import java.util.List;

import com.min.mj.dtos.ChatDto;

public interface IMj_ChatService {
	
	public List<ChatDto> selectAllContent();
	
	public boolean chatWrite(ChatDto dto);
	
	
}
