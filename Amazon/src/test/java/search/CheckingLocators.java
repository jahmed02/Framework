package search;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class CheckingLocators extends CommonAPI {

   //@Test
    public void test1() throws InterruptedException {

       //dynamic css - selecting child locators
       driver.findElement(By.cssSelector("a#nav-hamburger-menu")).click();  // clicking dropdown menu first
       driver.findElement(By.cssSelector("ul.hmenu.hmenu-visible>li:nth-of-type(2)")).click();   // after dropdown it's choosing best sellers

       //another way to write it
       //driver.findElement(By.cssSelector("ul.hmenu.hmenu-visible li:nth-child(2)")).click();
       Thread.sleep(3000);
   }


    @Test
    public void test2() throws InterruptedException {

        //dynamic css - selecting customer service
        //driver.findElement(By.cssSelector("div#nav-xshop>a:nth-of-type(2)")).click();

        driver.findElement(By.cssSelector("div#nav-xshop a:nth-child(7)")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Amplify Black Voices')]")).click();
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Gotcha", Keys.ENTER);
        Thread.sleep(3000);
    }

    //@Test
    public void test3() throws InterruptedException {
        driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("amazon", Keys.ENTER);
        Thread.sleep(3000);
    }

    //@Test
    public void precedingXpath(){
        driver.findElement(By.xpath("")).click();
    }

    //@Test
    public void forwardXpath(){

    }
}
