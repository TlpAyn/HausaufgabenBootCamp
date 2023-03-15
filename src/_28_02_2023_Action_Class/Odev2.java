package _28_02_2023_Action_Class;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Odev2 extends BaseDriver {
  //  http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html
//    buradaki bütün öğrencileri bütün kutucukları doldurana kadar atınız.

@Test
    public void Test2 () {


    driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html");

    List<WebElement> ogrenciler = driver.findElements(By.xpath("//li[starts-with(@id, 'node')]"));
    WebElement kutularA = driver.findElement(By.xpath("//ul[@id='box1']"));
    WebElement kutularB = driver.findElement(By.xpath("//ul[@id='box2']"));
    WebElement kutularC = driver.findElement(By.xpath("//ul[@id='box3']"));
    WebElement kutularD = driver.findElement(By.xpath("//ul[@id='box4']"));
    WebElement kutularE = driver.findElement(By.xpath("//ul[@id='box5']"));



    MyFunc.Bekle(1);


    for (int i = 0; i < 4 ; i++) {

        Actions actions = new Actions(driver);

        actions.clickAndHold(ogrenciler.get(i)).build().perform();

        MyFunc.Bekle(1);

        actions.moveToElement(kutularA).release().build().perform();
    }

    for (int i = 4; i < 8 ; i++) {

        Actions actions = new Actions(driver);

        actions.clickAndHold(ogrenciler.get(i)).build().perform();

        MyFunc.Bekle(1);

        actions.moveToElement(kutularB).release().build().perform();
    }

    for (int i = 8; i < 12; i++) {

        Actions actions = new Actions(driver);

        actions.clickAndHold(ogrenciler.get(i)).build().perform();

        MyFunc.Bekle(1);

        actions.moveToElement(kutularC).release().build().perform();
    }

    for (int i = 12; i < 16 ; i++) {

        Actions actions = new Actions(driver);

        actions.clickAndHold(ogrenciler.get(i)).build().perform();

        MyFunc.Bekle(1);

        actions.moveToElement(kutularD).release().build().perform();
    }

    for (int i = 16; i < 21 ; i++) {

        Actions actions = new Actions(driver);

        actions.clickAndHold(ogrenciler.get(i)).build().perform();

        MyFunc.Bekle(1);

        actions.moveToElement(kutularE).release().build().perform();
    }



//        for (int j = 1; j < 5; j++) {
//
//            actions.moveToElement(kutular.get(j)).release().build().perform();
//
//        }

//        for (WebElement c:kutular) {
//
//            if((kutular.get(i).getAttribute("id").substring(1).equals(c.getAttribute("id").substring(1)))){
//
//                actions.moveToElement(c).release().build().perform();
//            }
//        }




    //li[starts-with(@id,'node')]

//ul[starts-with(@id,'box')]






}
}
