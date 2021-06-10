package instagramHome;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.security.Key;

public class InstagramHomePage extends CommonAPI {

//    @Test
//    public void test1() {
//        driver.findElement(By.name("password")).sendKeys("1234", Keys.ENTER);
//    }

   // @Test
    public void test2() throws InterruptedException {
//        WebElement passwordInput = driver.findElement(By.name("password"));
//
//        passwordInput.click();
//        passwordInput.sendKeys("rtkjn");
//        passwordInput.sendKeys(Keys.ENTER);

        driver.findElement(By.name("username")).sendKeys("jisan", Keys.ENTER);
        driver.findElement(By.name("password")).sendKeys("jisan", Keys.ENTER);

        Thread.sleep(2000);
    }

    //@Test
    public void test3() throws InterruptedException {
        // css 1 attribute
        driver.findElement(By.cssSelector("input[type='text']")).sendKeys("ra", Keys.ENTER);

        //css 2 attributes
        driver.findElement(By.cssSelector("input[name='username'][type='text']")).sendKeys("nd",Keys.ENTER);



        // xpath - 2 attributes
        driver.findElement(By.xpath("//input[@name='username' and @type='text']")).sendKeys("om",Keys.ENTER);
        Thread.sleep(5000);
    }

    @Test
    public void test4() throws InterruptedException {
        //dynamic css1 (*) - locator contains a sub string
        driver.findElement(By.cssSelector("input[name*='user']")).sendKeys("ran", Keys.ENTER);

        //dynamic css2 (^) - locator name starts with
        driver.findElement(By.cssSelector("input[name^='user']")).sendKeys("dom", Keys.ENTER);

        //dynamic css3($)  - locator name ends with
        driver.findElement(By.cssSelector("input[name$='name']")).sendKeys("aaaa", Keys.ENTER);
        Thread.sleep(3000);
    }
}