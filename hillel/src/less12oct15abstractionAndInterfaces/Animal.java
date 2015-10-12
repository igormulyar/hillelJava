package less12oct15abstractionAndInterfaces;


import java.io.Serializable;
import java.util.Arrays;

/**
 * Created by IMulyar on 12.10.2015.
 */

public abstract class  Animal implements Vaccinable, Serializable {

    String name;
    int age;
    private String [] vaccines = new String [3];
    private int vaccineCounter = 0;

    public void vaccinate (String vaccine){
        vaccines [vaccineCounter] = vaccine;
        vaccineCounter++;
    }

    @Override
    public String toString (){
        String result = "name: "+name;
        result += " age: "+ age;
        result += " vaccines: "+ Arrays.toString(vaccines);
        return result;
    }

    public abstract String makeSound();
}
