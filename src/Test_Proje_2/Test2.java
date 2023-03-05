package Test_Proje_2;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Test2 extends BaseDriver {

    @Test

    public void Test1() {

        driver.get("https://demowebshop.tricentis.com/");

        Actions actions = new Actions(driver);

        WebElement register = driver.findElement(By.linkText("Register"));
        Action action = actions.moveToElement(register).click().build();

//        MyFunc.Bekle(2);
        action.perform();

        WebElement male = driver.findElement(By.xpath("//input[@id='gender-male']"));

        actions.moveToElement(male).click().build().perform();


        WebElement firstName = driver.findElement(By.id("FirstName"));

        actions.moveToElement(firstName).click().sendKeys("Alim").build().perform();

        WebElement lastName = driver.findElement(By.id("LastName"));

        actions.moveToElement(lastName).click().sendKeys("talip").build().perform();

        actions.moveToElement(lastName).sendKeys().build().perform();

        WebElement Email = driver.findElement(By.id("Email"));

        actions.moveToElement(Email).click().sendKeys("testing@4.com").build().perform();


//        ((int)(Math.random()*1000))

        WebElement Pass = driver.findElement(By.id("Password"));

        actions.moveToElement(Pass).click().sendKeys("123456").build().perform();


        WebElement RePass = driver.findElement(By.id("ConfirmPassword"));

        actions.moveToElement(RePass).click().sendKeys("123456").build().perform();


        WebElement registerSon = driver.findElement(By.id("register-button"));

        actions.moveToElement(registerSon).click().build().perform();

        WebElement dogrulama2 = driver.findElement(By.xpath("//li[text()='The specified email already exists']"));

      System.out.println(dogrulama2.getText());
//
        Assert.assertEquals("The specified email already exists",dogrulama2.getText());
//










    }
}
