package deneme;

import java.util.Scanner;

public class C16_WhileLoop {
    public static void main(String[] args) {
        /*Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore kontrol

edin ve sifredeki hatalari yazdirin.
        Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli sifre
girdiginde "Sifreniz Kabul edilmistir" yazdirin.

        - Sifre kucuk harf icermelidir
        - Sifre buyuk harf icermelidir
        - Sifre ozel karakter icermelidir
        - Sifre en az 8 karakter olmalidir.


 */
        Scanner scan = new Scanner(System.in);
        String sifre = "ramazan";
        String kayitliSifre = "Ramazan*";
        int sayac = 0;
        String sifreYedek = "";
        char harf;

        do {
            System.out.println("Sifre giriniz : ");
            sifre = scan.next();
         kucukHarfKontrol(sifre);
         buyukHarfKontol(sifre);

        }
        while (!sifre.equals(kayitliSifre));
        System.out.println("Sifre kayit edildi!");

    }

    private static void buyukHarfKontol(String sifre) {

    }

    private static void kucukHarfKontrol(String sifre) {
        for (int i = sifre.charAt(0); i <= sifre.length(); i++) {
            char harf = sifre.charAt(i);
            if (harf>='a'&& harf<='z') {
                System.out.println("sad");
            }

        }


    }
}
