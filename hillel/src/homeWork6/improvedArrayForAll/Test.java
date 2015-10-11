package homeWork6.improvedArrayForAll;

import java.util.Objects;

/**
 * Created by igor on 11.10.15.
 */
public class Test {
    public static void main(String[] args) {
        ImprovedArray impArr = new ImprovedArray();
        impArr.add("строка");
        impArr.add("строка");
        impArr.add("строка");
        impArr.add("этой строки не должно быть в выводе #2");
        impArr.add("строка");
        impArr.add("строка");
        impArr.add("строка");
        System.out.println("size(): "+ impArr.size());
        System.out.println("Проверка метода contains(): " + impArr.contains("этой строки не должно быть в выводе")); // вывод - true

        System.out.println("удаление по индексу 4: ");
        impArr.remove(4);
        for (int i = 0; i <impArr.size(); i++){
            System.out.println(impArr.get(i));
        }
        System.out.println("size(): "+ impArr.size());
        System.out.println();

        System.out.println("удаление по входящему объекту: ");
        impArr.remove("этой строки не должно быть в выводе #2");
        for (int i = 0; i <impArr.size(); i++){
            System.out.println(impArr.get(i));
        }
        System.out.println("size(): "+ impArr.size());
    }


}
