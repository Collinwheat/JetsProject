package com.skilldistillery.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.entities.Airfield;
import com.skilldistillery.entities.CargoJet;
import com.skilldistillery.entities.CombatReady;
import com.skilldistillery.entities.FighterJet;
import com.skilldistillery.entities.Jet;

public class JetsApp {

	Airfield airport = new Airfield();
	Jet jet;
	FighterJet fj = new FighterJet();

	private Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		JetsApp ja = new JetsApp();
		ja.launch();
	}

	public void launch() {
		airport.putJetsIntoListFromText();

		for (;;) {
			displayMenu();
			System.out.println("Please input a number for which selection you would like to make : ");
			String answer = input.next();
			switch (answer) {
			case "1":
				option1();
				continue;
			case "2":
				option2();
				continue;
			case "3":
				option3();
				continue;
			case "4":
				option4();
				continue;
			case "5": 
				option5();
				continue;
			case "6": 
				option6();
				continue;
			case "7":
				option7();
				continue;
			case "8": 
				option8();
				continue;
			case "9": 
				option9();
			}
		break;
		}

	}

	private void displayMenu() {
		System.out.println("|-------------------------------------------|");
		System.out.println("|                 1. List Jets              |");
		System.out.println("|                2. Fly All Jets            |");
		System.out.println("|              3. View Fastest Jet          |");
		System.out.println("|         4. View Jet with Longest Range    |");
		System.out.println("|             5. Load All Cargo Jets        |");
		System.out.println("|                 6. Dogfight!              |");
		System.out.println("|            7. Add A Jet to Fleet          |");
		System.out.println("|          8. Remove A Jet from Fleet       |");
		System.out.println("|                    9. Quit                |");
		System.out.println("|-------------------------------------------|");
	}

	private void option1() {
		airport.displayFleet();
	}

	private void option2() {
		airport.fly();

	}

	private void option3() {
		airport.showFastestJet();
	}
	
	private void option4() {
		airport.showJetWithLongestRange();
	}
	
	private void option5() {
		airport.loadingCargo();
	}
	private void option6() {
		airport.printLoadingMissiles();
		
	}
	private void option7() {
		airport.addJetToFleet();
	}
	private void option8() {
		airport.removeJetFromFleet();
	}
	private void option9() {
		System.out.println("Goodbye!");
	
	}
	
	
}
