import java.net.SocketPermission;

/**
 * Created by IMulyar on 17.09.2015.
 */
public class MyFirstClass {

    public static void main(String[] args){
        sayHello();
        ageCalculation();
        int age = 30;
        someMethod(age);
        System.out.println();

    }

    private static void someMethod(int age) {
        System.out.println(age);
        age =50;
    }

    private static void ageCalculation() {
        int myBirthAge = 1990;
        int myAge=calculateAge(myBirthAge);
        System.out.println("My age is " +myAge);
        int alexAge = calculateAge(1981);
        System.out.println("Alexs age is "+alexAge);
    }

    public static void sayHello(){
        String helloMessage = "Hello world!";
        System.out.println(helloMessage);
    }

    public static int calculateAge (){
        final int birthYear=1990;
        int year = 2015;
        int age = year - birthYear;
        return age;
    }

    public static int calculateAge (final int birthYear){
        int year = 2015;
        int age = year - birthYear;
        return age;
    }
}
