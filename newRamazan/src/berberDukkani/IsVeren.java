package berberDukkani;

public class IsVeren extends Muhasebe{
    String ad;
    String soyAd;
    int yas;
    IsVeren(){}
    IsVeren(String ad,String soyAd, int yas){
        setAd(ad);
        setSoyAd(soyAd);
        setYas(yas);
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
