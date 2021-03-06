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
                         1.000001F,
                         9.999999F};

        // конвертирование из флота в стринг похоже на костыль, но
        // зато при засовывании его в BigDecimal он работает без погрешности
        String[] strArr = new String[array.length];
        for (int i =0; i<array.length; i++){
            strArr [i] = String.valueOf(array[i]);
        }

        BigDecimal result = new BigDecimal(strArr[0]);
        for (int i = 1; i < array.length; i++) {

            result = result.add(new BigDecimal(strArr[i]));
        }

        System.out.println(result); // вывод в консоль: 23.4000040


    }

}
