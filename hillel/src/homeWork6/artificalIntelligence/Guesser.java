package homeWork6.artificalIntelligence;

/**
 * Created by igor on 11.10.15.
 */
// Danger! GovnoCode detected!
public class Guesser {
    int guessNumber;
    int range;
    int lowerLimit;
    int upperLimit;

    public Guesser (){
        this.guessNumber = (int) (Math.random()*100+1);
        this.upperLimit = 100;
    }

    public int getGuessNumber () {
        return guessNumber;
    }

    public int generateNewAnswer (boolean pIsGreaterThanG){
        if (pIsGreaterThanG){
            lowerLimit = guessNumber;
            range = upperLimit-guessNumber;
            guessNumber = (int) (Math.random() * range + lowerLimit);
            return guessNumber;
        } else {
            upperLimit = guessNumber;
            range = guessNumber-lowerLimit;
            guessNumber = (int) (Math.random() * range + lowerLimit);
            return guessNumber;
        }
    }

    }

