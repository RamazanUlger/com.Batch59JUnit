package deneme;

public class C04_MethodCreation {
    public static void main(String[] args) {
        /* StringMethods
           String girildiginde ilk iki karakteri haric string return eden java programi yaziniz
           Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu karakterler de return edilsin
          ORNEK:
           INPUT      :  goat
                         photo
                         ghost
                         kalem
           OUTPUT :      gat
                         hoto
                         ghost
                         lem
		 */
        String[] arr = {"goat", "photo", "ghost", "kalem"};
       // System.out.println(arr[0]);
        String kelime1="";
      //  kelimecevirme(arr);

        for (int i = 0; i < arr.length ; i++) {
            String[] kelime =new String[4];
            //kelime[]=arr[i];
            kelime1=arr[i];

           // System.out.println(kelime1);
            //String k2=arr[]
           //arr[i]=kelime;
        }
        System.out.println(kelime1);
    }

  /*  private static void kelimecevirme(String[] arr) {




        return ;*/
    }


