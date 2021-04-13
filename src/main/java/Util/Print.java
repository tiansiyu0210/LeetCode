package Util;

public class Print {

    public static void array(Object[] arr){
        for(Object o : arr){
            System.out.print(o);
            System.out.print(" , ");
        }
    }

    public static void intArray(int[] arr){
        for(int o : arr){
            System.out.print(o);
            System.out.print(" , ");
        }
    }
}
