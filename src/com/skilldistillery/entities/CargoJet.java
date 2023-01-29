package com.skilldistillery.entities;

public class CargoJet extends Jet implements CargoCarrier{//cargo jet class

	public CargoJet(String type, String model, int range, double speed, double price) {
		super(type, model, range, speed, price);
	}
	
	public CargoJet() {
		
	}
	
	public void loadCargo() {
		System.out.println("Cargo has been loaded");
		
	}
}
