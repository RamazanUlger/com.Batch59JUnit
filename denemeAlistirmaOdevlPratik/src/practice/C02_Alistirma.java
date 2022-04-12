package practice;

import java.util.Locale;

public class C02_Alistirma {
    public static void main(String[] args) {
        String sifre = "amazan";
        String sifre2 = "";
        char harf;

        for (int i = sifre.length() - 1; i >= 0; i--) {
            harf = sifre.charAt(i);
            if ((harf >= 'A') && (harf <= 'Z')) {
                System.out.println("Buyuk harf icermektedir");
            }else if (!(harf>='A') && !(harf<='Z')  ) {
                System.out.println("kucuk harf");

            }


        }
    }
}

