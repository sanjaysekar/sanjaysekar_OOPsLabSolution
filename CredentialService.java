package com.credentials.service;

import java.util.Random;

public class CredentialService {
	private String password ;
	private String emailaddr;
	private String deptName;
	public CredentialService(String firstName, String lastName , String deptName) {
		super();
		this.deptName = deptName;
	}
	
	String generatePassword() {
		int len =8;
		String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%&";
			Random rnd = new Random();
			StringBuilder sb = new StringBuilder(len);
			for (int i = 0; i < len; i++)
				sb.append(chars.charAt(rnd.nextInt(chars.length())));
			return sb.toString();
		}	
	
	String generateEmailAddress() {
		return getFirstName().toLowerCase()+"."+getFirstName().toLowerCase()+"@"+getDepartmentName()+"."+"abc.com";
	}
	
	private String getFirstName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String showCredentials () {
		System.out.println("Dear "+getFirstName()+" your generated credentials are as follows");
		System.out.println("Email -->"+generateEmailAddress());
		System.out.println("Password -->"+generatePassword());
		return password;
	}
	
	String getDepartmentName() {
		return this.deptName;
	}

	public String getEmailaddr() {
		return emailaddr;
	}

	public void setEmailaddr(String emailaddr) {
		this.emailaddr = emailaddr;
	}
	
	
}
