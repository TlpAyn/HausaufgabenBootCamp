package _03_08_2023_Selenium;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _1_ve_2 extends BaseDriver {


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

            Select op =new Select(Operation);
            op.selectByIndex(i+1);

            MyFunc.Bekle(1);

            Calculate.click();
            MyFunc.Bekle(1);

            System.out.println("sonuc = " + Answer.getAttribute("value"));
            
            if(i==0){
                Assert.assertTrue(Answer.getAttribute("value").equals(Integer.toString(x-y)));
            } else if (i==1) {
                Assert.assertTrue(Answer.getAttribute("value").equals(Integer.toString(x*y)));
            } else if (i==2) { Assert.assertTrue(Answer.getAttribute("value").equals(Integer.toString(x/y)));

            } else if (i==3) { Assert.assertTrue(Answer.getAttribute("value").equals(Integer.toString(x)+ Integer.toString(y)));

            }
            MyFunc.Bekle(1);

            Clear.click();

            ilkBosluk.clear();

            ikinciBosluk.clear();

            MyFunc.Bekle(1);
        }

        }
    }

