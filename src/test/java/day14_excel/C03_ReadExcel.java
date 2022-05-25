package day14_excel;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C03_ReadExcel {
    @Test
    public void readExcelTesti() throws IOException {
        //input olarak cerilen
        //Satir no;
        //Sutun no;
        //Degerlerini paranetre olaeak alip
        //o, cell'deki Data'yi String olarak bana donduren bir method olusturun
        int satirNo=3;
        int sutunNo=3;
        //donen datanin Cezayir olugunu test edin
        String expectedResult="Cezayir";
        String actualResult= banaDataGetir(satirNo,sutunNo);
        Assert.assertEquals(expectedResult,actualResult);
    }

    public static String banaDataGetir(int satirIndex, int sutunIndex) throws IOException {
   String istenenData="";
           String dosyaYolu="src/Resources/ulkeler.xlsx";
        FileInputStream file=new FileInputStream(dosyaYolu);
        Workbook wBook= WorkbookFactory.create(file);
        istenenData=wBook.getSheet("Sayfa1")
                .getRow(satirIndex)
                .getCell(sutunIndex)
                .getStringCellValue();
   return istenenData; }
}
