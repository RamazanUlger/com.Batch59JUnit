package common2Arrays;

import java.util.Arrays;

public class C02 {
    public static void main(String[] args) {

    }


        public static boolean arrayIlkVeSonElemanKarsilartirma(int[][] arr_A, int[][] arr_B) {
            boolean bl = false;
            if (arr_A[0][0] == arr_B[0][0] || arr_B[1][arr_B.length - 1] == arr_A[1][arr_A.length - 1]) {
                bl=true;
            }
            return bl;
    }
}
