package day14_excel;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class C06_ReadExcel {
    @Test
    public void readExcelTesti() throws IOException {
        //excel dosyasinin tum verilerini class'imiza alip
        //bir Java objesine store edelijm
        // boylece her seferinde excel'e ulasip satir,sutun vs.. ugrasmayalim
        //Database yapisinda olan en uygun Java objesi Map'tir
        Map<String,String> ulkelerMap=new HashMap<>();
        // 7. Dosya yolunu bir String degiskene atayalim
        String dosyaYolu = "src/Resources/ulkeler.xlsx";
        // 8. FileInputStream objesi olusturup,parametre olarak dosya yolunu girelim
        FileInputStream fis = new FileInputStream(dosyaYolu);
        // 9. Workbook objesi olusturalim,parameter olarak fileInputStream objesini girelim
        Workbook wBook = WorkbookFactory.create(fis);
        int sonSatir=wBook.getSheet("Sayfa1").getLastRowNum();
        String key="";
        String value="";
        for (int i = 0; i <sonSatir ; i++) {
            // key i'inci satirindaki 0 indey'indeki data olacak
            key=wBook.getSheet("Sayfa1")
                    .getRow(i)
                    .getCell(0)
                    .getStringCellValue();

            //value icin
            value= wBook.getSheet("Sayfa1")
                            .getRow(i)
                            .getCell(1)
                            .toString()+
                    ","+
                    wBook.getSheet("Sayfa1")
                            .getRow(i)
                            .getCell(2)
                            .toString()+
                    ","+
                    wBook.getSheet("Sayfa1")
                            .getRow(i)
                            .getCell(3)
                            .toString();
            ulkelerMap.put(key,value);

        }
        System.out.println(ulkelerMap);
        Assert.assertTrue(ulkelerMap.keySet().contains("Ghana"));

        ulkelerMap.forEach((k,v)-> System.out.println("Länder : "+k+"               "+"Über Länder : "+v));

    }
}
