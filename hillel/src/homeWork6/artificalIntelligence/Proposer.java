package homeWork6.artificalIntelligence;

/**
 * Created by igor on 11.10.15.
 */

public class Proposer {

    private final int randNumb;

    public Proposer (){
        this.randNumb = (int) (Math.random() * 100 + 1);
    }

    public int getRandNumb (){
        return randNumb;
    }

    public boolean equals (int tryNumb){
        return randNumb == tryNumb;
    }

    public boolean pIsGreaterThanG (int tryNumb){
        return randNumb > tryNumb;
    }

}
