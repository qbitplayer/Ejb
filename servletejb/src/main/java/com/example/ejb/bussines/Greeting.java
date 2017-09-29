package com.example.ejb.bussines;

import java.util.Date;

import javax.ejb.Stateless;

@Stateless
public class Greeting {

	
	public Greeting (){
		System.out.println("Constructor Greeting");
	}
	
	
	public String getGreeting(){
		Date date = new Date(System.currentTimeMillis()); 
		StringBuilder builder = new StringBuilder(); 
		builder.append("Esto es un EJB @Stateless, "); 
		builder.append(" llamda realizada a las ");
		builder.append(date.toString());
		
	 return builder.toString(); 	
	}
	


}
