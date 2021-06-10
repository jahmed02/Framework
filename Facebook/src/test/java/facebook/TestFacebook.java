package facebook;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import javax.management.StringValueExp;

public class TestFacebook extends CommonAPI {


    /*@Test
    public void userName() {
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("");
        driver.findElement(By.xpath("//div[@id='passContainer']")).sendKeys("",Keys.ENTER);
        driver.findElement(By.xpath("//div[@id='passContainer']")).sendKeys("",Keys.ENTER);
        driver.findElement(By.xpath("//button[@name='login']")).click();

   }*/

    /*@Test
    public void test2() throws InterruptedException {
        driver.findElement(By.name("email")).sendKeys("");
        driver.findElement(By.name("pass")).sendKeys("",Keys.ENTER);
        Thread.sleep(5000);
    }*/

       //@Test
        public void linkText () {

            //LinkText
            WebElement text = driver.findElement(By.linkText("Connect with friends and the world around you on Facebook."));

//        if(driver.findElement(By.className("_8eso")).isDisplayed()) {
//            System.out.println("ELement is present");
//        }

            //doesn't work (yet)
        /*if (driver.findElement(By.linkText("Connect with friends and the world around you on Facebook.")).isDisplayed()) {
            System.out.println("Element is present");
        }*/
        }

        //@Test
        public void linkText2 () {
//        if (driver.findElement(By.linkText("Create New Account")).isDisplayed()) {
//            System.out.println("Present");
//        }

//            WebElement text = driver.findElement(By.linkText("Create New Account"));
//            if (text.isDisplayed()) {
//                System.out.println("Element is present");
//            }

            if (driver.findElement(By.partialLinkText("Connect with")).isDisplayed()){
                System.out.println("Present");
            }
        }

        //@Test
        public void partialText () {
//        if (driver.findElement(By.partialLinkText("New Account")).isDisplayed()) {
//            System.out.println("Present");
//        }


            WebElement textt = driver.findElement(By.partialLinkText("New Account"));

            if (textt.isDisplayed()) {
                System.out.println("Element is present");
            }
        }

        @Test
    public void test6(){
            WebElement tr = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
            System.out.println(tr.getText());
            System.out.println("Random");
        }
    }

