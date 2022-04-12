package deneme;

import java.util.Scanner;

public class C11_S_M_Soru3 {
    public static void main(String[] args) {
        /*
        Soru 3) Kullanicidan isim isteyin. Eger

        - isim “a” harfi iceriyorsa “Girdiginiz isim a harfi iceriyor”
        - isim “Z” harfi iceriyorsa “Girdiginiz isim Z harfi iceriyor”
        - ikisi de yoksa “Girdiginiz isim a veya Z harfi icermiyor” yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isim ve soyisim girin : ");
        String isimSoyisim=scan.nextLine();
        if (isimSoyisim.contains("a")) {
            System.out.println("Girdiginiz isim a harfi iceriyor");
        }else if (isimSoyisim.contains("Z")) {
            System.out.println("Girdiginiz isim \"Z\" harfi iceriyor");
        }else{
            System.out.println("Girdiginiz isim 'a' veya 'Z' harfi icermiyor");
        }
    }
}
