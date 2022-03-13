package com.credentials.main;

import java.util.Scanner;

import com.credentials.service.CredentialService;

public class Driver {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Please enter the department from the following");
			System.out.println("1. Technical");
			System.out.println("2. Admin");
			System.out.println("3. Human Resource");
			System.out.println("4. Legal");
			int n = s.nextInt();
			s.nextLine();
			System.out.println("\nEnter first Name :");
			String firstName = s.nextLine();
			System.out.println("\nEnter LastName :");
			String lastName = s.nextLine();
			CredentialService cs;
			switch(n) {
			case 1: 
				cs =  new CredentialService(firstName, lastName, "tech");
				cs.showCredentials();
				break;
			case 2:
				cs =  new CredentialService(firstName, firstName, "admin");
				cs.showCredentials();
				break;
			case 3:
				cs =  new CredentialService(firstName, firstName, "hr");
				cs.showCredentials();
				break;
			case 4:
				 cs =  new CredentialService(firstName, firstName, "legal");
				 cs.showCredentials();
				 break;
			default:
				System.out.println("Department is not present");
			}
		}
		
	}
}