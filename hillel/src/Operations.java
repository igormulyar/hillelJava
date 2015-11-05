import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by IMulyar on 24.09.2015.
 */
public class Operations {
    public static void main(String[] args) {
//        int res = 5+ 89;
//        res = res+1;
//        res +=1;
//        res++;
//        ++res;
//
//        display(res++);
//        //постфиксная операция
//
//        display(++res);
//        //префиксная операция
//
//        int mod = 5%4;
//        display(mod);

        // побитовые опирации
        /**
         * логическое "или" сложение " |"
         * 1 + 0 = 1
         * 0 + 0 =0
         * "||" - операция короткой логики, если первый оператор true, второй оператор не проверяетс9
         *
         * логическое "и" умножение " & "
         * 1 * 0 = 0
         * 0 * 0 = 0;
         * 1 * 1 = 1
         */

//        boolean canAttend = paid() || advert();
//        System.out.println("can attend classes: "+ canAttend);
//
//
//        boolean hasEnoughKnowlage = false;
//        canAttend = paid() && hasEnoughKnowlage();
//        System.out.println("can attend classes: "+ canAttend);

        int message = 100;
        int key = 31;
        System.out.println("Message is:"+message);
        int crypted = message ^ key;
        System.out.println("crypted message is: "+crypted);

        int descripted = crypted ^ key;
        System.out.println("descrypted message is: "+ descripted);


        boolean priorities = paid() | advert() & hasEnoughKnowlage();
        //the same:
        //boolean priorities = paid() | (advert() & hasEnoughKnowlage());




    }

    public static boolean paid (){
        System.out.println("in paid method");
        return true;
    }

    public static boolean advert (){
        System.out.println("in advert method");
        return false;
    }

    public static boolean hasEnoughKnowlage (){
        System.out.println("in hasEnoughKnowlege method");
        return false;
    }

    public static void print (int i){
        System.out.println(i);
    }

}
