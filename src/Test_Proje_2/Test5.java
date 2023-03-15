package Test_Proje_2;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Test5 extends BaseDriver {
    @Test

    public void Test5() {

        driver.get("https://demowebshop.tricentis.com/");

        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));


        WebElement login = driver.findElement(By.linkText("Log in"));
        Action action = actions.moveToElement(login).click().build();
        action.perform();


        WebElement Email = driver.findElement(By.id("Email"));
        action = actions.moveToElement(Email).click().sendKeys("testing@4.com").build();
        action.perform();

        WebElement Pass = driver.findElement(By.id("Password"));
        action = actions.moveToElement(Pass).click().sendKeys("123456").build();
        action.perform();

        WebElement loginSonn = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        action = actions.moveToElement(loginSonn).click().build();
        action.perform();

        WebElement Computers = driver.findElement(By.linkText("COMPUTERS"));
        action = actions.moveToElement(Computers).build();
        action.perform();

        WebElement Notebooks = driver.findElement(By.linkText("Notebooks"));
        action = actions.moveToElement(Notebooks).click().build();
        action.perform();

        WebElement NotebooksTiklama = driver.findElement(By.linkText("14.1-inch Laptop"));
        NotebooksTiklama.click();

        MyFunc.Bekle(2);

        WebElement AddTOCart = driver.findElement(By.id("add-to-cart-button-31"));
        action = actions.moveToElement(AddTOCart).click().build();
        action.perform();

        WebElement Schopcart = driver.findElement(By.linkText("Shopping cart"));
        action = actions.moveToElement(Schopcart).click().build();
        action.perform();

        WebElement zorunluYer = driver.findElement(By.id("termsofservice"));
        action = actions.moveToElement(zorunluYer).click().build();
        action.perform();

        WebElement submit = driver.findElement(By.id("checkout"));
        action = actions.moveToElement(submit).click().build();
        action.perform();

        WebElement city = driver.findElement(By.id("BillingNewAddress_City"));

        WebElement firstContunue = driver.findElement(By.xpath("//input[@onclick='Billing.save()']"));
        action = actions.moveToElement(firstContunue).click().build();
        action.perform();

        MyFunc.Bekle(1);

        WebElement secondContunue = driver.findElement(By.xpath("//input[@onclick='Shipping.save()']"));
        action = actions.moveToElement(secondContunue).click().build();
        action.perform();

        MyFunc.Bekle(1);

        WebElement thirdContunue = driver.findElement(By.xpath("//input[@onclick='ShippingMethod.save()']"));
        action = actions.moveToElement(thirdContunue).click().build();
        action.perform();

        MyFunc.Bekle(1);

        WebElement fourthContunue = driver.findElement(By.xpath("//input[@onclick='PaymentMethod.save()']"));
        action = actions.moveToElement(fourthContunue).click().build();
        action.perform();

        MyFunc.Bekle(1);

        WebElement fifthContunue = driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']"));
        action = actions.moveToElement(fifthContunue).click().build();
        action.perform();

        MyFunc.Bekle(1);

        WebElement sixthtContunue = driver.findElement(By.xpath("//input[@onclick='ConfirmOrder.save()']"));
        action = actions.moveToElement(sixthtContunue).click().build();
        action.perform();

        MyFunc.Bekle(1);


        WebElement lastMessage = driver.findElement(By.xpath("//strong[text()='Your order has been successfully processed!']"));
        Assert.assertEquals("Your order has been successfully processed!", lastMessage.getText());


    }
}

