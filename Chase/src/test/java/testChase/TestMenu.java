package testChase;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestMenu extends CommonAPI {

    @Test
    public void test1() {

//        driver.findElement(By.cssSelector("img.single-logo-icon")).click();
//        driver.navigate().refresh();
//        driver.navigate().back();
//        driver.navigate().forward();

//        clickOnWebElement("//img[contains(@class,'single-logo-icon')]");  // xpath
//        clickOnWebElement("//img[@class='single-logo-iconn']");
        //driver.findElement(By.xpath("//img[@class='single-logo-icon']")).click();

        driver.findElement(By.cssSelector(".jpui")).click();
    }

}
