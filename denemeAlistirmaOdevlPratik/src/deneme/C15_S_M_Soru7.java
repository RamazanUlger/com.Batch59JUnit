package deneme;

import java.util.Scanner;

public class C15_S_M_Soru7 {
    public static void main(String[] args) {
        /*
        Soru 7) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi

yazdirin

isim-soyisim : M***** B*******
kart no : **** **** **** 1234
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim=scan.next();
        System.out.println("Lutfen Soyisminizi giriniz");
        String soyisim= scan.next();
        System.out.println("Lutfen kredi karti numaraizi giriniz :");
        String kKNumber=scan.next();

        System.out.println(isim.substring(0,1)+isim.replaceAll("\\w","*"));
        System.out.println(soyisim.substring(0,1)+soyisim.replaceAll("\\w","*"));
        System.out.println( kKNumber.substring(kKNumber.length()-4
        ).concat(kKNumber.replaceAll("\\d","*")));
    }
}
