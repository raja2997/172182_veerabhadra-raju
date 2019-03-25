package org.ass.users.insert;

import java.util.ArrayList;
import java.util.List;

import org.ass.users.User;

public class UserInfo {
	static List<User> list=new ArrayList<>();
	
	public List<User> getUser()
	{
		
		return list;
		
	}
	public List<User> addUser(User u)
	{
		list.add(u);
		return list;
	}

}
