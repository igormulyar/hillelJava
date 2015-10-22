package less08oct15Inheritance;

import java.util.Objects;

/**
 * Created by IMulyar on 05.10.2015.
 */
public class Zoo {
    public static void main(String[] args) {
        Cat tomCat1 = new Cat(true, 3, "Tom", "blue-gray");


        //System.out.println(tomCat1.makeSound());

        // Animal animal = new Animal(); - ERROR because Animal is ABSTRACT
        Cat cat = new Cat();
        Animal animalCat = new Cat(); // can call only methods from superClass

    }

    public static void someCode(Animal animalCat) {
        String sound = animalCat.makeSound();
        System.out.println("cat as animal: " + sound);
        Object cat3 = new Cat();

        Object cat1 = new Cat(true, 3, "Tom", "blue-gray");
        Object cat2 = new Cat(true, 3, "Tom", "blue-gray");

        System.out.println("polymorphic equals: " + cat1.equals(cat2));

        Object[] objects = new Object[3];
        objects[0] = "some tring";
        objects[1] = new Cat(true, 3, "Tom", "blue-gray");
        objects[2] = System.in;

        for (Object o : objects){
            System.out.println(o.toString());
        }
    }

    public static void referenceComparation() {
        Cat tomCat1 = new Cat(true, 3, "Tom", "blue-gray");
        Cat tomCat2 = new Cat(true, 3, "Tom", "blue-gray");

        System.out.println(tomCat1==tomCat2);
        System.out.println(tomCat1==tomCat2);
    }

    public static void catCreation() {
        if (Cat.domestic){
            System.out.println("cat is domestic animal");
        }
        if (Cat.predator){
            System.out.println("cat is predator");
        }

        Cat tomCat = new Cat(true, 3, "Tom", "blue-gray");
        Cat mursik = new Cat(true, 4, "Mursik", "black");

        Cat cat = new Cat();
        System.out.println("cats name: "+ cat.getName());
        System.out.println("cat is pet: "+ cat.isPet());
        System.out.println("cats age is; "+cat.getAge());


        System.out.println(tomCat.getName());
        System.out.println(mursik.getAge());
        System.out.println("Predator? -"+ Cat.predator);
    }

}
