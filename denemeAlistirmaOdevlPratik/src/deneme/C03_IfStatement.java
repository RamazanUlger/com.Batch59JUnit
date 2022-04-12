package deneme;

import java.util.Scanner;

public class C03_IfStatement {
    public static void main(String[] args) {
        /*
	 *  Kullanicidan 3 tene pozitif  tam sayi alniz.
	 *  bu uc sayinin ucgen olusturma durumunu kontrol ediniz
	    eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz

	     Ucgen olma sarti :herhangi iki kenar toplami diger kenardan buyuk,
	     * herhangi iki kenar farki diger kenardan buyuk olmali
		 a+b>c>a-b
		 a+c>b>a-c
	     b+c>a>b-c
		a=b=c ise es kenar ucgen
	 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Uc tane tam sayi giriniz : ");
        int s1;
        int s2;
        int s3;
        s1 = scan.nextInt();
        s2 = scan.nextInt();
        s3 = scan.nextInt();
        //int []arr={scan.nextInt(), scan.nextInt(),scan.nextInt()};
        if (s1 == s2 && s2 == s3) {
            System.out.println("Bu bir es kenar ucgendir.");

        } else if (s1 + s2 > s3 && s3 > s1 - s2 || s1 + s3 > s2 && s2 > s1 - s3 || s2 + s3 > s1 && s1 > s2 - s3) {
            System.out.println("****Bu bir ucgendir****");

        } else {

            System.out.println("Gecersiz bir islem gerceklestirdiniz : ");
        }
    }
}