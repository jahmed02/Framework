package news;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCNN extends CommonAPI {

    //@Test
    public void test1() throws InterruptedException {
        driver.findElement(By.cssSelector("svg.search-icon")).click();
        driver.findElement(By.xpath("//a[contains(text(),'US')]")).click();
        driver.findElement(By.xpath("//button[@data-test='searchButton']")).click();
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("random", Keys.ENTER);
        Thread.sleep(3000);
    }

   // @Test
    public void test2() {
        driver.findElement(By.cssSelector("svg.search-icon")).click();
    }

    //@Test
    public void test3(){
        driver.findElement(By.cssSelector("svg.search-icon")).click();
        driver.findElement(By.id("edition-picker-toggle-desktop")).click();
        driver.findElement(By.xpath("//ul[@class='sc-cSHVUG bYPcOh']//a[@name='politics']")).click();
    }


    @Test
    public void test4() throws InterruptedException {
        driver.findElement(By.cssSelector("svg.menu-icon")).click();
        driver.findElement(By.xpath("//ul[@class='sc-cSHVUG bYPcOh']//a[@name='politics']")).click();
//        Assert.assertTrue(true);
        Thread.sleep(2000);


    }
}
