package com.skilldistillery.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Airfield {

	Scanner input = new Scanner(System.in);


	protected List<Jet> fleet = new ArrayList<>();

	public Airfield() {

	}

	public List<Jet> putJetsIntoListFromText() {

		Jet jet = null;
		try (BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt"))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] splitLine = line.split(",");
				String type = splitLine[0];
				String model = splitLine[1];
				int range = Integer.parseInt(splitLine[2]);
				int speed = Integer.parseInt(splitLine[3]);
				double price = Double.parseDouble(splitLine[4]);

				if (type.equals("FighterJet")) {
					jet = new FighterJet(type, model, speed, range, price);
					fleet.add(jet);
				}
				if (type.equals("CargoPlane")) {
					jet = new CargoJet(type, model, speed, range, price);
					fleet.add(jet);
				}

			}
		} catch (IOException e) {
			System.err.println(e);
		}
		return fleet;

	}

	public void displayFleet() {
		for (int i = 0; i < fleet.size(); i++) {
			System.out.println("Fleet Index Number: " + i + " " + fleet.get(i));
		}
	}

	public void showFastestJet() {
		Jet fastestJet = fleet.get(0);
		double highest = 0;
		for (int i = 0; i < fleet.size(); i++) {
			if (fleet.get(i).speed > highest) {
				highest = fleet.get(i).speed;
			}
			fastestJet = fleet.get(i);
		}
		System.out.println("The Fastest Jet is: " + fastestJet.toString());

	}

	public void showJetWithLongestRange() {
		Jet longRange = fleet.get(0);
		double longest = 0;
		for (int i = 0; i < fleet.size(); i++) {
			if (fleet.get(i).range > longest) {
				longest = fleet.get(i).range;
				longRange = fleet.get(i);
			}
		}
		System.out.println("Jet with the Longest Range is: " + longRange.toString());

	}

	public void fly() {

		for (int i = 0; i < fleet.size(); i++) {
			fleet.get(i).fly();
		}
	}

	public void addJetToFleet() {
		Jet userJet = new JetImpl();
		System.out.println("Please enter Jet Model");
		userJet.model = input.next();
		System.out.println("Please enter Jet's max Speed");
		userJet.speed = input.nextDouble();
		System.out.println("Please enter Jet's Range");
		userJet.range = input.nextInt();
		System.out.println("Please enter Jet's price");
		userJet.price = input.nextDouble();
		fleet.add(fleet.size(), userJet);
	}

	public void removeJetFromFleet() {
		System.out.println("Please enter index of Jet you would like to remove from Fleet");
		fleet.remove(input.nextInt());

	}

	public void printLoadingMissiles() {
		for (int i = 0; i < fleet.size(); i++) {
			if (fleet.get(i) instanceof CombatReady) {
				System.out.println(fleet.get(i));
				fleet.get(i).printLoadingMissiles();
			}
		}
	}

	public void loadingCargo() {
		for (int i = 0; i < fleet.size(); i++) {
			if (fleet.get(i) instanceof CargoCarrier) {
				System.out.println(fleet.get(i));
				fleet.get(i).loadCargo();
			}
		}
	}
}
