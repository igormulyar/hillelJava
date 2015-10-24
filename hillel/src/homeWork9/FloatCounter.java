package homeWork9;

import java.math.BigDecimal;

/**
 * Created by igor on 20.10.15.
 */
public class FloatCounter {
    public static void main(String[] args) {
        float[] array = {9.400001F,
                        0.000001F,
                        1.000001F,
                        2.000001F,
                        1.000001F}; //

        String[] strArr = new String[array.length];

//        float result=0;
//        for (int i = 0; i<array.length; i++){
//            result +=array[i];
//        } // result is 13.400004  but should be 13.00005

        BigDecimal result = new BigDecimal(array[0]);
        for (int i = 1; i < array.length; i++) {

            result = result.add(new BigDecimal(array[i]));
        }

        System.out.println(result);


    }

}
