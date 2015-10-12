package less12oct15abstractionAndInterfaces;

import java.util.Objects;

/**
 * Created by IMulyar on 12.10.2015.
 */
public class AbstractZooExample {
    public static void main(String[] args) {

        printSound(new Cat());
        printSound(new Dog());
        Cat cat = new Cat();
        Dog dog = new Dog();
        Employee employee = new Employee();
        vaccinate(cat);
        vaccinate(dog);
        vaccinate(employee);

        System.out.println(cat);
        System.out.println(dog);
        System.out.println(employee);

        Employee employee1 = new Employee();
        Human human = employee1;
        Object object = human;
        Vaccinable vaccinable = employee1;



    }

    public static void vaccinate(Vaccinable animalOfEmployee){
        animalOfEmployee.vaccinate("ASD-1");
    }

    public  static  void printSound (Animal animal){
        System.out.println(animal.makeSound());
    }
}
