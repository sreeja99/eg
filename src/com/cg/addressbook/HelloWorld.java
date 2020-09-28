package com.cg.addressbook;

import java.util.Scanner;

public class HelloWorld {

	
		private static final Scanner SC = new Scanner(System.in);

		public final strictfp static void main(String[] args) {

			System.out.println("Enter First Name: ");
			String firstName = SC.next();
			System.out.println("Enter Last Name: ");
			String lastName = SC.next();

			System.out.println("Welcome, " + firstName + "  " + lastName);
		}

	}

