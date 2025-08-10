package com.myapp;

import java.util.Scanner;

import com.ticket.Ticket;
import com.user.User;

public class MainClass 
{

public static void main(String[] args) 
{
	Scanner sc = new Scanner(System.in);
	TicketBookingSystem tbs = new TicketBookingSystem();
	
	System.out.println("\n=========== WELCOME TO TICKET-BOOKING  ===========");	
	boolean status=true;
	while(status)
	{
		System.out.println("\n1.Add User.\n2.Show User.\n3.Book Ticket.\n4.Show Ticket.\n5.Change Boarding-Point.\n6.Change Destination-Point.\n7.Cancel Ticket.\n8.Remove User.\n9.Exit.");
		System.out.print("\nEnter Your Choice : ");
		int choice = sc.nextInt();
		switch (choice) 
		{
		case 1:
			System.out.println("Enter User Id : ");
			int userId = sc.nextInt();
			System.out.println("Enter The User Name : ");
			sc.nextLine();
			String userName = sc.nextLine();
			System.out.println("Enter Your Age : ");
			int age = sc.nextInt();
			System.out.println("Enter Gender : ");
			String gender = sc.next();
			System.out.println("Enter Mobile Number : ");
			long mobileNo = sc.nextLong();
			tbs.createUser(new User(userId, userName, age, gender, mobileNo));
			break;
		case 2:
			tbs.showUser();
			break;
		case 3:
				System.out.println("Enter User Id : ");
				int userId1 = sc.nextInt();
				System.out.println("Enter Boarding Point : ");
				String bordingPoint = sc.next();
				System.out.println("Enter destination Point : ");
				String destinationPoint = sc.next();
				System.out.println("Enter The Distance : ");
				int distance = sc.nextInt();
				System.out.println("Enter Seat No : ");
				int seatNo = sc.nextInt();
				tbs.bookTicket(userId1, new Ticket(userId1, distance, bordingPoint, destinationPoint, seatNo));
			break;
		case 4:
				System.out.println("Enter User Id : ");
				int userId2 = sc.nextInt();
				tbs.showTicketInfo(userId2);
			break;
		case 5:
			System.out.println("Enter User Id : ");
			int userId3 = sc.nextInt();
			System.out.println("Enter Ticket Id : ");
			int ticketId1 = sc.nextInt();
			System.out.println("Enter New Boarding Point : ");
			String newBoardingPoint = sc.next();
			tbs.changeBoardingPoint(userId3, ticketId1, newBoardingPoint);
			break;
		case 6:
			System.out.println("Enter User Id : ");
			int userId4 = sc.nextInt();
			System.out.println("Enter Ticket Id : ");
			int ticketId2 = sc.nextInt();
			System.out.println("Enter New Destination Point : ");
			String newDestinationPoint = sc.next();
			tbs.changeBoardingPoint(userId4, ticketId2, newDestinationPoint);
			break;
		case 7:
			System.out.println("Enter User Id : ");
			int userId5 = sc.nextInt();
			System.out.println("Enter Ticket Id : ");
			int ticketId3 = sc.nextInt();
			tbs.cancelTicket(userId5, ticketId3);
			break;
		case 8:
			System.out.println("Enter User Id : ");
			int userId6 = sc.nextInt();
			tbs.removeUser(userId6);
			break;
		case 9:
			System.out.println("\nThank You...");
			status=false;
			break;

		default:
			System.err.println("Invalid Option");
			break;
		}
		
	}
sc.close();
}
}
