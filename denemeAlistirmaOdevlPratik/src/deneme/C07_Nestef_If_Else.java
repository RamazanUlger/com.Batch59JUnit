package deneme;

import java.util.Scanner;

public class C07_Nestef_If_Else {
    public static void main(String[] args) {
       /* Kullanicidan bir sifre girmesini isteyin
        Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin. Ilk harf A ise
        “Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.
        Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin. Ilk harf z ise
        “Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz :");
        String sifre = scan.next();
        char kont = sifre.charAt(0);
        if (kont == 'A') {
            System.out.println("Sifre gecerli");
        } else if (kont == 'z') {
            System.out.println("Sifre gecerli");
        } else {
            System.out.println("Gecersiz sifre");

        }
    }
}
