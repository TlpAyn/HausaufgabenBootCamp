package TEST_22_02_2023;

import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]
//
//        Fake Alerts' tıklayınız.
//
//        Show Alert Box'a tıklayınız.
//
//        Ok'a tıklayınız.
//
//        Alert kapanmalıdır.


public class _05_ extends BaseDriver {

    public static void main(String[] args) {
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        Bekle(2);
        WebElement fa = driver.findElement(By.xpath("//a[@id='fakealerttest']"));
        fa.click();
        Bekle(1);
        WebElement ab = driver.findElement(By.xpath("//*[@id='fakealert']"));
        ab.click();
        Bekle(1);
        WebElement ok = driver.findElement(By.xpath("//*[@id='dialog-ok']"));
        ok.click();
        Bekle(1);

        driver.quit();




    }

}
