package search;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.List;

public class DropDownMenu extends CommonAPI {


    // getText method using List<WebElement>
    @Test
    public void dropDown() {
        List<WebElement> elementList = driver.findElements(By.cssSelector(".searchSelect"));
        for (WebElement element: elementList) {
            System.out.println(element.getText());
        }
    }

//    @Test
//    public void dropDown2() {
//
//    }


}
