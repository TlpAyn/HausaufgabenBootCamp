package _08_03_2023_Selenium_2;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class _08_03_2023_SeleniumOdev2 extends BaseDriver {

    @Test

    public void Test1() {
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement alert = driver.findElement(By.id("alerttest"));
        alert.click();
        System.out.println(driver.getCurrentUrl());

    }

    @Test

    public void Test2() {
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

    public void Test3() {
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement Playground = driver.findElement(By.linkText("Find By Playground"));
        Playground.click();

        WebElement p5 = driver.findElement(By.id("p5"));

    }

    @Test

    public void Test4() {
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement Search = driver.findElement(By.id("Search"));
        Search.click();

        WebElement p5 = driver.findElement(By.tagName("h1"));

        System.out.println(p5.getText());

        WebElement search = driver.findElement(By.xpath("//input[@value='Search']"));
        search.click();

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());//input[@value='Search']

    }

    @Test

    public void Test5() {
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement Search = driver.findElement(By.id("Search"));
        Search.click();

        WebElement p5 = driver.findElement(By.tagName("h1"));

        System.out.println(p5.getText());

        WebElement search = driver.findElement(By.xpath("//input[@value='Search']"));
        search.click();

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());//input[@value='Search']

    }

    @Test
    public void Test6() {
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement fakeAlerts = driver.findElement(By.id("fakealerttest"));
        fakeAlerts.click();

        WebElement p5 = driver.findElement(By.id("fakealert"));
        p5.click();

        System.out.println(p5.getText());

        WebElement OK_Butonu = driver.findElement(By.id("dialog-ok"));
        OK_Butonu.click();

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());//input[@value='Search']

    }

    @Test
    public void Test7() {
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement fakeAlerts = driver.findElement(By.id("fakealerttest"));
        fakeAlerts.click();

        WebElement p5 = driver.findElement(By.id("modaldialog"));
        p5.click();

        System.out.println(p5.getText());

        WebElement OK_Butonu = driver.findElement(By.id("dialog-ok"));
        OK_Butonu.click();

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());//input[@value='Search']

    }

    @Test
    public void Test8() {
        driver.get("http://demo.seleniumeasy.com/bootstrap-alert-messages-demo.html");

        WebElement NormalSuccseButton = driver.findElement(By.id("normal-btn-success"));
        NormalSuccseButton.click();


        WebElement xButton = driver.findElement(By.xpath(" //div[@class='alert alert-success alert-normal-success'] //button"));
        xButton.click();


        WebElement GreenBox = driver.findElement(By.xpath("//div[@class='alert alert-success alert-normal-success']"));

    }

    @Test
    public void Test9() {
        driver.get("http://demo.seleniumeasy.com/bootstrap-alert-messages-demo.html");

        WebElement NormalSuccseButton = driver.findElement(By.id("normal-btn-success"));
        NormalSuccseButton.click();


        WebElement xButton = driver.findElement(By.xpath(" //div[@class='alert alert-success alert-normal-success'] //button"));
        xButton.click();


        WebElement GreenBox = driver.findElement(By.xpath("//div[@class='alert alert-success alert-normal-success']"));

        Assert.assertFalse(GreenBox.isDisplayed());
    }

    @Test
    public void Test10() {
        driver.get("http://demo.seleniumeasy.com/basic-checkbox-demo.html");

        WebElement checkAll = driver.findElement(By.id("check1"));
        checkAll.click();


        WebElement UncheckAll = driver.findElement(By.xpath("//input[@value='Uncheck All']"));
        Assert.assertTrue(UncheckAll.isDisplayed());

        System.out.println(UncheckAll.getText());
    }

    @Test
    public void Test11() {
        driver.get("http://demo.seleniumeasy.com/basic-select-dropdown-demo.html");

        WebElement selectADay = driver.findElement(By.id("select-demo"));

        Select seleckMenu = new Select(selectADay);
//        int a = (int)(Math.random()*7);
//        seleckMenu.selectByIndex(a);

        for (int i = 0; i < 5; i++) {
            seleckMenu.selectByValue("Wednesday");
            MyFunc.Bekle(1);
        }
    }

    @Test
    public void Test12() throws InterruptedException {
        driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        WebElement inputForms = driver.findElement(By.xpath("//a[text()='Input Forms']"));
        inputForms.click();


        WebElement AjaxSubmit = driver.findElement(By.xpath("(//a[text()='Ajax Form Submit'])[2]"));
        AjaxSubmit.click();

        WebElement name = driver.findElement(By.id("title"));
        name.sendKeys("Hamdi");

        WebElement description = driver.findElement(By.id("description"));
        description.sendKeys("Birseyler yazilir , sadece brseyler");


        WebElement submitButton = driver.findElement(By.id("btn-submit"));
        submitButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("submit-control")));


        WebElement dogrulamaYazisi = driver.findElement(By.id("submit-control"));
        System.out.println("dogrulamaYazisi = " + dogrulamaYazisi.getText());

        Assert.assertTrue(dogrulamaYazisi.isDisplayed());


    }

    @Test
    public void Test13() {
        driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        WebElement listBox = driver.findElement(By.xpath("//a[text()='List Box']"));
        listBox.click();

        MyFunc.Bekle(2);

        WebElement Boot = driver.findElement(By.xpath("(//a[text()='Bootstrap List Box'])[2]"));
        Boot.click();

        MyFunc.Bekle(2);

        WebElement ilki = driver.findElement(By.xpath("//li[text()='bootstrap-duallist ']"));
        //li[text()='bootstrap-duallist ']
        ilki.click();

        MyFunc.Bekle(2);

        WebElement iletec = driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-chevron-right']"));
        iletec.click();

        MyFunc.Bekle(2);

        WebElement ikincisi = driver.findElement(By.xpath("(//li[text()='Dapibus ac facilisis in'])[1]"));
        ikincisi.click();

        MyFunc.Bekle(2);

        iletec.click();

        MyFunc.Bekle(2);

        WebElement ilkMavi = driver.findElement(By.xpath("//li[text()='bootstrap-duallist ']"));
        ilkMavi.click();

        MyFunc.Bekle(2);

        WebElement ikinciMavi = driver.findElement(By.xpath("//li[@class='list-group-item active' and text()='Dapibus ac facilisis in']"));
        ikinciMavi.click();

        MyFunc.Bekle(2);

        WebElement ucuncusu = driver.findElement(By.xpath("//li[text()='Cras justo odio']"));
        ucuncusu.click();

        WebElement geriletec = driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-chevron-left']"));
        geriletec.click();

        MyFunc.Bekle(1);

        WebElement dorduncusu = driver.findElement(By.xpath("(//li[text()='Dapibus ac facilisis in' and @class='list-group-item'])[1]"));
        dorduncusu.click();

        geriletec.click();


    }

    @Test
    public void Test14() {
        driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");


        WebElement message = driver.findElement(By.id("user-message"));
        message.sendKeys("BeisspielMessage confirm ! go and go ");

        WebElement MesButton = driver.findElement(By.id("user-message"));
        MesButton.click();

        WebElement MesButtonText = driver.findElement(By.xpath("//button[@onclick='showInput();']"));
        System.out.println(MesButtonText.getText());

        //button[@onclick='showInput();']
    }

    @Test
    public void Test15() {
        driver.get("http://demo.seleniumeasy.com/basic-checkbox-demo.html");

        WebElement checkAll = driver.findElement(By.id("check1"));
        checkAll.click();


        WebElement UncheckAll = driver.findElement(By.xpath("//input[@value='Uncheck All']"));
        Assert.assertTrue(UncheckAll.isDisplayed());


    }

    @Test
    public void Test16() {
        driver.get("http://demo.seleniumeasy.com/basic-checkbox-demo.html");

        WebElement checkAll = driver.findElement(By.id("check1"));
        checkAll.click();


        WebElement UncheckAll = driver.findElement(By.xpath("//input[@value='Uncheck All']"));
        Assert.assertTrue(UncheckAll.isDisplayed());
    }

    @Test
    public void Test17() {
        driver.get("http://demo.seleniumeasy.com/basic-checkbox-demo.html");

        WebElement checkAll = driver.findElement(By.id("check1"));
        checkAll.click();


        WebElement UncheckAll = driver.findElement(By.xpath("//input[@value='Uncheck All']"));
        Assert.assertTrue(UncheckAll.isDisplayed());
    }

    @Test
    public void Test18() {
        driver.get("http://demo.seleniumeasy.com/basic-checkbox-demo.html");

        WebElement checkAll = driver.findElement(By.id("check1"));
        checkAll.click();


        WebElement UncheckAll = driver.findElement(By.xpath("//input[@value='Uncheck All']"));
        Assert.assertTrue(UncheckAll.isDisplayed());
    }

    @Test
    public void Test19() {
        driver.get("http://demo.seleniumeasy.com/basic-checkbox-demo.html");

        WebElement checkAll = driver.findElement(By.id("check1"));
        checkAll.click();


        WebElement UncheckAll = driver.findElement(By.xpath("//input[@value='Uncheck All']"));
        Assert.assertTrue(UncheckAll.isDisplayed());
    }

    @Test
    public void Test20() {
        driver.get("http://demo.seleniumeasy.com/basic-checkbox-demo.html");

        WebElement checkAll = driver.findElement(By.id("check1"));
        checkAll.click();


        WebElement UncheckAll = driver.findElement(By.xpath("//input[@value='Uncheck All']"));
        Assert.assertTrue(UncheckAll.isDisplayed());
    }

    @Test
    public void Test21() {
        driver.get("http://demo.seleniumeasy.com/basic-checkbox-demo.html");

        WebElement checkAll = driver.findElement(By.id("check1"));
        checkAll.click();


        WebElement UncheckAll = driver.findElement(By.xpath("//input[@value='Uncheck All']"));
        Assert.assertTrue(UncheckAll.isDisplayed());
    }


}
