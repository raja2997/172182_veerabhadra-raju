package org.ass.users.insert;

import java.util.ArrayList;
import java.util.List;

import org.ass.users.User;
import org.ass.users.Zipcode;

public class ZipInfo {

static List<Zipcode> list=new ArrayList<>();
	
	public List<Zipcode> getZip()
	{
		
		return list;
		
	}
	public List<Zipcode> addZip(Zipcode z)
	{
		list.add(z);
		return list;
	}

}
