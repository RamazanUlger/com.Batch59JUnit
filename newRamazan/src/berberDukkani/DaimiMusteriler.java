package berberDukkani;

public class DaimiMusteriler extends Musteriler {
    String ad;
    String soyAd;
    int yas;
    String adres;
    String musteriNo;
    String tel;

    DaimiMusteriler(){}
    DaimiMusteriler(String ad,String soyAd,int yas,String adres,String tel){
        setAd(ad);
        setSoyAd(soyAd);
        setYas(yas);
        setAdres(adres);
        setMusteriNo(musteriNo);
        setTel(tel);

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

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getMusteriNo() {
        return musteriNo;
    }

    public void setMusteriNo(String musteriNo) {
        this.musteriNo = musteriNo;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
