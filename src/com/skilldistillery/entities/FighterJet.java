package com.skilldistillery.entities;

public class FighterJet extends Jet implements CombatReady{
	private double flightTime;
	
	public FighterJet(String type, String model, int range, double speed, double price) {//fighter jet class
		super(type, model, range, speed, price);
		
	}
	
	public FighterJet() {
		
	}
	
	public void fight() {
		System.out.println("Fight has Been Won!");
	}

	public double getFlightTime() {
		return flightTime;
	}

	public void setFlightTime() {
		this.flightTime = speed/range;
	}
	
	public void fly() {
		
	}
	
	public void printLoadingMissiles() {
		System.out.println("Loading missiles now...");
	}

} 
