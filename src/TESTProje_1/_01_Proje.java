package TESTProje_1;

import Utlity.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_Proje  extends BaseDriver {

//    Test Case 1: Kayıt oluşturma


//• Siteye Gidin.
//     • “Sign Up” tıklatınız.
//• “Ad new User” altındaki açılan formu eksiksiz doldurunuz.
//• Submit butonuna tıklatınız.
//• Başarılı bir şekilde kayıt oluşturduğunuzu doğrulayınız.


    @Test
    public void TEST1(){


   driver.get("https://itera-qa.azurewebsites.net/");

  WebElement tiklama =  driver.findElement(By.xpath("//a[text()='Sign Up']"));
  tiklama.click();

    Bekle(1);

       WebElement firstname =  driver.findElement(By.xpath("//input[@name='FirstName']"));
       firstname.sendKeys("hamdi");

       Bekle(1);

       WebElement surname =  driver.findElement(By.xpath("//*[@id='Surname']"));
       surname.sendKeys("kucuk");

      Bekle(1);

      WebElement Epost =  driver.findElement(By.xpath("//*[@id='E_post']"));
      Epost.sendKeys("ww@ggg.com");

      Bekle(1);

      WebElement Mobile =  driver.findElement(By.xpath("//*[@id='Mobile']"));
      Mobile.sendKeys("012312312233");

      Bekle(1);
      WebElement Username =  driver.findElement(By.xpath("//*[@id='Username']"));
      Username.sendKeys("gidip60");

      Bekle(1);
      WebElement Password =  driver.findElement(By.xpath("//*[@id='Password']"));
      Password.sendKeys("12345678910");

      Bekle(1);
      WebElement ConfirmPassword =  driver.findElement(By.xpath("//*[@id='ConfirmPassword']"));
      ConfirmPassword.sendKeys("12345678910");

     WebElement sonTik =  driver.findElement(By.xpath("//input[@id='submit']"));
     sonTik.click();

        //input[@id='submit']
        String dogrulama = "Username already exist";

      WebElement dogrulamaYazisi =  driver.findElement(By.xpath("//label[@class='label-danger']"));



      Assert.assertTrue( dogrulamaYazisi.getText().equals(dogrulama) );

      Bekle(1);










    }

}
