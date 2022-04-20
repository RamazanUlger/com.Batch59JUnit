package odev;

public class Balik implements Av,Avci {
    @Override
    public void kac() {
        System.out.println("Kucuk balik buyuk baliktan kaciyor");
    }

    @Override
    public void avlanma() {
        System.out.println("Buyuk balik kucuk baligi avliyor");
    }
}
