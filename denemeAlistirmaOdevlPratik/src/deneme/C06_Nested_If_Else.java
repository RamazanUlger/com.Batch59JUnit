package deneme;

import java.util.Scanner;

public class C06_Nested_If_Else {
    public static void main(String[] args) {
        /*Kullanicidan artik yil olup olmadigini        kontrol etmek icin yil girmesini isteyin.
        Kural 1: 4 ile bolunemeyen yillar artik yil degildir

        Kural 2: 4’un kati olmasina ragmen 100 ile
        bolunebilen yillardan sadece
        400’un kati olan yillar artik yildir*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen artikyil olup olamdigini merak ettiginiz yili giriniz");
        int yil = scan.nextInt();
        boolean artikYil = true;
        if (yil % 4 != 0) {
            artikYil = false;
            if (yil % 100 == 0) {
                artikYil = true;
                if (yil % 400 == 0) {
                    artikYil = true;
                }

            }
        }
        if (artikYil == true) {
            System.out.println(yil + " yili artikyildir");
        } else if (artikYil == false) {
            System.out.println(yil + " yili artikyil degildir");
        }
    }
}
