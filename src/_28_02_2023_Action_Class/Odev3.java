package _28_02_2023_Action_Class;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Odev3 extends BaseDriver {


    @Test

    public void Tes3() {

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html");


        List<WebElement> nesneler = driver.findElements(By.xpath("//li[starts-with(@id, 'node')]"));
        List<WebElement> kutular = driver.findElements(By.xpath("//ul[starts-with(@id, 'box')]"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        int x = 0;

        MyFunc.Bekle(1);


        for (int i = 0; i < nesneler.size(); i++) {
            Actions actions = new Actions(driver);

            actions.clickAndHold(nesneler.get(i)).build().perform();
            MyFunc.Bekle(1);


            for (WebElement c : kutular) {

                try {
                    driver.switchTo().alert().accept();

                } catch (NoAlertPresentException a) {

                    x++;

                }


                if ((nesneler.get(i).getAttribute("groupid").equals(c.getAttribute("id")))) {

                    actions.moveToElement(c).release().build().perform();
                }
            }
        }

        System.out.println("toplam Catch yakalama sayisi " + x);
    }
}


//
//    challenge sorusu
//    Ödev 3: http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html
//    buradaki bütün şehirleri bütün ülkere doğru şekilde topluca dağıtınız.
