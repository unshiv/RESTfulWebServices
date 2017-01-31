package com.trng.imcs.messenger.database;

import java.util.HashMap;
import java.util.Map;

import com.trng.imcs.messenger.model.Message;
import com.trng.imcs.messenger.model.Profile;

public class DatabaseClass {
	
	private static Map<Long, Message> messages =new HashMap< >();
	private static Map<String, Profile> profiles =new HashMap<>();
	
	public static Map<Long, Message> getMessages(){
		return messages;
		
	}
	public static Map<String, Profile> getProfile(){
		return profiles;
		
	}
	public static Map<String, Profile> getProfiles() {
		// TODO Auto-generated method stub
		return null;
	}

}
