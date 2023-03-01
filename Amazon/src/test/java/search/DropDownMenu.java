package search;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.List;

public class DropDownMenu extends CommonAPI {


    // getText method using List<WebElement> - without calling methods from commonapi
    @Test
    public void dropDown() {
        List<WebElement> elementList = driver.findElements(By.cssSelector(".searchSelect"));
        for (WebElement element: elementList) {
            //System.out.println(element.getText());
            System.out.println(element.getAttribute("id=navbar-main"));
        }
    }



    // using the generic method from CommonApi (getListOfText)
    //@Test
    public void dropDown2() {
        List<String> lisOfText = getListOfText(".searchSelect");
        for (String listText: lisOfText) {
            System.out.println(listText);
        }
    }


    // using printText method
    //@Test
    public void dropDown3() {
        List<String> textList = getListOfText(".searchSelect");
        printText(textList);
    }



}
