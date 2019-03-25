package org.rest.raja.RaChat;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


import org.ass.users.Zipcode;

import org.ass.users.insert.ZipInfo;

@Path("zipinfo")
public class ZipMain {

	ZipInfo zip=new ZipInfo();
	Zipcode z=new Zipcode();
	@POST
	@Path("/{zipcode}/{city}/{state}/{country}")
	@Produces(MediaType.APPLICATION_XML)
	public Zipcode addInfo(@PathParam("zipcode") int zipcode,@PathParam("city") String city,@PathParam("state") String state,@PathParam("country") String country) {
		z.setZipcode(zipcode);
		z.setCity(city);
		z.setState(state);
		z.setCountry(country);
		zip.addZip(z);
		return z;
		
		
		
	}
	@GET
	@Produces(MediaType.APPLICATION_XML)
		public List<Zipcode> getInfo()
		{
		    return zip.getZip();
			
			
		}
	@GET
	@Path("/{zipcode}")
	@Produces(MediaType.APPLICATION_XML)
	public String login(@PathParam("zipcode") int zipcode) {
		List<Zipcode> l=zip.getZip();
		boolean status=false;
		for(Zipcode z1:l)
		{
			if(zipcode==(z1.getZipcode()))
					{
				         status=true;
				       return z1.getCity()+z1.getState()+z1.getCountry();
				       
				     
					}
			else {
				     status=false;
				     
			}
		}
		return "Enter valid zipcode";
		
		
		
		
		
	}
}
