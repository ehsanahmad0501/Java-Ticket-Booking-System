package com.myapp;

import java.util.ArrayList;
import java.util.Iterator;

import com.ticket.Ticket;
import com.user.User;

public class TicketBookingSystem 
{
	private ArrayList<User> users = new ArrayList<User>();
	private ArrayList<Ticket> tickets = new ArrayList<Ticket>();
	
	// 	CREATING USER
	public void createUser(User u)
	{
		users.add(u);
		System.out.println("\n"+u.getUserName()+" 's account was created successfull...");
	}
	
	// DISPLAYING USER INFO
	public void showUser()
	{
		if(users.isEmpty())
			System.err.println("NO USER ARE ADDED");
		else
		{
			for (User u : users) 
			{
				u.displayUserInfo();
			}
		}
			
	}
	
	// DISPLAYING USER INFO BY ID
	public User getUserById(int userId)
	{
		if(users.isEmpty())
			System.err.println("NO USER ARE ADDED");
		else 
		{
			for (User u : users) 
			{
				if(u.getUserId()==userId)
					return u;
			}
		}
			
		return null;
		
	}
	
	// BOOKING TICKET
	public void bookTicket(int userId, Ticket t)
	{
		if(users.isEmpty())
			System.err.println("NO TICKET IS BOOKED YET");
		else
		{
			User u = getUserById(userId);
			if(u.getUserId()==userId)
			{
				tickets.add(t);
				System.out.println(u.getUserName()+" is Booked the ticket successfully...");
				System.out.println("Ticket ID : "+t.getTicketId());
				System.out.println();
			}
		}
	}
	
	// DISPLAYING TICKET INFO 
	public void showTicketInfo(int userId)
	{
	    boolean found = false;
	    for (Ticket t : tickets) 
	    {
	        if (t.getUserId() == userId) 
	        {
	            t.displayTicketInfo();
	            found = true;
	        }
	    }
	    if (!found) {
	        System.err.println("No ticket found for User ID: " + userId);
	    }
	}

	
	// DISPLAYING TICKET INFO BY TICKET-ID
	public Ticket getTicketById(int ticketId)
	{
		if(tickets.isEmpty())
			System.err.println("NO TICKET BOOKED YET");
		else 
		{
			for (Ticket t : tickets) 
			{
				if(t.getTicketId()==ticketId)
					return t;
			}
		}
		return null;	
	}
	
	// CHANGING DESTINATION POINT
	public void changeDestinationPoint(int userId, int ticketId, String newDestinationPoint)
	{
		if(users.isEmpty())
			System.err.println("NO USER ARE ADDED");
		else
			{
			User u = getUserById(userId);
			if(u.getUserId()==userId)
			{
				Ticket t = getTicketById(ticketId);
				if(t.getTicketId()==ticketId)
				{
					t.setDestinationPoint(newDestinationPoint);
					System.out.println("\nNew Destination Point Is : "+newDestinationPoint);
				}
			}
			}
		
	}
	// CHANGING BOARDING POINT
	public void changeBoardingPoint(int userId, int ticketId, String newBoardingPoint)
	{
		if(users.isEmpty())
			System.err.println("NO USER ARE ADDED");
		else
			{
			User u = getUserById(userId);
			if(u.getUserId()==userId)
			{
				Ticket t = getTicketById(ticketId);
				if(t.getTicketId()==ticketId)
				{
					t.setBoardingPoint(newBoardingPoint);
					System.out.println("\nNew Boarding Point Is : "+newBoardingPoint);
				}
			}
			}
			
		}
	// CANCEL TICKET 
	public void cancelTicket(int userId, int ticketId)
	{
		if(users.isEmpty())
			System.err.println("NO USER ARE ADDED");
		else {
			User u = getUserById(userId);
			if(u.getUserId()==userId)
			{
				Ticket t = getTicketById(ticketId);
				if(t.getTicketId()==ticketId)
				{
					Iterator<Ticket> it = tickets.iterator();
					while (it.hasNext()) 
					{
						Ticket t1 = it.next();
						if(t1.getTicketId()==ticketId)
						it.remove();
					}
					System.out.println(ticketId+" is cancelled");
				}else
					System.err.println("INVALID TICKET-ID");
			}else
				System.err.println("INVALID USER-ID");
		}
	}
	// REMOVE USER 
	public void removeUser(int userId)
	{
		if(users.isEmpty())
			System.err.println("NO USER ARE ADDED");
		else {
			User u = getUserById(userId);
			if(u.getUserId()==userId)
			{
				
					Iterator<User> iu = users.iterator();
					while (iu.hasNext()) 
					{
						User u1 = iu.next();
						if(u1.getUserId()==userId)
						iu.remove();
					}
					System.out.println(userId+" is removed successfully");
				
			}else
				System.err.println("INVALID USER-ID");
		}
	}
	
}
