package com.bridgrlabz;

public class GamlingSimulationProblem {
    static int STAKE_PER_DAY = 100;
    static final int BET_PER_GAME = 1;

    static void CheckWinOrLoose() {
        int random = (int) (Math.random() * 2);
        if (random == 0) {
            System.out.println("Gambler won the Bet");
            STAKE_PER_DAY = STAKE_PER_DAY + BET_PER_GAME;
            System.out.println("Gambler Account Balance: " + STAKE_PER_DAY);
        } else {
            System.out.println("Gambler loose the Bet");
            STAKE_PER_DAY = STAKE_PER_DAY - BET_PER_GAME;
            System.out.println("Gambler Account Balance: " + STAKE_PER_DAY);
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Gamling Simulation Problem");
        CheckWinOrLoose();
    }
}
