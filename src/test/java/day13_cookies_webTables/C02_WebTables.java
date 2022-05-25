package day13_cookies_webTables;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.util.List;


public class C02_WebTables extends TestBase {
    @Test
    public void webTablesTest() {

      // ● Bir class oluşturun : C02_WebTables
      // ● login( ) metodun oluşturun ve oturum açın.
      // ● https://www.hotelmycamp.com admin/HotelRoomAdmin adresine gidin
        //     ○ Username : manager
      //     ○ Password : Manager1!
        loginMethod();
      // ● table( ) metodu oluşturun
        List<WebElement> sutunBasliklariListesi=driver.findElements(By.xpath("//thead//tr[1]//th"));
      //     ○ Tüm table body’sinin boyutunu(sutun sayisi) bulun. /tbody
        System.out.println("Sutun sayisi : "+sutunBasliklariListesi.size());
        //     ○ Table’daki tum body’I ve başlıkları(headers) konsolda yazdırın.
    WebElement tBody=driver.findElement(By.xpath("//tbody"));
        System.out.println("Tum Body'deki elemanlar"+tBody.getText());
        // ● printRows( ) metodu oluşturun //tr
        List<WebElement> tumSatilar=driver.findElements(By.xpath("//tbody//tr"));
      //     ○ table body’sinde bulunan toplam satir(row) sayısını bulun.
        System.out.println("Tum satilar : "+tumSatilar.size());
        //     ○ Table body’sinde bulunan satirlari(rows) konsolda yazdırın.
        for (WebElement each: tumSatilar
             ) {
            System.out.println("Web elementleri : "+each.getText());
        }
      //     ○ 4.satirdaki(row) elementleri konsolda yazdırın.
        WebElement satir_4 =driver.findElement(By.xpath("//tbody//tr[4]"));
        System.out.println("4. Satirin konsol gornumu : "+satir_4.getText());


    }

    private void loginMethod() {
        driver.get("https://www.hotelmycamp.com");
        driver.findElement(By.linkText("Log in")).click();
        Actions actions = new Actions(driver);
        WebElement username = driver.findElement(By.id("UserName"));
        actions.click(username).
                sendKeys("manager").
                sendKeys(Keys.TAB).
                sendKeys("Manager1!").
                sendKeys(Keys.ENTER).
                perform();

    }
}
