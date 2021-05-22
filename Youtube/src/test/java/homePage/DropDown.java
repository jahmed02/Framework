package homePage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class DropDown extends CommonAPI {


    // without generic getText method
//    @Test
//    public void dropDownYT(){
//        List<WebElement> elementList = driver.findElements(By.cssSelector("#guide-icon"));
//        for (WebElement element: elementList) {
//            System.out.println(element.getText());
//        }
//    }


    // using generic getText method

    @Test
    public void dropDown2() {
        List<String> menuList = getListOfTextXpath("//yt-icon[@id='guide-icon']");
        for (String list: menuList){
            System.out.println(list);
        }
    }
}
