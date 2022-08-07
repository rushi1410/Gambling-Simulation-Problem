package com.bridgelabz.GamblingProblem;


public class GamblingSimulation {

	static int DAILY_STAKE = 100;
	static int PER_DAY_BET = 1;
	public static void main(String[] args) {

		int StackIncrease = 150;
		int StackDecrease = 50;
		int win = 0;
		System.out.println("Welcome To Gambling Simulation Problem");
		System.out.println(" Daily Stack is " + DAILY_STAKE);
		System.out.println("Betting price is " +PER_DAY_BET);
		for (int day = 1; day <= 20; day++) {

			while (DAILY_STAKE > StackDecrease && DAILY_STAKE < StackIncrease) {
				double rand = Math.random();

				if (rand < 0.5) {
					System.out.println("win the bet and stack is " + (DAILY_STAKE +=PER_DAY_BET));
					win = win + 50;
					break;
				} else {
					System.out.println("Loss the bet and stack is " + (DAILY_STAKE -= PER_DAY_BET));
					win = win - 50;
					break;
				}
			}

			System.out.println("winning amount is " + win);

		}
		System.out.println(" final winning amount is " + win);

	}
}

