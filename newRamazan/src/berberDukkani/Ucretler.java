package berberDukkani;

import java.util.ArrayList;
import java.util.List;

public class Ucretler {

    int sacKesim,sakalkesim,sakalModel,cocuk,agda, yikama,masaj,sacBakim,ciltBakim;

    Ucretler(){}




   Ucretler(int sacKesim, int sakalkesim, int sakalModel, int cocuk, int agda, int yikama, int masaj, int sacBakim, int ciltBakim){
   setSacKesim(sacKesim);
   setSakalkesim(sakalkesim);
   setSakalModel(sakalModel);
   setCocuk(cocuk);
   setAgda(agda);
   setYikama(yikama);
   setMasaj(masaj);
   setSacBakim(sacBakim);
   setCiltBakim(ciltBakim);
   }


   public int getSacKesim() {
      return sacKesim;
   }

   public void setSacKesim(int sacKesim) {
      this.sacKesim = 13;
   }

   public int getSakalkesim() {
      return sakalkesim;
   }

   public void setSakalkesim(int sakalkesim) {
      this.sakalkesim = 7;
   }

   public int getSakalModel() {
      return sakalModel;
   }

   public void setSakalModel(int sakalModel) {
      this.sakalModel = 10;
   }
   public void setCocuk(int cocuk) {
      this.cocuk = 10;
    }
   public int getCocuk() {
      return cocuk;
   }

   public int getAgda() {
      return agda;
   }

   public void setAgda(int agda) {
      this.agda = 5;
   }

   public int getYikama() {
      return yikama;
   }

   public void setYikama(int yikama) {
      this.yikama = 2;
   }

   public int getMasaj() {
      return masaj;
   }

   public void setMasaj(int masaj) {
      this.masaj = 5;
   }

   public int getSacBakim() {
      return sacBakim;
   }

   public void setSacBakim(int sacBakim) {
      this.sacBakim = 10;
   }

   public int getCiltBakim() {
      return ciltBakim;
   }

   public void setCiltBakim(int ciltBakim) {
      this.ciltBakim = 10;
   }
}
