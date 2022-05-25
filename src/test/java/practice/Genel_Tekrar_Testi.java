package practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

import java.time.Duration;
import java.util.List;

public class Genel_Tekrar_Testi extends TestBase {
    @Test
    public void test01() {
        //  Test01 :
        //  1- amazon gidin
        driver.get("https://www.amazon.com");

        //  2- Arama kutusunun solundaki dropdown menuyu handle edip listesini ekrana yazdırın
        WebElement ddm=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        Select select=new Select(ddm);
        List<WebElement> ddmList=select.getAllSelectedOptions();
        for (WebElement each:ddmList
             ) {
            System.out.println(each.getText());
        }
        //  3- dropdown menude 40 eleman olduğunu doğrulayın
        Assert.assertTrue(ddmList.size()==40);
    }

    @Test
    public void Test02() {
       // Test02

        //  1- dropdown menuden elektronik bölümü seçin

        //  2- arama kutusuna iphone yazip aratin ve bulunan sonuç sayısını yazdırın
        //  3- sonuc sayisi bildiren yazinin iphone icerdigini test edin
        //  4- ikinci ürüne relative locater kullanarak tıklayin
        //  5- ürünün title'ni ve fiyatını variable’a assign edip ürünü sepete ekleyelim
    }



    @Test
    public void Test03() {
        //  Test03

        //  1- yeni bir sekme açarak amazon anasayfaya gidin
        //  2-dropdown’dan bebek bölümüne secin
        //  3-bebek puset aratıp bulundan sonuç sayısını yazdırın
        //  4-sonuç yazsının puset içerdiğini test edin
        //  5-üçüncü ürüne relative locater kullanarak tıklayin
        //  6-title ve fiyat bilgilerini assign edelim ve ürünü sepete ekleyin

    }
    @Test
    public void  test04() {
        //  Test 4

        //  1-sepetteki ürünlerle eklediğimiz ürünlerin aynı olduğunu isim ve fiyat olarak doğrulayın
    }

}
