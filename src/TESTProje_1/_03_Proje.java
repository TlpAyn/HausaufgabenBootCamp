package TESTProje_1;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_Proje extends BaseDriver {
    //• Siteye gidin.
//• Siteye giriş yapın.
//• “CREATE NEW” Butonuna tıklayınız.
//• Customer altındaki formu doldurunuz.
//• Create Butonuna tıklatınız.


    @Test
    public void TEST3 (){
        driver.get("https://itera-qa.azurewebsites.net/");


        WebElement createNew = driver.findElement(By.xpath("//a[@class='navbar-brand']"));
        createNew.click();

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

    }
}
