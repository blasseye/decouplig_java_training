package fr.lernejo.guessgame;

import java.security.SecureRandom;
import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {

        if(args[1].equals("-interactive"))
        {
            SecureRandom random = new SecureRandom();
            long random_Number = random.nextInt(100);
            HumanPlayer Benjamin = new HumanPlayer();
            Simulation simulation = new Simulation(Benjamin);
            simulation.initialize(random_Number);
            simulation.loopUntilPlayerSucceed(10);
        }
        if(args[1].equals("-auto"))
        {
            try {
                int i = Integer.parseInt(args[2]);
                SecureRandom random = new SecureRandom();
                long random_Number = random.nextInt(i);
                ComputerPlayer robot = new ComputerPlayer();
                Simulation simulation = new Simulation(robot);
                simulation.initialize(random_Number);
                simulation.loopUntilPlayerSucceed(100);
            }
            catch (Exception e) {
                System.out.println("Pour utiliser la fonction -auto il faut un entier en 2nd argument.");
            }
        }
        else{
            System.out.println("Il faut introduire un argument.\n   -interactive\n   -auto [int]");
        }
    }
}
