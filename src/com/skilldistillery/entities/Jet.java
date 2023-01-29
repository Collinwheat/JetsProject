package com.skilldistillery.entities;

import java.util.Objects;


public abstract class Jet implements CombatReady, CargoCarrier{	//class which all jets are based off of / need to reference
	protected String model;
	protected String type;
	protected double speed;
	protected int range;
	protected double price;
	
	
	
	public Jet(String type, String model, int range, double speed, double price) {
		this.type = type;
		this.model = model;
		this.range = range;
		this.speed = speed;
		this.price = price;
		
	}
	public Jet() {
		
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Jet [model=" + model + ", speed=" + speed + ", range=" + range + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(model, price, range, speed);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jet other = (Jet) obj;
		return Objects.equals(model, other.model)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price) && range == other.range
				&& speed == other.speed;
	}
	
	public void fly() {
		
		//display how much time the jet can fly for on a full tank
	}
	
	public double getSpeedInMach() {
		
		double speedInMach = speed / 762.1;
		return speedInMach;
	}
}
