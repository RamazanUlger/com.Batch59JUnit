package practice;

public class C01_SifreSorusu {
    public static void main(String[] args) {
       /*Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore kontrol
        edin ve sifredeki hatalari yazdirin.
                Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli sifre
        girdiginde "Sifreniz Kabul edilmistir" yazdirin.
                - Sifre kucuk harf icermelidir
                - Sifre buyuk harf icermelidir
                - Sifre ozel karakter icermelidir
                - Sifre en az 8 karakter olmalidir.
    */
        String sifre = "AaAAAAAAAAAAAA5-";
        boolean kucukHarfKontrol = true;
        boolean buyukHarfKontrol = true;
        String ozelKarakterKontrol = "";
        String rakamKontrol = "";
        boolean flag = true;
        if(sifre.length() < 8) {
            System.out.println("Sifre en az 8 karakter olmalidir.");
            flag = false;
        } else {
            for(int i = 0; i < sifre.length() - 1; i++) {
                kucukHarfKontrol = sifre.charAt(i) >= 'a' || sifre.charAt(sifre.length() - 1) <= 'z';
                buyukHarfKontrol = sifre.charAt(i) >= 'A' || sifre.charAt(sifre.length() - 1) <= 'Z';
            }
            if(!kucukHarfKontrol) {
                System.out.println("Sifre kucuk harf icermelidir");
                flag = false;
            }
            if(!buyukHarfKontrol) {
                System.out.println("Sifre buyuk harf icermelidir");
                flag = false;
            }
            rakamKontrol = sifre.replaceAll("\\d", "");//ozel karekter kontrol
            if(rakamKontrol.length() == sifre.length()) {
                System.out.println("Sifre rakam icermelidir");
                flag = false;
            }
            ozelKarakterKontrol = sifre.replaceAll("\\W", "");//tum karakterler kontrol
            if(ozelKarakterKontrol.length() == sifre.length()) {
                System.out.println("Sifre özel sembol icermelidir");
                flag = false;
            }
        }
        if(flag) {
            System.out.println("Sifreniz Kabul edilmistir");
        }
    }
}


