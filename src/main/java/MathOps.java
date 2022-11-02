import java.util.Arrays;

public class MathOps {
    public static long add(long input1, long input2){
        return input1 + input2;
    }

    public static double tip(double bill, double tip){
        return bill * (tip/100);
    }

    public static int[] addOneToArray(int[] startArray){
        for (int i = 0; i < startArray.length; i++){
            System.out.println(startArray[i]);
            startArray[i] +=1;
        }
//        int i = 0;
//        for (int number : startArray){
//            startArray[i++] = number+1;
//        }
        return startArray;
    }
}
