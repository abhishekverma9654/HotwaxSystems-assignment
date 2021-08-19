package dataModel;

import java.util.ArrayList;
import java.util.HashMap;

public class Userdata {
	private String FirstName=null,LastName=null,Address,City,State,Country,Zip,Phone,UserId,Password;
	private int pid;
	
	//Setter Methods
	public void setPid(int pid) {
		this.pid=pid;
	}
	public void setFname(String FirstName) {
		this.FirstName=FirstName;
	}
	public void setLname(String LastName) {
		this.LastName=LastName;
	}
	public void setAddress (String Address) {
		this.Address=Address;
	}
	public void setCity(String City) {
		this.City=City;
	}
	public void setState(String State) {
		this.State=State;
	}
	public void setCountry(String Country) {
		this.Country=Country;
	}
	public void setZip(String Zip) {
		this.Zip=Zip;
	}
	public void setPhone(String Phone) {
		this.Phone=Phone;
	}
	public void setUserid(String UserId) {
		this.UserId=UserId;
	}
	public void setPassword(String Password) {
		this.Password=Password;
	}
	
	//Getter Methods
	public int getPid() {
		return pid;
	}
	public String getFname() {
		return FirstName;
	}
	public String getLname() {
		return LastName;
	}
	public String getAddress () {
		return Address;
	}
	public String getCity() {
		return City;
	}
	public String getState() {
		return State;
	}
	public String getCountry() {
		return Country;
	}
	public String getZip() {
		return Zip;
	}
	public String getPhone() {
		return Phone;
	}
	public String getUserid() {
		return UserId;
	}
	public String getPassword() {
		return Password;
	}
	
//	System.out.println(((ArrayList<HashMap>) list).get(1).get("Zip"));
	
}
