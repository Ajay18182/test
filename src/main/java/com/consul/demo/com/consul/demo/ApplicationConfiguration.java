package com.consul.demo.com.consul.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ApplicationConfiguration {
	
	
	@Value("${message}")
	private String message;
	
	
	  @Value("${server}") private String server;
	  
	  @Value("${username}") private String userName;
	  
	  @Value("${password}") private String password;
	 
	

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
	  public String getServer() { return server; }
	  
	  public void setServer(String server) { this.server = server; }
	  
	  public String getUserName() { return userName; }
	  
	  public void setUserName(String userName) { this.userName = userName; }
	  
	  public String getPassword() { return password; }
	  
	  public void setPassword(String password) { this.password = password; }
	  
	  @Override public String toString() { return
	  "ApplicationConfiguration [message=" + message + ", server=" + server +
	  ", userName=" + userName + ", password=" + password + "]"; }
	 

	

}
