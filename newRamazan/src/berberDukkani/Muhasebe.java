package berberDukkani;

public class Muhasebe extends Ucretler {
   double saatUcreti;

    public double maasHesapla(double saatUcreti){
       saatUcreti=saatUcreti*(8*22);//haftada 40 saat ayda oratalma 160 saat calisilir
   return saatUcreti;

   }


}
