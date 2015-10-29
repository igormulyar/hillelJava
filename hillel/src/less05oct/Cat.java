package less05oct;

import java.util.Comparator;

/**
 * Created by IMulyar on 05.10.2015.
 */
public class Cat implements Comparable<Cat> {
    public static final boolean domestic = true;
    public static final boolean predator = true;

    private boolean pet; // in default is false
    private int age; // in default is 0
    private String name; // in default is null
    private String color;

    public Cat (){
        System.out.println("in empty constructor");
    }

    public Cat (boolean pet, int age, String name, String color){
        this.setPet(pet);
        this.setAge(age);
        this.setName(name);
        this.setColor(color);
    }


    public boolean equals (Cat other){
        if (pet != other.pet)return false;
        if (age != other.age) return false;
        if (!name.equals(other.name)) return false;
        if (!color.equals(other.color)) return false;
        return true;
    }

    @Override
    public int compareTo(Cat o){
        if(this.equals(o)){
            return 0;
        }
        return this.name.compareTo(o.getName());
    }


    @Override
    public String toString() {
        return "Cat{" +
                "pet=" + pet +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
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
