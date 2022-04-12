package deneme;

import java.util.Scanner;

public class C05_IfElseIfStatement {
    public static void main(String[] args) {
     /*   Kullanicidan artik yil olup olmadigini kontrol etmek
        icin yil girmesini isteyin.
        Kural 1: 4 ile bolunemeyen yillar artik yil degildir
        Kural 2: 4 ile bolunup 100 ile bolunemeyen yillar artik

        yildir

        Kural 3: 4’un kati olmasina ragmen 100 ile bolunebilen
        yillardan sadece 400’un kati olan yillar artik
                yildir

        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie bitte ein Jahr ein, damit Sie es wissen, ob es ein Schaltjahr ist.");
        int jahr;
        jahr = scan.nextInt();
        if ((jahr % 4 == 0) && (jahr % 100 == 0) && (jahr % 400 == 0)) {
            System.out.println(jahr + " " +
                    " ist ein Schaljahr");
        } else {
            System.out.println(jahr +" "+"ist kein Schaltahr.");
        }
    }
}
