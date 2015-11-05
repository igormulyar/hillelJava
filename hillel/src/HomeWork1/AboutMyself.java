package HomeWork1;

/**
 * Created by TRUST on 18.09.2015.
 */
public class AboutMyself {

    public static void main(String [] args){
        String name = "Igor";
        String surname = "Mulyar";
        int yearOfBirth = 1990;
        int currentYear = 2015;
        int age = currentYear-yearOfBirth;

        System.out.println(name + " " + surname);

        /* alternative solution:
        * String fullName = name+" "+surname";
        * System.out.println(fullName);
        *
        * one more:
        * System.out.display(name);
        * System.out.display(" ");
        * System.out.println(surname);
        *
        * and more:
        *System.out.println("Igor"+" "+"Mulyar");
         */
        System.out.println(age);
    }

}
