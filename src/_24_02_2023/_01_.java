package _24_02_2023;

import Utlity.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_ extends BaseDriver {
    //    1) Bu siteye gidin. -> http://demoqa.com/text-box
//
//            2) Full Name kısmına "Automation" girin.
//
//  3) Email kısmına "Testing@gmail.com" girin.
//
//  4) Current Address kısmına "Testing Current Address" girin.
//
//  5) Permanent Address kısmına "Testing Permanent Address" girin.
//
//  6) Submit butonuna tıklayınız.
//
//  7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.
//
//            8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.

@Test
    public  void Test1() {

        driver.get("http://demoqa.com/text-box");

        WebElement fullName =  driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
        fullName.sendKeys("Automation");

        WebElement email =  driver.findElement(By.xpath("//input[@id='userEmail']"));
        email.sendKeys("Testing@gmail.com");

        WebElement currentAdress =  driver.findElement(By.xpath("//*[@id='currentAddress']"));
        currentAdress.sendKeys("Testing Current Address");

        WebElement parmanentAdrsss =  driver.findElement(By.xpath("//*[@id='permanentAddress']"));
        parmanentAdrsss.sendKeys("Testing Permanent Address");

     WebElement submit =   driver.findElement(By.xpath("//button[@type='button' and @class='btn btn-primary']"));
        submit.click();


    Assert.assertTrue(fullName.getAttribute("value").equals("Automation"));
    Assert.assertTrue(email.getAttribute("value").contains("Testing"));

    }



}
