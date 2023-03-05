package _24_02_2023;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_ extends BaseDriver {
//                 1) Bu siteye gidin. -> https://www.snapdeal.com/
//
//                 2) "teddy bear" aratın ve Search butonuna tıklayın.
//
//                 3) Bu yazının göründüğünü doğrulayınız. -> (We've got 297 results for 'teddy bear')
//    Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.

    @Test
    public  void Test3() {

driver.get("https://www.snapdeal.com");

 WebElement kutucuk =  driver.findElement(By.xpath("//input[@id='inputValEnter']"));
 kutucuk.sendKeys("teddy bear");

        WebElement tiklama =  driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
        tiklama.click();

 WebElement cikanyazi =  driver.findElement(By.xpath("(//div[@class='search-result-txt-section  marT12'] )[1]"));

        Assert.assertTrue(cikanyazi.getText().contains("We've got") && cikanyazi.getText().contains(" results for teddy bear"));

    }
}
