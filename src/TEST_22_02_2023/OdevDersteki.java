package TEST_22_02_2023;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OdevDersteki extends BaseDriver {

    @Test
    public void Test1() {

        driver.get("https://formsmarts.com/form/yu?mode=h5");

        MyFunc.Bekle(1);

        WebElement businessClick = driver.findElement(By.cssSelector("input[value='Business']"));

        businessClick.click();

        MyFunc.Bekle(1);

        WebElement xyz = driver.findElement(By.cssSelector("select[aria-required='true']"));

        xyz.click();

        MyFunc.Bekle(1);

        WebElement OnlinAdvertising  = driver.findElement(By.cssSelector("option[value='Online Advertising']"));

        OnlinAdvertising.click();

        MyFunc.Bekle(2);

        WebElement EveryDay  = driver.findElement(By.cssSelector("input[value='Every Day']"));

        EveryDay.click();

        MyFunc.Bekle(2);

        WebElement good  = driver.findElement(By.cssSelector("input[id='u_ibE_4589_0']"));

        good.click();

        MyFunc.Bekle(2);

        WebElement XYZ2  = driver.findElement(By.cssSelector("select[value='Good']"));

        XYZ2.click();

        MyFunc.Bekle(2);

        WebElement ucuncuSecenek  = driver.findElement(By.cssSelector("select[id='u_ibE_4597'] > :nth-child(4)"));

        ucuncuSecenek.click();

        MyFunc.Bekle(2);

        driver.quit();










    }
}
