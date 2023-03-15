package _03_08_2023_Selenium;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class soru_2 extends BaseDriver {
//    2-
//    Senaryo
//1- https://www.youtube.com/ adresine gidiniz
//            2- "Selenium" kelimesi ile video aratınız.
//            3- Listelenen sonuçlarda 80 videoaya kadar lsiteyi uzatınız.
//            4- Son videonun title ını yazdırınız.


    @Test
    public void Tets2() {
        driver.get("https://youtube.com");

        List<WebElement> datenSchutz = driver.findElements(By.xpath("//*[@id=\"content\"]/div[2]/div[6]/div[1]/ytd-button-renderer[2]/yt-button-shape/button/yt-touch-feedback-shape/div/div[2]"));

        if (datenSchutz.size() > 0)
            datenSchutz.get(0).click();

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        Bekle(1);
        WebElement search = driver.findElement(By.cssSelector("input[id='search']"));
        search.sendKeys("Selenium");

        Bekle(1);
        WebElement searchIcon = driver.findElement(By.cssSelector("#search-icon-legacy"));
        searchIcon.click();

        wait.until(ExpectedConditions.titleIs("Selenium - YouTube"));

        List<WebElement> VideoList = driver.findElements(By.xpath("//*[@class='style-scope ytd-item-section-renderer']"));


        for (int i = 0; i < 80; i++) {
            Bekle(1);
//            wait.until(ExpectedConditions.visibilityOf(VideoList.get(i)));
            jse.executeScript("arguments[0].scrollIntoView(true);", VideoList.get(i));
            wait.until(ExpectedConditions.elementToBeClickable(VideoList.get(i+1)));

        }
        Bekle(2);
        for (int i = 40; i < 60; i++) {

            jse.executeScript("arguments[0].scrollIntoView(true);", VideoList.get(i));
Bekle(1);
        }
        Bekle(2);
        for (int i = 60; i < 80; i++) {

            jse.executeScript("arguments[0].scrollIntoView(true);", VideoList.get(i));
Bekle(1);
        }
        jse.executeScript("arguments[0].scrollIntoView(true);", VideoList.get(80));
        System.out.println(VideoList.get(80).findElement(By.id("vidoe-title")).getText());


    }
}
