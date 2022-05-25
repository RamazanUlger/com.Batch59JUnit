package day11_faker_File;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C06_FileExist_TekrarTesti extends TestBase {
    @Test
    public void test01() {
      // 1. Tests packagenin altina bir class oluşturalim : C04_FileDownload

      // 2. Iki tane metod oluşturun : isExist( ) ve downloadTest( )
      // 3. downloadTest ( ) metodunun icinde aşağıdaki testi yapalim:

      // - https://the-internet.herokuapp.com/download adresine gidelim.
         driver.get("https://the-internet.herokuapp.com/download");

      // - dummy.txt dosyasını indirelim
  WebElement ilkerAbiText= driver.findElement(By.xpath("//a[.='ilkerText.txt']"));
  ilkerAbiText.click();
      // 4. Ardından isExist( ) methodunda dosyanın başarıyla indirilip indirilmediğini test edelim
        String farkliKisim=System.getProperty("user.home");
        String ortakKisim="\\Downloads\\ilkerText.txt\\";
    }
}
