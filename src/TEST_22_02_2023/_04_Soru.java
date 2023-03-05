package TEST_22_02_2023;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _04_Soru extends BaseDriver {

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
    public void Test3() {
        String a = "4";
        String b = "5";


        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement calculate = driver.findElement(By.cssSelector("a[id='calculate']"));
        calculate.click();

        WebElement ilkKutu = driver.findElement(By.cssSelector("input[id='number1']"));
        ilkKutu.sendKeys(a);

        WebElement ikinciKutu = driver.findElement(By.cssSelector("input[id='number2']"));
        ikinciKutu.sendKeys(b);

        WebElement hesapla=  driver.findElement(By.cssSelector("input[id='calculate']"));
        hesapla.click();


      WebElement sonuc =  driver.findElement(By.cssSelector("span[id='answer']"));



        System.out.println("sonuc = " + sonuc.getText());


    }
}
