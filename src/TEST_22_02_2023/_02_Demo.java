package TEST_22_02_2023;

import Utlity.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Demo extends BaseDriver {

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


        driver.get("https://demo.applitools.com/");

        WebElement UsernameKutusu = driver.findElement(By.cssSelector("input[id='username']"));
        UsernameKutusu.sendKeys("ttechno@gmail.com");

        WebElement PasswordKutusu = driver.findElement(By.cssSelector("input[id='password']"));
        PasswordKutusu.sendKeys("techno123.");

        WebElement signIn = driver.findElement(By.cssSelector("a[id='log-in']"));
        signIn.click();

        WebElement sonYazi = driver.findElement(By.cssSelector("h6[id='time']"));


        Assert.assertTrue(sonYazi.getText().equals("Your nearest branch closes in: 30m 5s"));


    }
}
