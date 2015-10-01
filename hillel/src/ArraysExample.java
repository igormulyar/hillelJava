import java.util.Scanner;

/**
 * Created by IMulyar on 01.10.2015.
 */
public class ArraysExample {
    public static void main(String[] args) {
        int [] intArray = new int [5];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i<intArray.length; i++){
            intArray[i]=scanner.nextInt();
        }

        for(int i = 0; i<intArray.length; i++){
            System.out.println("Value in ["+i+"] is "+ intArray[i]);
        }

        //FOR-EACH LOOP
        for (int value : intArray){
            System.out.println("value: "+ value);
        }

    }

    public static void arraysInit() {
        int[] ints = {1, 5, 4, 6, 5};

        int ints2[] = {2, 5, 4, 6, 8};

        int value = ints[2];

        System.out.println(value);

        int inputValues[] = new int[3];

        Scanner scanner = new Scanner(System.in);


        inputValues[0] = scanner.nextInt();
        inputValues[1] = scanner.nextInt();
        inputValues[2] = scanner.nextInt();

        System.out.println("first: " + inputValues[0]);
        System.out.println("second: " + inputValues[1]);
        System.out.println("third: " + inputValues[2]);
    }
}
