package homePage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class DropDown extends CommonAPI {

    @Test
    public void dropDownYT(){
        List<WebElement> elementList = driver.findElements(By.cssSelector("#guide-icon"));
        for (WebElement element: elementList) {
            System.out.println(element.getText());
        }
    }
}
