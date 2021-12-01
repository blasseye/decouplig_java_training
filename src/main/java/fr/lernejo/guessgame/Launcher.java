package fr.lernejo.guessgame;

import java.security.SecureRandom;

public class Launcher {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        long random_Number = random.nextInt(100); // génère un nombre entre 0 (inclus) et 100 (exclus)
        HumanPlayer Benjamin = new HumanPlayer();
        Simulation simulation = new Simulation(Benjamin);
        simulation.initialize(random_Number);
        simulation.loopUntilPlayerSucceed();

    }
}
