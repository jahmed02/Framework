package testChase;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestMenu extends CommonAPI {

    @Test
    public void test1() {
        driver.findElement(By.cssSelector("img.single-logo-icon")).click();
    }

//    @Test
//    public void test2(){
//        driver.findElement(By.id("userId-text-input-field")).click();
//    }
}
