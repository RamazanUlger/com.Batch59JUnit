package practice;

import java.util.Scanner;

public class C03_ForLoop {
    public static void main(String[] args) {
        /*Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
                değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
        1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
        Sesli harfler: a,e,i,o,u
        Test Data: a
        Beklenen Çıktı: a harfi sesli harfdir.
        Test Data:d
        Beklenen Çıktı:d harfi sesiz harftir.
        Test Data:
        we  yada %
        Beklenen Çıktı:
        Yanlis karakter girdiniz!
        */

        Scanner scan = new Scanner(System.in);
        //System.out.println("bir harf giriniz : ");
        String sesliHarfler = "AEIOUaeiou";
        System.out.println(sesliHarfler.length());
        System.out.println("Lutfen bir harf giriniz!");
        char harf = scan.next().charAt(0);
        boolean bl=false;
        if (harf >= 'A' && harf <= 'Z' || harf >= 'a' && harf <= 'z') {


            for (int i = 0; i <= sesliHarfler.length()-1; i++) {

                if (harf != sesliHarfler.charAt(i)) {
                   bl=true;

                } else {
                    bl=false;

                }
            }
        }else System.out.println("Hatali karakter girisi yaptiniz");

        System.out.println(bl==true ? "sesli harftir":"sessiz harftir");
    }
}
