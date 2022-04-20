package berberDukkani;

public class Calisan extends Muhasebe  {
    String ad;
    String soyAd;
    int yas;
    private int saatUcreti;
    Calisan(){}
    Calisan(String ad,String soyAd,int yas,int saatUcreti){
    setAd(ad);
    setSoyAd(soyAd);
    setYas(yas);
    setSaatUcreti(saatUcreti);

    }

    public int getSaatUcreti() {
        return saatUcreti;
    }

    public void setSaatUcreti(int saatUcreti) {
        this.saatUcreti = saatUcreti;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
}
