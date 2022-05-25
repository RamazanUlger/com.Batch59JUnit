package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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

        //driver.close();
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

    public void drucker(List<String> list) {
        for (String each : list
        ) {
            System.out.println(each.substring(each.indexOf(","), each.lastIndexOf(" ")-1));
          //  System.out.println(each.substring(each.indexOf(","),each.indexOf(", ")));
        }
    }

    public List<String> ausWebzuStrList(List<WebElement> webElements) {
        List<String> dieWArenListe = new ArrayList<>();
        for (WebElement each : webElements
        ) {
            if (!each.getText().contains("Gesponsert")) {
                dieWArenListe.add(each.getText());
            }
        }
        return dieWArenListe;
    }

}
