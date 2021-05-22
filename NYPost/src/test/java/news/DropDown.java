package news;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class DropDown extends CommonAPI {

    // getText method using List<WebElement>
    @Test
    public void dropDown() {
        List<WebElement> elementList = driver.findElements(By.cssSelector("svg.menu-icon-svg"));
        for (WebElement element: elementList) {
            System.out.println(element.getText());
        }
    }

    //using print text
    @Test
    public void dropDown2(){
        List<String> printMenu = getListOfText("");
        printText(printMenu);
    }
}
