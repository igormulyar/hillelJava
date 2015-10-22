package less12oct15abstractionAndInterfaces;

/**
 * Created by IMulyar on 12.10.2015.
 */
public class Cat extends Animal {

    boolean pet;
    String color;


    @Override
    public String makeSound() {
        return "Meow";
    }


    public String toString(){
        String result = super.toString();
        result += " Cat(" +
                " pet= "+pet+
                ", color= '"+ color+ '\''+
                '}';
        return result;
    }
}
