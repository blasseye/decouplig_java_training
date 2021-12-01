package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.util.Scanner;

public class HumanPlayer implements Player {
    Logger logger = LoggerFactory.getLogger("player");

    @Override
    public long askNextGuess() {
        Scanner index = new java.util.Scanner(System.in);
        long n = Integer.parseInt(index.nextLine());
        return(n);
    }

    @Override
    public void respond(boolean lowerOrGreater) {
        if(lowerOrGreater){
            logger.log("Loupé ! Le nombre est plus grand.");
        }
        else{
            logger.log("Loupé ! Le nombre est plus petit.");
        }
    }
}
