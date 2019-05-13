package com.sync.concept;

public class HappyBus {
	public static void main(String[] args) {
	BusReservation br=new BusReservation();
    PassengerThread pt1=new PassengerThread(2, br, "Juned");
    PassengerThread pt2=new PassengerThread(2, br, "Khushi");
    pt1.start();
    pt2.start();
	}
}