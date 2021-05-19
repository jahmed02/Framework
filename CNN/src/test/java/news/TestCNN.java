package news;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCNN extends CommonAPI {

    @Test
    public void test1() {
        driver.findElement(By.cssSelector("svg.search-icon")).click();
    }

//    @Test
//    public void test2() {
//        driver.findElement(By.cssSelector("svg.search-icon")).click();
//    }

}
