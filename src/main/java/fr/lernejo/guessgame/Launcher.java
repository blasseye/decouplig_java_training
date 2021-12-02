package fr.lernejo.guessgame;

import java.security.SecureRandom;

public class Launcher {
    public static void main(String[] args) {
        try {
            if (args[0].equals("-interactive")) {
                SecureRandom random = new SecureRandom();
                long random_Number = random.nextInt(100);
                HumanPlayer Benjamin = new HumanPlayer();
                Simulation simulation = new Simulation(Benjamin);
                simulation.initialize(random_Number);
                simulation.loopUntilPlayerSucceed(10);
            }
            if (args[0].equals("-auto")) {
                try {
                    int i = Integer.parseInt(args[1]);
                    SecureRandom random = new SecureRandom();
                    long random_Number = random.nextInt(i);
                    ComputerPlayer robot = new ComputerPlayer();
                    Simulation simulation = new Simulation(robot);
                    simulation.initialize(random_Number);
                    simulation.loopUntilPlayerSucceed(100);
                }
                catch (Exception r){
                    System.out.println("Probème sur le deuxieme argument");

                }

            }
        }
            catch (Exception e){
                System.out.println("Probème d'argument");
            }
        }
    }

