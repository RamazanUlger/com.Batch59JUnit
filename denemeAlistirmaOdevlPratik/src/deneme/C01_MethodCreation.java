package deneme;

import java.util.Scanner;

public class C01_MethodCreation {
    public static void main(String[] args) {
        /*
         * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
         *  dort islemden biri ile isleme koyup sonucun yazdiriniz
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isleme sokmak istediginiz iki sayi giriniz : ");
        double s1 = scan.nextDouble();
        double s2 = scan.nextDouble();


       toplama(s1,s2);
       cikarma(s1,s2);
       carpma(s1,s2);
       bolme(s1,s2);
    }

    private static void bolme(double s1, double s2) {
        System.out.println(s1/s2);
    }

    private static void carpma(double s1, double s2) {
        System.out.println(s1*s2);
    }

    private static void cikarma(double s1, double s2) {
        System.out.println(s1-s2);
    }

    private static void toplama(double s1, double s2) {
        System.out.println(s1+s2);
    }
}

