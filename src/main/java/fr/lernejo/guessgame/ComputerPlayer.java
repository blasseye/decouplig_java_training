package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.util.Scanner;

public class ComputerPlayer implements Player {
    Logger logger = LoggerFactory.getLogger("player");

    @Override
    public long askNextGuess() {
        long n =0;
        return(n);
    }

    @Override
    public void respond(boolean lowerOrGreater) {
        if(lowerOrGreater){
            logger.log("Loupé robot! Le nombre est plus grand.");
        }
        else{
            logger.log("Loupé robot! Le nombre est plus petit.");
        }
    }
}

