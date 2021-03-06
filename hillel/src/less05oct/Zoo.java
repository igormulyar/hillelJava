package less05oct;

/**
 * Created by IMulyar on 05.10.2015.
 */
public class Zoo {
    public static void main(String[] args) {
        Cat tomCat1 = new Cat(true, 3, "Tom", "blue-gray");
        Cat tomCat2 = new Cat(true, 3, "Tom", "blue-gray");

        System.out.println(tomCat1.equals(tomCat2));
    }

    public static void referenceComparation() {
        Cat tomCat1 = new Cat(true, 3, "Tom", "blue-gray");
        Cat tomCat2 = new Cat(true, 3, "Tom", "blue-gray");

        System.out.println(tomCat1==tomCat2);
        System.out.println(tomCat1=tomCat2);
    }

    public static void catCreation() {
        if (Cat.domestic){
            System.out.println("cat is domestic animal");
        }
        if (Cat.predator){
            System.out.println("cat is predator");
        }

        Cat tomCat = new Cat(true, 3, "Tom", "blue-gray");
        Cat mursik = new Cat(true, 4, "Mursik", "black");

        Cat cat = new Cat();
        System.out.println("cats name: "+ cat.getName());
        System.out.println("cat is pet: "+ cat.isPet());
        System.out.println("cats age is; "+cat.getAge());


        System.out.println(tomCat.getName());
        System.out.println(mursik.getAge());
        System.out.println("Predator? -"+Cat.predator);
    }

}
