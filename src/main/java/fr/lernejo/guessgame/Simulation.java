package fr.lernejo.guessgame;

import fr.lernejo.guessgame.Player;
import fr.lernejo.logger.ConsoleLogger;
import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;
import java.util.Scanner;

public class Simulation<player, numberToGuess> {

    private final Logger logger = LoggerFactory.getLogger("simulation");
    private final Player player;
    private long numberToGuess;

    public Simulation(Player player) {
        this.player = player;
    }

    public void initialize(long numberToGuess) {
        this.numberToGuess=numberToGuess;
    }

    /**
     * @return true if the player have guessed the right number
     */

    private boolean nextRound() {
        //TODO implement me
        logger.log("Rentre un nombre :");
        long nbr = player.askNextGuess();
        boolean lowerOrGreater;
        if(nbr == numberToGuess) {
            logger.log("Gagné !!! ");
            return true;
        }
        if(nbr < numberToGuess) {
            lowerOrGreater = true;
            player.respond(lowerOrGreater);
        }
        if(nbr > numberToGuess) {
                lowerOrGreater = false;
                player.respond(lowerOrGreater);
        }
        return false;
    }

    public void loopUntilPlayerSucceed() {
        while (!nextRound());
    }
}
