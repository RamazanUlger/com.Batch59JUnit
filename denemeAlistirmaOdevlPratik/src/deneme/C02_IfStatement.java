package deneme;

import java.util.Scanner;

public class C02_IfStatement {
    public static void main(String[] args) {
        /*
         * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
         *  dort islemden biri ile isleme koyup sonucun yazdiriniz
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isleme sokmak istediginiz iki sayi giriniz : ");
        int s1 = scan.nextInt();
        int s2 = scan.nextInt();
        System.out.println("*****Lutfen seciniz...*****"
                + "\n"+ "Toplama icin : 1'i"
                + "\n" + "Cikarma icin : 2'i"
                + "\n" + "Carpma icin : 3'u"
                + "\n" + "Bolme icin : 4'u");
        int secim = scan.nextInt();

        if (secim == 1) {

            System.out.println("Toplam : " + (s1 + s2));
        }

        if (secim == 2) {
            System.out.println("Kalan : " + (s1 - s2));
        }
        if (secim == 3) {
            System.out.println("Sonuc" + (s1 * s2));

        }
        if (secim == 4) {
            System.out.println("Bolum : " + (s1 / s2));
        }
    }
}
