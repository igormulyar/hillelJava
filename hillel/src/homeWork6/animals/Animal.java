package homeWork6.animals;

/**
 * Created by igor on 10.10.15.
 */
public abstract class Animal {

    private int id;
    private int age;
    private int weigth;
    private String color;

    public Animal(int id) {
        this.id = id;
    }

    public abstract String makeNoise(); //{return "*some noise*";}

    public void move (){
        System.out.println("Moving");
    }


    // getters and setters:
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeigth() {
        return weigth;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }
}
