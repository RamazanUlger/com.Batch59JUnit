package deneme;

public class C09_S_M_Soru1 {
    public static void main(String[] args) {
        /*1) String methodlarini kullanarak “ Java ogrenmek123 Cok guzel@ ” String’ini
        “Java ogrenmek cok guzel.” sekline getirin.*/

      String str1 = "Java ogrenmek123 Cok guzel@";
        System.out.println(str1);
        str1=str1.replaceAll("\\d","");
        str1=str1.replace("@","");
        str1=str1.replace('C','c');
        System.out.println(str1);

    }
}
