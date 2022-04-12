package deneme;

import java.util.Scanner;

public class C12_S_M_Soru4 {
    public static void main(String[] args) {
     //   Soru 4) Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi yaziniz");
        String isim=scan.next();
        System.out.println("Soyisminizi yaziniz");
        String soyIsim= scan.next();
        if (isim.length()>soyIsim.length() ) {
            System.out.println(isim+": Isminiz, soyisminden daha uzundur.");
        }else {
            System.out.println(soyIsim+" :Soyisminiz, isminizden daha uzundur.");
        }

    }
}
