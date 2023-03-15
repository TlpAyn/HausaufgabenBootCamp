package _24_02_2023;

import Utlity.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_ extends BaseDriver {
@Test
    public void Test2() {


//        1) Bu siteye gidin. -> https://demo.applitools.com/
//
//        2) Username kısmına "ttechno@gmail.com" girin.
//
//        3) Password kısmına "techno123." girin.
//
//        4) "Sign in" buttonunan tıklayınız.
//
//        5) "Your nearest branch closes in: 30m 5s" yazısının göründüğünü doğrulayınız.



        driver.get("https://demo.applitools.com");

        WebElement username =  driver.findElement(By.xpath("//input[@class='form-control' and @id='username']"));
        username.sendKeys("ttechno@gmail.com");

        WebElement password =  driver.findElement(By.xpath("//input[@class='form-control' and @type='password']"));
        password.sendKeys("techno123.");
Bekle(1);
        WebElement SignIn =  driver.findElement(By.xpath("//a[@id='log-in' ]"));
        SignIn.click();
Bekle(1);
        WebElement sonYazi =  driver.findElement(By.xpath("//h6[@id='time']"));  //h6[@id='time']
Bekle(1);

        Assert.assertTrue(sonYazi.getText().equals("Your nearest branch closes in: 30m 5s"));
Bekle(1);
    }

}
