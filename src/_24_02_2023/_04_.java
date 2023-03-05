package _24_02_2023;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _04_ extends BaseDriver {

//    Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]
//
//    Calculate'e tıklayınız.
//
//    İlk input'a herhangi bir sayı giriniz.
//
//    İkinci input'a herhangi bir sayı giriniz.
//
//    Calculate button'una tıklayınız.
//
//    Sonucu alınız.
//
//    Sonucu yazdırınız.

    @Test

public void Test4(){
        String a = "4";
        String b = "5";


SiteyeGit("https://testpages.herokuapp.com/styled/index.html");

        WebElement calculate = driver.findElement(By.xpath("//a[@id='calculatetest']"));
        calculate.click();

        Bekle(1);
        WebElement ilkKutu = driver.findElement(By.xpath("//*[@id='number1']"));
        ilkKutu.sendKeys(a);
        Bekle(1);
        WebElement ikinciKutu = driver.findElement(By.xpath("//*[@id='number2']"));
        ikinciKutu.sendKeys(b);
        Bekle(1);
        WebElement hesapla=  driver.findElement(By.xpath("//input[@type='submit']"));
        hesapla.click();

        Bekle(1);
        WebElement sonuc =  driver.findElement(By.xpath("//span[@id='answer']"));



        System.out.println("sonuc = " + sonuc.getText());







    }
}
