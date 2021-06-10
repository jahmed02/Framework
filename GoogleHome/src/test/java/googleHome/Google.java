package googleHome;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.WebElementHandler;
import org.testng.annotations.Test;

import java.util.List;

public class Google extends CommonAPI {


//    @Test
//    public void test1(){
//       // driver.findElement(By.className("gLFyf")).sendKeys("Micky", Keys.ENTER);
//
//        // css selector type
//        driver.findElement(By.cssSelector(".gLFyf")).sendKeys("Jisan", Keys.ENTER);
//        clearInputField("input.gLFyf");
//    }
//
//    @Test
//    public void test2() throws InterruptedException {
//        driver.findElement(By.cssSelector("input.gLFyf")).sendKeys("Adib", Keys.ENTER);
//        clearInputField("input.gLFyf");
//        Thread.sleep(3000);
//    }
//
//    @Test
//    public void test3() throws InterruptedException {
//        //driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("Micky", Keys.ENTER);
//
//        WebElement searchBar= driver.findElement(By.cssSelector(".gLFyf"));
//        searchBar.sendKeys("JIsan " + "Micky ");
//        searchBar.sendKeys(Keys.ENTER);
//        Thread.sleep(3000);
//    }

    @Test
    public void test4(){
//        WebElement search = driver.findElement(By.className("gLFyf"));
//        search.sendKeys("JIsan",Keys.ENTER);

        driver.findElement(By.className("gLFyf")).sendKeys("Jisan", Keys.ENTER);
    }
}
