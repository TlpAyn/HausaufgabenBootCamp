package _08_03_2023_Selenium_2;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _08_03_2023_SeleniumOdev2 extends BaseDriver {

    @Test

    public void Test1(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement alert = driver.findElement(By.id("alerttest"));
        alert.click();
        System.out.println(driver.getCurrentUrl());

    }
    @Test

    public void Test2(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement alert = driver.findElement(By.id("alerttest"));
        alert.click();
        System.out.println(driver.getCurrentUrl());

        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());

        WebElement Basic_Ajax = driver.findElement(By.linkText("Basic Ajax"));
        Basic_Ajax.click();

        System.out.println(driver.getCurrentUrl());

    }

    @Test

    public void Test3(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement Playground  = driver.findElement(By.id("Find By Playground"));
        Playground.click();

        WebElement p5  = driver.findElement(By.id("p5"));

    }

    @Test

    public void Test4(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement Search  = driver.findElement(By.id("Search"));
        Search.click();

        WebElement p5  = driver.findElement(By.tagName("h1"));

        System.out.println(p5.getText());

        WebElement search  = driver.findElement(By.xpath("//input[@value='Search']"));
        search.click();

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());//input[@value='Search']

    }
    @Test

    public void Test5(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement Search  = driver.findElement(By.id("Search"));
        Search.click();

        WebElement p5  = driver.findElement(By.tagName("h1"));

        System.out.println(p5.getText());

        WebElement search  = driver.findElement(By.xpath("//input[@value='Search']"));
        search.click();

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());//input[@value='Search']

    }

}
