package deneme;

import java.util.Scanner;

public class C13_S_M_Soru5 {
    public static void main(String[] args) {
        /*
        Soru 5) Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime = scan.next();
        for (int i = kelime.length() - 1; i >= 0; i--) {
            System.out.print(kelime.substring(i, i + 1));

        }
    }


}