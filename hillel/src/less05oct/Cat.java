package less05oct;

/**
 * Created by IMulyar on 05.10.2015.
 */
public class Cat {
    public static final boolean domestic = true;
    public static final boolean predator = true;

    private boolean pet; // in default is
    private int age;
    private String name;
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
