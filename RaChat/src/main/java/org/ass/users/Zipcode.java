package org.ass.users;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Zipcode {

	private int zipcode;
	private String city;
	private String state;
	private String country;
	public Zipcode()
	{
		
	}
	public Zipcode(int zipcode, String city, String state, String country) {
		super();
		this.zipcode = zipcode;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
}
