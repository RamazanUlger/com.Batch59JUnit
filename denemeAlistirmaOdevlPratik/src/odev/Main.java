package odev;

public class Main {
    public static void main(String[] args) {

        Rabbit tavsan=new Rabbit();
        tavsan.kac();
        Kartal kartal =new Kartal();
        kartal.avlanma();
        Balik balik=new Balik();
       // Arac araba =new Arac();
        Araba araba =new Araba();
        araba.hareket();
        StringBuilder sb=new StringBuilder();

        sb.append("Ramazan ramazan ramazan ramazan ramazan");

        System.out.println(sb.length());


    }
}
