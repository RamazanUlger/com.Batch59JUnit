package deneme;

public class C10_S_M_Soru2 {
    public static void main(String[] args) {
        /*
        Soru 2) String seklinde verlen asagidaki fiyatlarin toplamini bulunuz

String str1 = “$13.99”
String str2 = “$10.55”
ipucu : Double.parseDouble() methodunu kullanabilirsiniz.
         */
        String str1 ="13.99";
        String str2 ="10.55";
        double val=Double.parseDouble(str1);
        double val2=Double.parseDouble(str2);
        System.out.println("Toplam = "
        +(val+val2));

    }
}
