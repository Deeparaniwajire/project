package com.manh.mainPack;

import java.util.Scanner;



public class Main {

	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		try
		{
			
		
		while(true){
			System.out.println("1. Logged in as Admin");
			System.out.println("2. Logged in as Customer ");
			System.out.println("3. Exit");
			
			
			System.out.println("Enter your choice*******");
			
			     int choice = scanner.nextInt();
				
				switch (choice) {
				case 1:
				{
					UserModule.userModule();
					break;
				}
				case 2:
				{
					
						//CustUser.custModule();
					
				    break;
				}
				
				default:
					System.exit(0);
				
			}
			
		}
		}finally
		{
			scanner.close();
		}

			
	}
	}
	

