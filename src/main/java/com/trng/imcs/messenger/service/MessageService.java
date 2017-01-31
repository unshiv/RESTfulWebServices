package com.trng.imcs.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.trng.imcs.messenger.database.DatabaseClass;
import com.trng.imcs.messenger.model.Message;

public class MessageService {
	
	private Map<Long, Message> messages = DatabaseClass.getMessages();
	
	public MessageService(){
		messages.put(1l, new Message(1L,"Hello World", "vishnu")) ;
		messages.put(2l, new Message(2L,"Hello Jersey", "sandy")) ;
		
	}
	
	public List<Message> getAllMessages(){
		
		return new ArrayList<Message>(messages.values());
		
		
	/*	Message m1 = new Message(1L,"Hello World", "vishnu");
		Message m2 = new Message(1L,"Hello Jersey", "sandy");
		Message m3 = new Message(1L,"Hello Rest", "dillu");
		List<Message> list =new ArrayList<>();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		return list;*/
		
	}
	
	
	public Message getMessage(long id){
		return messages.get(id);
	}
	
	public Message addMessage(Message message){
		message.setId(messages.size()+1);
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message updateMessage(Message message){
		if(message.getId() <= 0){
			return null;
		}
		messages.put(message.getId(), message);
		return message;
		
	}
	
	public Message removeMessage(long id){
		return messages.remove(id);
	}
	

}
