package HomeWork8;

/**
 * Created by igor on 17.10.15.
 */
public class Test {
    public static void main(String[] args) {
        int [] array = new int[12];

        for (int i = 0; i <array.length; i ++){
            array[i] = (int) (Math.random()*500+1);
        }

        for (int i : array){
            System.out.println(i);
        }

        //array = Sorter.insertSort(array); // - launch insert sort
        array = Sorter.shellSort(array);  // - launch Shell's sort


        System.out.println("\nSorted:");
        for (int i : array){
            System.out.println(i);
        }
    }
}
