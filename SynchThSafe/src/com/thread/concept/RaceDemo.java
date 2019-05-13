package com.thread.concept;

public class RaceDemo
{
	public static void main(String[] args) {
	Racer racer=new Racer();
	Thread tortoiseThread=new Thread(racer,"tortoise");
	Thread hareThread=new Thread(racer,"hare");
	tortoiseThread.start();
	hareThread.start();

}
}