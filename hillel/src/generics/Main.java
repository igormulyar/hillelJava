package generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by IMulyar on 03.12.2015.
 */
public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("ivan", 4500));
        employeeList.add(new Manager("Petro", 5500));
        print(employeeList);


        List<Manager> managerList = new ArrayList<>();
        employeeList.add(new Manager("ivan", 4500));
        employeeList.add(new Manager("Petro", 5500));
        print(managerList);

        addEmployee(employeeList);
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Alex"));

        addEmployee(personList);
        addEmployee(employeeList);
        //addEmployee(managerList); - doesn't work
    }

    public static void print (List<? extends Employee> list){   ///   <------  feature here <? extends Type>
         for (Employee e : list){
            System.out.println(e);
        }
        //list.add(new Employee("ivan", 12))  - doesn't work
    }

    public static void addEmployee (List< ? super Employee> list){ ///   <------  feature here < ? super Employee>
        list.add( new Employee("ivan", 500));
        Object e = list.get(0); //  - BULLSHIT, because type is Object
    }

    private static void rawTypeExample() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("ivan", 4500));
        employeeList.add(new Manager("Petro", 5500));
        printEmployees(employeeList);
        List personList = employeeList; //  - BULLSHIT, because <Object> = <Employee>
        printPersons(personList);
        personList.add(new Person("Anatoliy"));
        printPersons(personList);
        printEmployees(employeeList);
    }

    private static void printEmployees(List<Employee> employeeList) {
        for (Employee e : employeeList){
            System.out.println(e);
        }
    }

    private static void printPersons(List personList) {
        for (Object o : personList){
            Person p = (Person) o;
            System.out.println(p);
        }
    }

    private static void simpleExamples() {
        Employee e = new Manager("Ivan", 800);
        ArrayList<Employee> arrayList = new ArrayList<>();
        List<Employee> employeeList = arrayList;
        Collection<Employee> collection = employeeList;
        //list.add(new Person("ivan")) - doesn't work'
        employeeList.add(new Employee("ivan", 500));
        employeeList.add(new Employee("Petro", 1000));
        Person p = new Employee("ivan", 500);
        List personList = employeeList;
    }

    private static void pairExample() {
        List<Person> list = new ArrayList<>();

        list.add(new Person("Vasya"));
        //list.add(new Object());

        Person vasya = (Person)list.get(0);
        Object o = list.get(1);


        list.add(new Employee("Petr", 10));


        Pair<Employee, Manager> pair = new Pair<>();
        Employee e =  pair.key;
        Manager m = pair.value;
    }
}
