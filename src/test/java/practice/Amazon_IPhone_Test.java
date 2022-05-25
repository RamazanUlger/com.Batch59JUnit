package practice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.List;

public class Amazon_IPhone_Test extends TestBase {
    @Test
    public void test01() throws InterruptedException {
        // Notes: It may also be necessary to write code to accept the accept cookies warning.
        // 1. Go to 'https://www.amazon.com.tr/'
        driver.get("https://www.amazon.com");
        // 2. Search iPhone13 512
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone13 512" + Keys.ENTER);
        // 3. Check that the results are listed
        WebElement results = driver.findElement(By.xpath("//div[@class=\"a-section a-spacing-small a-spacing-top-small\"]"));
        String resultList = results.getText();
        System.out.println(resultList);
        List<WebElement> iPhoneElements = driver.findElements(By.xpath("//*[@class='a-section a-spacing-none s-padding-right-small s-title-instructions-style']"));
        List<WebElement> preisElements = driver.findElements(By.xpath("//*[@class=\"a-row a-size-base a-color-base\"]"));
        List<String> iPhoneListStr = ausWebzuStrList(iPhoneElements);
        List<String> preisList=ausWebzuStrList(preisElements);
        drucker(iPhoneListStr);
        System.out.println(iPhoneListStr.size());

        // 4. Click iPhone13 at the top of the list
        // 5. Log the following values for each size
        // .Size information .Price .Color .Stock status

    }


}
