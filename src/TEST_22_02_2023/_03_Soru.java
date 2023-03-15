package TEST_22_02_2023;

import Utlity.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_Soru  extends BaseDriver {
//    3-
//            1) Bu siteye gidin. -> https://www.snapdeal.com/
//
//            2) "teddy bear" aratın ve Search butonuna tıklayın.
//
//3) Bu yazının göründüğünü doğrulayınız. -> (We've got 297 results for 'teddy bear')
//    Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.


    @Test
    public void Test3 (){

        driver.get("https://www.snapdeal.com");

       WebElement aramaKutusu=  driver.findElement(By.cssSelector("input[name ='keyword'][type='text'][id='inputValEnter']"));
       aramaKutusu.sendKeys("teddy bear");

//       WebElement tikla = driver.findElement(By.cssSelector("span[class='searchTextSpan']"));
//       tikla.click();
//
//      WebElement ayicikyazisi = driver.findElement(By.cssSelector("div[class='seach-msg-sec clearfix']  div[class='search-result-txt-section  marT12'] "));
//
//
//
//      Assert.assertTrue(ayicikyazisi.getText().contains("We've got") && ayicikyazisi.getText().contains("results for teddy bear") );



        Assert.assertTrue(aramaKutusu.getText().contains("teddy bear"));














    }
}
