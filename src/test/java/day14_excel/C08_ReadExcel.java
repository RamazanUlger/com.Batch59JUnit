package day14_excel;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C08_ReadExcel {
    @Test
    public void readExcelTest() throws IOException {
        //Yeni bir test method olusturalim readExcel2( )
        //- 1.satirdaki 2.hucreye gidelim ve yazdiralim
        String dosyaYolu="src/Resources/ulkeler.xlsx";
        FileInputStream file=new FileInputStream(dosyaYolu);
        Workbook wBook= WorkbookFactory.create(file);
        //- 1.satirdaki 2.hucreyi bir string degiskene atayalim ve yazdiralim
        
        //- 2.satir 4.cell’in afganistan’in baskenti oldugunu test edelim

        //- Satir sayisini bulalim
        //- Fiziki olarak kullanilan satir sayisini bulun
        //- Ingilizce Ulke isimleri ve baskentleri bir map olarak kaydedelim
    }
}
