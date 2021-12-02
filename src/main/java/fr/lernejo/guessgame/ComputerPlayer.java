package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.util.Scanner;

public class ComputerPlayer implements Player {
    Logger logger = LoggerFactory.getLogger("player");
    boolean Starting = true;
    boolean lowerOrGreater = false;
    long nextGuess = 50;
    long bsupp  = 100; //borne supp
    long binf = 0; //borne inf

    @Override
    public long askNextGuess() {
        logger.log(String.valueOf(this.nextGuess));
        if (this.Starting){
            this.Starting = false;
            return this.nextGuess;
        }
        else{
            if(this.lowerOrGreater){
                this.binf = (int) this.nextGuess;
            }
            else{
                this.bsupp = (int) this.nextGuess;
            }
            return (this.nextGuess = (this.binf + this.bsupp) / 2);
        }
    }

    @Override
    public void respond(boolean lowerOrGreater) {
        if(lowerOrGreater){
            this.lowerOrGreater = true;
            logger.log("Loupé robot! Le nombre est plus grand.");
        }
        else{
            this.lowerOrGreater = false;
            logger.log("Loupé robot! Le nombre est plus petit.");
        }
    }
}

