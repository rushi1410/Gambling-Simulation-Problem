package com.bridgelabz.GamblingProblem;

public class GamblingSimulation {

	static int DAILY_STAKE = 100;
	static int PER_DAY_BET = 1;
	static int win = 1;
	public static void main(String[] args) {
		System.out.println("Welcome To Gambling Simulation Problem");
		while(DAILY_STAKE<150 && DAILY_STAKE>50){
			int result = (int)(Math.random()*10)%2;
			if (result==win){
				DAILY_STAKE++;
				System.out.println("Won");
			}
			else{
				DAILY_STAKE--;
				System.out.println("lost");
			}
		}
		System.out.println(DAILY_STAKE  );

	}
}

