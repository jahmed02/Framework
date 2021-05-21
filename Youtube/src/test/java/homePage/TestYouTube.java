package homePage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestYouTube extends CommonAPI {

    @Test
    public void test1(){
//        clickOnWebElement("logo-icon");
//        clickOnWebElement("guide-icon");

        //driver.findElement(By.xpath("//*[@id=\"text\"]")).click();

        driver.findElement(By.id("guide-icon")).click();
    }
}
