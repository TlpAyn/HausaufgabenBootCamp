package _28_02_2023_Action_Class;


//http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html
//        buradaki ülke ve şehirleri findElements ile topluca bularak bir döngü ile bütün şehirleri doğru ülkere dağıtınız.

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Odev1 extends BaseDriver {


    @Test

    public void Test1() {

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");


        MyFunc.Bekle(2);

        List<WebElement> citys = driver.findElements(By.xpath("//div[@class='dragDropSmallBox' and starts-with(@id, 'a')]"));
        List<WebElement> countrys = driver.findElements(By.xpath("//div[@class='dragDropSmallBox' and starts-with(@id, 'q')]"));
        List<WebElement> bosluklar = driver.findElements(By.xpath("//div[@class='destinationBox']"));


        MyFunc.Bekle(1);


        for (int i = 0; i < citys.size(); i++) {
            Actions actions = new Actions(driver);

            actions.clickAndHold(citys.get(i)).build().perform();
            MyFunc.Bekle(1);


            for (WebElement c:countrys) {

                if((citys.get(i).getAttribute("id").substring(1).equals(c.getAttribute("id").substring(1)))){

                    actions.moveToElement(c,100,0).release().build().perform();
                }
            }
        }
    }
}






//            actions.moveToElement()


//
//            do {
//
//                actions.moveToElement(bosluklar.get(i)).release().build().perform();
//                actions.clickAndHold(citys.get(i)).build().perform();
//                actions.moveToElement(bosluklar.get(i+1)).release().build().perform();
//                actions.clickAndHold(citys.get(i+1)).build().perform();
////                actions.moveToElement(bosluklar.get(i+2)).release().build().perform();
////                actions.clickAndHold(citys.get(i+2)).build().perform();
////                actions.moveToElement(bosluklar.get(i+3)).release().build().perform();
////                actions.clickAndHold(citys.get(i+3)).build().perform();
////                actions.moveToElement(bosluklar.get(i+4)).release().build().perform();
////                actions.clickAndHold(citys.get(i+4)).build().perform();
////                actions.moveToElement(bosluklar.get(i+5)).release().build().perform();
////                actions.clickAndHold(citys.get(i+5)).build().perform();
////                actions.moveToElement(bosluklar.get(i+6)).release().build().perform();
////                actions.clickAndHold(citys.get(i+6)).build().perform();
////                actions.moveToElement(bosluklar.get(i+7)).release().build().perform();
////                actions.clickAndHold(citys.get(i+7)).build().perform();
////                actions.moveToElement(bosluklar.get(i+8)).release().build().perform();
////                actions.clickAndHold(citys.get(i+8)).build().perform();
//
//            }while (bosluklar.get(i).getCssValue("background-color").equals("green"));
//
//
//        }
//    }
//}
////        for (WebElement c : citys) {
////            Actions actions = new Actions(driver);
////
////            actions.clickAndHold(c).build().perform();
////
////            MyFunc.Bekle(1);
////
////            for (int i = 0; i < bosluklar.size(); i++) {
////                actions.moveToElement(bosluklar.get(i)).release().build().perform();
////
////            }
////        }
////
//////
////            int i =0;
////            do {
////                actions.moveToElement(bosluklar.get(i)).release().build().perform();
////                i++;
////            }while (bosluklar.get(i).getCssValue("background-color").equals("green"));
////
////
//
////
////
////                while (bosluklar.get(i).getCssValue("background-color").equals("green")){
////                    actions.clickAndHold(c).build().perform();
////                    MyFunc.Bekle(1);
////
////
////
////                }
//
//
//
////
//            for (WebElement b : bosluklar) {
//
//                actions.moveToElement(b).release().build().perform();

//                while (b.getCssValue("background-color").equals("#DDD")) {
//                    Action action = actions.clickAndHold(c).build();
//                    MyFunc.Bekle(1);
//                    actions.moveToElement(b).build();
//                    action.perform();
//
//
//                    MyFunc.bekle(1);
////                Action action = actions.clickAndHold(c).build();
////              action=  actions.moveToElement(b).release().build();
////              action.perform();










//
//        for (WebElement a : citys) {
//
//
//
//
//            for (WebElement b :countrys) {
//
//                WebElement BosKutu = driver.findElement(By.xpath(b+"/following-sibling::div[1]"));
//
//                if(a.getAttribute("id").substring(1).equals(b.getAttribute("id").substring(1))){
//
////                    aksiyonlar.dragAndDrop((WebElement) citys, BosKutu);
//                }
//
//
//
//            }
//
//
//            }
//
//
//
//            MyFunc.bekle(1);
//
//
//        }
//
//
//
////            a.getAttribute("id").substring(1);
//////            System.out.println("a.getText() = " + a.getText());
////            switch (a.getAttribute("id")) {
////
////                case 1:
////
////                    System.out.println(" Oslo calsiisiyor");
////                    WebElement ilkkutu = driver.findElement(By.xpath("//div[@class='destinationBox'][1]"));
////
////                    aksiyonlar.dragAndDrop(a, ilkkutu).build().perform();
////                    break;
////                case 2:
////                    System.out.println("madrid te ok");
////                    aksiyonlar.clickAndHold(a).build().perform();
////                    aksiyonlar.moveToElement(driver.findElement(By.xpath("//div[@class='destinationBox'][2]"))).release().build().perform();
////                    break;
////                case 3:
////                    aksiyonlar.clickAndHold(a).build().perform();
////                    aksiyonlar.moveToElement(driver.findElement(By.xpath("//div[@class='destinationBox'][3]"))).release().build().perform();
////                    break;
////                case 4:
////                    aksiyonlar.clickAndHold(a).build().perform();
////                    aksiyonlar.moveToElement(driver.findElement(By.xpath("//div[@class='destinationBox'][4]"))).release().build().perform();
////                    break;
//////                case 5:
//////                    aksiyonlar.clickAndHold(a).build().perform();
//////                    aksiyonlar.moveToElement(driver.findElement(By.xpath("//div[@class='destinationBox'][5]"))).release().build().perform();
//////                    break;
//////                case "Washington":
//////                    aksiyonlar.clickAndHold(a).build().perform();
//////                    aksiyonlar.moveToElement(driver.findElement(By.xpath("//div[@class='destinationBox'][6]"))).release().build().perform();
//////                    break;
////////                case "Hanoi":
////////                case "London":
////////                case "Santiago":
////////                case "Copenhagen":
////////                case "Stockholm":
////////                case "Nairobi":
////////                case "Kuala Lumpur":
////////                case "New Dehli":
////////                case "Paris":
////            }
////
////
////        }
//    }
//
//
////div[@class='dragDropSmallBox' and starts-with(@id,'q')]/following-sibling::div[1]