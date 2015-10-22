package homeWork9;

/**
 * Created by igor on 20.10.15.
 */
public class FloatCounter {
    public static void main(String[] args) {
        float[] array = {3.12F,
                        3.13F,
                        1.1F,
                        23.23F,
                        12.01F};
        float result = 0F;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        System.out.println(result);
    }

}
