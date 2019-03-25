package org.rest.raja.RaChat;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.ass.users.User;
import org.ass.users.insert.UserInfo;
@Path("user")
public class UserLogin {

	UserInfo ui=new UserInfo();
	User u=new User();
	@GET
	@Path("/{user}/{password}")
	@Produces(MediaType.APPLICATION_XML)
	public User addUser(@PathParam("user") String user,@PathParam("password") String pass) {
		u.setUsername(user);
		u.setPassword(pass);
		ui.addUser(u);
		return u;
		
		
		
	}
	@GET
	@Produces(MediaType.APPLICATION_XML)
		public List<User> getUsers()
		{
		    
			return ui.getUser();
			
		}
	@POST
	@Path("/{user}/{password}")
	@Produces(MediaType.APPLICATION_XML)
	public String login(@PathParam("user") String user,@PathParam("password") String pass) {
		List<User> l=ui.getUser();
		boolean status=false;
		for(User u1:l)
		{
			if(user.equals(u1.getUsername())&&pass.equals(u1.getPassword()))
					{
				         status=true;
				         return "Login successful";
					}
			else {
				     status=false;
				     
			}
		}
		return "login failed";
		
		
		
		
		
	}
	
}
