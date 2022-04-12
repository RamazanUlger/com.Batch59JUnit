package deneme;

import java.util.Scanner;

public class C14_S_M_Soru6 {
    public static void main(String[] args) {
     /*   Soru 6) Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari sagliyorsa
     “Sifrebasari ile tanimilandi”, sartlari saglamazsa “Islem basarisiz,Lutfen yeni birsifre girin” yazdirin
                - Ilk harf buyuk harf olmali
        - Son harf kucuk harf olmali
        - Sifre bosluk icermemeli
        - Sifre uzunlugu en az 8 karakter olmali

      */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz : ");
        String sifre = scan.nextLine();
        boolean kontrol1 = false;

        if (sifre.charAt(0) >= 'A' && sifre.charAt(0) <= 'Z') {
            kontrol1 = true;
        } else {
            System.out.println("Ilk harf buyuk harf olmali");
        }

        boolean kontrol2 = false;

        if (sifre.charAt(sifre.length() - 1) >= 'a' && sifre.charAt(sifre.length() - 1) <= 'z') {
            kontrol2 = true;
        }else {
            System.out.println("Son harf kucuk harf olmali");
        }

        boolean kontrol3 = false;

        if (!sifre.contains(" ")) {
            kontrol3 = true;
        } else {
            System.out.println(" Sifre bosluk icermemeli");
        }
        boolean kontrol4 = false;

        if (sifre.length() >= 8) {
            kontrol4 = true;
        } else {
            System.out.println("Sifre uzunlugu en az 8 karakter olmali");
        }

        if (kontrol1 && kontrol2 && kontrol3 && kontrol4) {
            System.out.println("Sifreniz basari ile kaydedildi");
        }
    }
}


