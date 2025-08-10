package com.ticket;

import java.io.Serializable;
import java.util.Random;

public class Ticket implements Serializable
{
	
	private int ticketId;
	private int ticketCost;
	private int distance;
	private String boardingPoint;
	private String destinationPoint;
	private int seatNo;
	private int userId; 
	
	Random r = new Random();
	
	public Ticket() {}


	public Ticket(int userId, int distance, String boardingPoint, String destinationPoint, int seatNo) {
	    this.userId = userId;
	    this.ticketId = r.nextInt(1234567);
	    this.distance = distance;
	    this.ticketCost = (distance * 2);
	    this.boardingPoint = boardingPoint;
	    this.destinationPoint = destinationPoint;
	    this.seatNo = seatNo;
	}

	public int getUserId() {
	    return userId;
	}


	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public int getTicketCost() {
		return ticketCost;
	}

	public void setTicketCost(int ticketCost) {
		this.ticketCost = ticketCost;
	}

	public String getBoardingPoint() {
		return boardingPoint;
	}

	public void setBoardingPoint(String boardingPoint) {
		this.boardingPoint = boardingPoint;
	}

	public String getDestinationPoint() {
		return destinationPoint;
	}

	public void setDestinationPoint(String destinationPoint) {
		this.destinationPoint = destinationPoint;
	}

	public int getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}

	public int getTicketId() {
		return ticketId;
	}

	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", ticketCost=" + ticketCost + ", boardingPoint=" + boardingPoint
				+ ", destinationPoint=" + destinationPoint + ", seatNo=" + seatNo + "]";
	}
	
	public void displayTicketInfo()
	{
		System.out.println("\n============= TICKET-INFORMATION =============");
		System.out.println("Ticket Id          : "+getTicketId());
		System.out.println("Ticket Cost        : "+getTicketCost());
		System.out.println("Seat Number        : "+getSeatNo());
		System.out.println("Boarding Point     : "+getBoardingPoint());
		System.out.println("Destination Point  : "+getDestinationPoint());
		System.out.println("----------------------------------------------");
	}
	
	



}
