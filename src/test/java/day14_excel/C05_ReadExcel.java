package day14_excel;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class C05_ReadExcel {
    @Test
    public void readExcelTesti() throws IOException {

        // 7. Dosya yolunu bir String degiskene atayalim
        String dosyaYolu = "src/Resources/ulkeler.xlsx";
        // 8. FileInputStream objesi olusturup,parametre olarak dosya yolunu girelim
        FileInputStream fis = new FileInputStream(dosyaYolu);
        // 9. Workbook objesi olusturalim,parameter olarak fileInputStream objesini girelim
        Workbook wBook = WorkbookFactory.create(fis);
        //sayfa 2'ye gidip
        //satir sayisinin, kullanilan(bos olamayan satirlar) satirsayisinin ise 12 oldugunu test edin
        int sonSatir=wBook.getSheet("Sayfa1").getLastRowNum();
        int expectedSatirSayisi=24;
        Assert.assertEquals(expectedSatirSayisi,sonSatir+1);

        //kullanilan satir Sayisi
        int kullanilanSatirSayisi=wBook.getSheet("Sayfa1").getPhysicalNumberOfRows();
        expectedSatirSayisi=12;
        Assert.assertEquals(expectedSatirSayisi,kullanilanSatirSayisi);
    }
}
