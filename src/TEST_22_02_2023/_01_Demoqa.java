package TEST_22_02_2023;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_Demoqa extends BaseDriver {
    /*

  1) Bu siteye gidin. -> http://demoqa.com/text-box

  2) Full Name kısmına "Automation" girin.

  3) Email kısmına "Testing@gmail.com" girin.

  4) Current Address kısmına "Testing Current Address" girin.

  5) Permanent Address kısmına "Testing Permanent Address" girin.

  6) Submit butonuna tıklayınız.

  7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.

  8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.

*/
    @Test
    public void Test1() {

        String eMail = "Testing@gmail.com";

        driver.get("http://demoqa.com/text-box");
      //  MyFunc.Bekle(2);

        WebElement fullName = driver.findElement(By.cssSelector("input[id='userName']"));
        fullName.sendKeys("Automation");

     //   MyFunc.Bekle(1);

        WebElement eMailkutusu = driver.findElement(By.cssSelector("div[class='col-md-9 col-sm-12'] > input[type='email']"));
        eMailkutusu.sendKeys( eMail);

     //   MyFunc.Bekle(1);

        WebElement currentAdress = driver.findElement(By.cssSelector("textarea[id='currentAddress']"));
        currentAdress.sendKeys("Testing Current Address");

     //   MyFunc.Bekle(1);

        WebElement permanentAdress = driver.findElement(By.cssSelector("textarea[id='permanentAddress']"));
        permanentAdress.sendKeys("Testing Permanent Address");

       // MyFunc.Bekle(1);

        WebElement submit = driver.findElement(By.cssSelector("button[id='submit']"));
        submit.click();

    //    MyFunc.Bekle(1);

       Assert.assertTrue(fullName.getAttribute("value").equals("Automation"));
       Assert.assertTrue(eMailkutusu.getAttribute("value").equals(eMail));



driver.quit();
    }

}
