/**
 * Created by sreeram.srini on 1/8/18.
 */
public class Hello {
    public static void main(String[] args){
        System.out.println("Hello Sreeram !!!");
        int age = 39;
        System.out.println("My Age ::" +age);

        short shortValue = 20;
        byte byteValue = 8;
        int intValue = 10;
        long longValue = 100L;
        long totalValue = 5000L + 10L *(byteValue+shortValue+intValue);
        System.out.println("total value " + totalValue );
    }
}
