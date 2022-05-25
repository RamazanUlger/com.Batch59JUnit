package day14_excel;

import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_ReadExcel {
    @Test
    public void readExcel() throws IOException {
      // 7. Dosya yolunu bir String degiskene atayalim
        String dosyaYolu ="src/Resources/ulkeler.xlsx";
      // 8. FileInputStream objesi olusturup,parametre olarak dosya yolunu girelim
        FileInputStream fis=new FileInputStream(dosyaYolu);
      // 9. Workbook objesi olusturalim,parameter olarak fileInputStream objesini girelim

        // 10. WorkbookFactory.create(fileInputStream)
        Workbook workbook=WorkbookFactory.create(fis);
      // 11. Worksheet objesi olusturun workbook.getSheetAt(index)
        Sheet sheet= workbook.getSheet("Sayfa1");
      // 12. Row objesi olusturun sheet.getRow(index)
        Row row=sheet.getRow(3);
      // 13. Cell objesi olusturun row.getCell(index)
        Cell cell=row.getCell(3);
        System.out.println(cell);

        //3.index'deki satirin 3.index'deki cell'ini alalim
        String expectedResult="Cezayir";
        String actualResult=cell.toString();
        Assert.assertEquals(expectedResult,actualResult);
    }
}
