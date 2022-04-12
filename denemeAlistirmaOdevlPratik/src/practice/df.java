package practice;

import java.util.Arrays;

public class df {
    public static void main(String[] args) {

         /*

        a ve b den oluşan 2 int array verildiğinde, aynı ilk öğeye sahiplerse
        veya aynı son öğeye sahiplerse true değerini döndürün.
         her iki arrayin lengthi(öğe sayısı) 1 veya daha fazla olacaktır.

       commonEnd([1, 2, 3], [7, 3]) → true
       commonEnd([1, 2, 3], [7, 3, 2]) → false
       commonEnd([1, 2, 3], [1, 3]) → true



    */


        int arr_A[][] = {{5, 1, 7, 5}, {3, 8}};
        int arr_B[][] = {{3, 1, 7, 5}, {6, 7}};
        boolean bl=arrayIlkVeSonElemanKarsilartirma(arr_A,arr_B);
        System.out.println("Method'dan donen deger : "+bl);

    }

    public static boolean arrayIlkVeSonElemanKarsilartirma(int[][] arr_A, int[][] arr_B) {
    boolean bl = false;
        if (arr_A[0][0] == arr_B[0][0] || arr_B[1][arr_B.length - 1] == arr_A[1][arr_A.length - 1]) {
         bl=true;
        }
    return bl;
    }
}
