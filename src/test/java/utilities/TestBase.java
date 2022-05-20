package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.HashSet;
import java.util.Set;

public abstract class TestBase {
    //Abstract yapamamizin amaci, bu class'dan  obje uretilmesinin onune gecmektir
  protected  WebDriver driver;
    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
    @After
    public void tearDown(){
    //    driver.close();
    }
    public String windowhandles(Set<String> set){
       String ikinciSayfaHandleDegeri="";

        for (String each:set
        ) {
            if (!each.contains(each)) {
                ikinciSayfaHandleDegeri=each;
            }
        }
  return ikinciSayfaHandleDegeri;
    }


}
