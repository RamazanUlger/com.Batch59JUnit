package C01_Obje;

public class OgretmenBilgileri {
    /* OgretmenBilgileri  Class’i olusturun bu Class’da bir Ogretmen icin gerekli
     * bilgileri girebilecegim Instance Variable’lar olusturun
     * ve main method icinde bu variable’lara deger atayin (variable lar buasamada static olmali..)
     * ve yazdirin
     *Not:Ornegin; 1 class, class icinde 1 tane static ve 1 tane de instance variable var.
	 Bu class'dan 10 object olusturulursa 1 tane static variable ve 10 tane
	 instance variable uretilmis demektir.
     */

    String isim1;
    String soyIsim;
    int yas;
    String brans;
    String tel;



    public static void main(String[] args) {
        OgretmenBilgileri ogretmen =new OgretmenBilgileri();
        ogretmen.isim1="ramazan";
        System.out.println(ogretmen.isim1);
        ogretmen.soyIsim="ulger";
        System.out.println(ogretmen.soyIsim);
        ogretmen.yas=35;
        System.out.println(ogretmen.yas);
        ogretmen.brans="Matematik";
        System.out.println(ogretmen.brans);
        ogretmen.tel="01632000454";
        System.out.println(ogretmen.tel);





    }



}
