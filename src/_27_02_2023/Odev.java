package _27_02_2023;

import Utlity.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Odev extends BaseDriver {
@Test
    public  void Test1() {
        driver.get("https://www.saucedemo.com/");

       WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));
       userName.sendKeys("standard_user");

        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");

        WebElement Login = driver.findElement(By.xpath("//input[@id='login-button']"));
        Login.click();

    WebElement IlkCanta = driver.findElement(By.xpath("//img[@alt='Sauce Labs Backpack']"));
    IlkCanta.click();
    Bekle(1);
    WebElement IlkCantaSepeteEkle = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
    IlkCantaSepeteEkle.click();

    Bekle(1);
driver.navigate().back();

    WebElement Tshirt = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']"));
    Tshirt.click();
    Bekle(1);
    WebElement TshirtSepeteEkle = driver.findElement(By.xpath("//button[text()='Add to cart']"));
    TshirtSepeteEkle.click();
    Bekle(1);

    WebElement SepeteTikla = driver.findElement(By.xpath("//span[@class='shopping_cart_badge']"));
    SepeteTikla.click();
    Bekle(1);

    WebElement CheckOut = driver.findElement(By.xpath("//button[text()='Checkout']"));
    CheckOut.click();
    Bekle(1);

    WebElement firstname = driver.findElement(By.xpath("//input[@id='first-name']"));
    firstname.sendKeys("Talip");

    Bekle(1);
    WebElement secondName = driver.findElement(By.xpath("//input[@id='last-name']"));
    secondName.sendKeys("Ayan");

    Bekle(1);
    WebElement zipCode = driver.findElement(By.xpath("//input[@id='postal-code']"));
    zipCode.sendKeys("52393");
    Bekle(1);
    WebElement Contunue = driver.findElement(By.xpath("//input[@id='continue']"));
    Contunue.click();
    Bekle(1);
    WebElement ToplamFiyat = driver.findElement(By.xpath("//div[text()='60.45']"));


    // Urunler Toplami//
    List<WebElement> ucretler = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
    
    double toplam =0;
    for (WebElement a :ucretler) {

        System.out.println("a.getText() = " + a.getText());

        toplam = toplam+ Double.parseDouble(a.getText().substring(1));
    }

    System.out.println("toplam"+toplam);


    String total= "Total: $60.45";
    Assert.assertTrue(ToplamFiyat.getText().equals(total));

    WebElement webAltToplam=driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));
    //System.out.println("webAltToplam.getText() = " + webAltToplam.getText());
    //System.out.println("webAltToplam.getText() = " + webAltToplam.getText().replaceAll("[^0-9,.]",""));
    Double altToplam=Double.parseDouble(webAltToplam.getText().replaceAll("[^0-9,.]",""));

    Assert.assertTrue("Değerler eşit değil",  (toplam==altToplam));



    Assert.assertTrue(toplam==altToplam);

    BekleKapat();













    }

}
