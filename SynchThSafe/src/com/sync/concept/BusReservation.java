package com.sync.concept;

public class BusReservation implements Runnable{

	private int totalSeatsAvailable=2;
	@Override
	public void run() {
		PassengerThread pt=(PassengerThread)Thread.currentThread();
		
		boolean ticketsBooked=this.bookTickets(pt.getSeatsNeeded(),pt.getName());
		if(ticketsBooked==true)
		{
			System.out.println("Congrats "+Thread.currentThread().getName()+" The no of seats requsted is "+pt.getSeatsNeeded()+") are booked");
		}
		else {
		System.out.println("Sorry Mr."+Thread.currentThread().getName()+" the no of seats requested("+pt.getSeatsNeeded()+") are not available");	
		}
	}
	public	boolean bookTickets(int seats, String name)
		{
			System.out.println("Welcome to Happy Bus "+Thread.currentThread().getName()+" Number of tickets Available are "+this.getTotalSeatsAvailable());
			if(seats>this.getTotalSeatsAvailable())
			{
				return false;
				
			}else {
				totalSeatsAvailable=totalSeatsAvailable-seats;
				return true;
			      }
			
		}
		private int getTotalSeatsAvailable()
		{
			
			return totalSeatsAvailable;
		}
		
	
	}
	


