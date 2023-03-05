package Test_Proje_2;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.assertEquals;

public class Test4 extends BaseDriver {
    @Test

    public void Test4(){



        driver.get("https://demowebshop.tricentis.com/");

        Actions actions = new Actions(driver);

        WebElement login = driver.findElement(By.linkText("Log in"));



        Action action = actions.moveToElement(login).click().build();
        action.perform();



        WebElement Email = driver.findElement(By.id("Email"));

        actions.moveToElement(Email).click().sendKeys("tg@4.com").build().perform();
        WebElement Pass = driver.findElement(By.id("Password"));

        actions.moveToElement(Pass).click().sendKeys("123456").build().perform();

        WebElement falsche = driver.findElement(By.xpath("//span[text()='Login was unsuccessful. Please correct the errors and try again.']"));



        WebElement loginSonn = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));

        actions.moveToElement(loginSonn).click().build().perform();



        Assert.assertEquals("Login was unsuccessful. Please correct the errors and try again.",falsche.getText());





//        WebElement logOut = driver.findElement(By.linkText("Log out"));
//
//        Assert.assertTrue(logOut.isDisplayed());
//
//



    }
}

