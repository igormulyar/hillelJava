package less08oct15Inheritance;

import java.util.Objects;

/**
 * Created by IMulyar on 05.10.2015.
 */
public class Cat extends Animal {
    public static final boolean domestic = true;
    public static final boolean predator = true;

    private boolean pet; // in default is false
    private String color;// in default is null

    public Cat (){
       // System.out.println("in empty constructor");
    }

    public Cat (boolean pet, int age, String name, String color){
        this.setPet(pet);
        this.setAge(age);
        this.setName(name);
        this.setColor(color);
    }

    @Override
    public String makeSound(){
        return "Meow!";
    }

    @Override
    public String toString() {
        return "Cat{" +
                "pet=" + pet +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals (Object otherObject){

        if (!(otherObject instanceof Cat)) return false;

        Cat otherCat = (Cat) otherObject;
        System.out.println("in cats equals method");
        if (pet != otherCat.pet)return false;
        if (age != otherCat.age) return false;
        if (!name.equals(otherCat.name)) return false;
        if (!color.equals(otherCat.color)) return false;
        return true;
    }









    // getters & setters
    public boolean isPet() {
        return pet;
    }

    public void setPet(boolean pet) {
        this.pet = pet;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
