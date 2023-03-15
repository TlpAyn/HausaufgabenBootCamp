package _03_08_2023_Selenium;

import Utlity.BaseDriver;
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

public class soru_1 extends BaseDriver {

//Senaryo
//1- https://testsheepnz.github.io/BasicCalculator.html sitesine gidiniz.
//2- random 100 e kadar 2 sayı üretiniz.
//3- Sayıları hesap makinesinin bütün fonksiyonları için çalıştırınız.
//4- Sonuçları Assert ile kontrol ediniz.
//5- Yukarıdaki işlemi 5 kez tekrar ettiriniz.

    @Test
    public void Soru1() {

        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        Actions actions = new Actions(driver);

        WebElement firstBox = driver.findElement(By.id("number1Field"));
        WebElement secondBox = driver.findElement(By.id("number2Field"));
        WebElement AddSelect = driver.findElement(By.id("selectOperationDropdown"));
        WebElement Calculate = driver.findElement(By.id("calculateButton"));
        WebElement AnswerBox = driver.findElement(By.id("numberAnswerField"));
        WebElement IntegerOnly = driver.findElement(By.id("integerSelect"));
        WebElement Clear = driver.findElement(By.id("clearButton"));

        int number1 = (int) (Math.random() * 100) + 1;
        int number2 = (int) (Math.random() * 100) + 1;

        String numbera = Integer.toString(number1);
        String numberb = Integer.toString(number2);



        for (int i = 0; i < 5; i++) {
           Bekle(3);


            int result =0;
            Select opSelect = new Select(AddSelect);

            switch (i) {
                case 0:
                    IntegerOnly.click();

                    firstBox.sendKeys(numbera);
                    secondBox.sendKeys(numberb);


                    wait.until(ExpectedConditions.elementToBeClickable(AddSelect));
                    opSelect.selectByIndex(1);

                    Calculate.click();

                    result = Integer.parseInt(numbera) - Integer.parseInt(numberb);

                    Assert.assertEquals(Integer.toString(result), AnswerBox.getAttribute("value"));

                    break;
                case 1:
                    IntegerOnly.click();

                    firstBox.clear();
                    secondBox.clear();

                    firstBox.sendKeys(numbera);
                    secondBox.sendKeys(numberb);


                    wait.until(ExpectedConditions.elementToBeClickable(AddSelect));
                    opSelect.selectByIndex(2);
                    wait.until(ExpectedConditions.elementToBeClickable(Calculate));

                    Calculate.click();

                    result = Integer.parseInt(numbera) * Integer.parseInt(numberb);

                    Assert.assertEquals(Integer.toString(result), AnswerBox.getAttribute("value"));

                    break;
                case 2:
                    IntegerOnly.click();

                    firstBox.clear();
                    secondBox.clear();

                    firstBox.sendKeys(numbera);
                    secondBox.sendKeys(numberb);


                    wait.until(ExpectedConditions.elementToBeClickable(AddSelect));
                    opSelect.selectByIndex(3);
                    wait.until(ExpectedConditions.elementToBeClickable(Calculate));

                    Calculate.click();

                    result = Integer.parseInt(numbera) / Integer.parseInt(numberb);

                    Assert.assertEquals(Integer.toString(result), AnswerBox.getAttribute("value"));
                    break;
                case 3:


                    IntegerOnly.click();


                    firstBox.clear();
                    secondBox.clear();

                    firstBox.sendKeys(numbera);
                    secondBox.sendKeys(numberb);


                    wait.until(ExpectedConditions.elementToBeClickable(AddSelect));
                    opSelect.selectByIndex(4);
                    wait.until(ExpectedConditions.elementToBeClickable(Calculate));

                    Calculate.click();

                    String sonuc= Integer.toString(number1)+ Integer.toString(number2);

                    Assert.assertEquals(sonuc, AnswerBox.getAttribute("value"));
                  break;

            }

        }


    }
}
