package _03_08_2023_Selenium;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Senaryo_1_Senaryo_2 extends BaseDriver {
    @Test

    public void Test1() {


        driver.get("https://testsheepnz.github.io/BasicCalculator.html");

        JavascriptExecutor js = (JavascriptExecutor) driver;


        WebElement ilkBosluk = driver.findElement(By.id("number1Field"));
        WebElement ikinciBosluk = driver.findElement(By.id("number2Field"));
        WebElement Operation = driver.findElement(By.id("selectOperationDropdown"));
        WebElement Calculate = driver.findElement(By.id("calculateButton"));
        WebElement Answer = driver.findElement(By.id("numberAnswerField"));
        WebElement Clear = driver.findElement(By.id("clearButton"));
        WebElement IntegerTusu = driver.findElement(By.id("integerSelect"));


        js.executeScript("arguments[0].scrollIntoView(true);", Clear);


        for (int i = 0; i < 4; i++) {
            IntegerTusu.click();

            MyFunc.Bekle(1);

            int x = (int) (Math.random() * 100);
            int y = (int) (Math.random() * 100);

            MyFunc.Bekle(1);

            ilkBosluk.sendKeys(Integer.toString(x));
            MyFunc.Bekle(1);
            ikinciBosluk.sendKeys(Integer.toString(y));


            MyFunc.Bekle(1);

            Select op = new Select(Operation);
            op.selectByIndex(i + 1);

            MyFunc.Bekle(1);

            Calculate.click();
            MyFunc.Bekle(1);

            System.out.println("sonuc = " + Answer.getAttribute("value"));

            if (i == 0) {
                Assert.assertTrue(Answer.getAttribute("value").equals(Integer.toString(x - y)));
            } else if (i == 1) {
                Assert.assertTrue(Answer.getAttribute("value").equals(Integer.toString(x * y)));
            } else if (i == 2) {
                Assert.assertTrue(Answer.getAttribute("value").equals(Integer.toString(x / y)));

            } else if (i == 3) {
                Assert.assertTrue(Answer.getAttribute("value").equals(Integer.toString(x) + Integer.toString(y)));

            }
            MyFunc.Bekle(1);

            Clear.click();

            ilkBosluk.clear();
            ikinciBosluk.clear();

            MyFunc.Bekle(1);

            BekleKapat();
        }

    }

    @Test

    public void Test2() {
//            Senaryo
//            1- https://www.youtube.com/ adresine gidiniz
//            2- "Selenium" kelimesi ile video aratınız.
//            3- Listelenen sonuçlarda 80 videoaya kadar lsiteyi uzatınız.
//            4- Son videonun title ını yazdırınız.


        driver.get("https://www.youtube.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        Actions actions =new Actions(driver);



        List<WebElement> datenSchutz = driver.findElements(By.xpath("//button[@aria-label='Verwendung von Cookies und anderen Daten zu den beschriebenen Zwecken akzeptieren']"));

        if (datenSchutz.size() > 0)
            datenSchutz.get(0).click();

//        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@id='search']")));
        MyFunc.Bekle(2);

        WebElement search = driver.findElement(By.xpath("//input[@id='search']"));
        search.sendKeys("Selenium");

        WebElement searchButton = driver.findElement(By.xpath("//button[@id='search-icon-legacy']//yt-icon"));
        searchButton.click();

        MyFunc.Bekle(2);

        js.executeScript("window.scrollBy(0,300);"); // ilk videoya gelmek icin.

MyFunc.Bekle(1);
        for (int i = 0; i < 6; i++) {
            MyFunc.Bekle(1);
            js.executeScript("window.scrollBy(0,3300);");
        }

    }
}

