package search;

import amazonSearch.SearchItems;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TestSearch extends CommonAPI {

    // normal way to test directly
//    @Test
//    public void test1() {
//
//        List<String> list = SearchItems.getSearchItems();
//        for (String items: list) {
//            typeByID("twotabsearchtextbox",items);
//            clearByID("twotabsearchtextbox");
//        }
//
//        List<String> list2 = SearchItems.getSearchItems2();
//        for(String items2: list2) {
//            typeByID("twotabsearchtextbox", items2);
//            clearByID("twotabsearchtextbox");
//        }
//
//    }


//    // second test case
//    @Test
//    public void test2() {
//        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Honey" , Keys.ENTER);
//        driver.findElement(By.id("twotabsearchtextbox")).clear();
//
//        //driver.findElement(By.id("nav-search-dropdown-card")).click();
//    }

    // testing with calling the generic methods
//    @Test
//    public void test3(){
////        clickOnWebElement("twotabsearchtextbox");   // any id locators can be turned into css locator by adding a "#" in front of the locator
////        typeOnWebElement("twotabsearchtextbox", "Books");
////        clearInputField("twotabsearchtextbox");
//        //typeOnWebElementAndEnter("twotabsearchtextbox", "Honey");
//
//        //driver.findElement(By.id("searchDropdownBox")).click();
//        // driver.findElement(By.cssSelector(".nav-search-dropdown")).click();
//        //driver.findElement(By.xpath("//select[@id='searchDropdownBox']")).click();
//        //driver.findElement(By.xpath("//select[@name='url']")).click();
//
//
//        clickOnWebElement("//select[@name='url']");
//
//    }


    @Test (dependsOnGroups = {"SignIn"})
    public void test5(){
        driver.findElement(By.xpath("//select[@name='url']")).click();
    }
    @Test (groups = {"SignIn"})
    public void test6(){
        driver.findElement(By.xpath("//select[@name='url']")).click();
    }
    @Test
    public void test7(){
        driver.findElement(By.xpath("//select[@name='url']")).click();
    }
    @Test
    public void test8(){
        driver.findElement(By.xpath("//select[@name='url']")).click();
    }
    @Test
    public void test9(){
        driver.findElement(By.xpath("//select[@name='url']")).click();
    }
    @Test
    public void test10(){
        driver.findElement(By.xpath("//select[@name='url']")).click();
    }
    @Test
    public void test11(){
        driver.findElement(By.xpath("//select[@name='url']")).click();
    }
    @Test
    public void test12(){
        driver.findElement(By.xpath("//select[@name='url']")).click();
    }
    @Test
    public void test13(){
        driver.findElement(By.xpath("//select[@name='url']")).click();
    }
    @Test
    public void test14(){
        driver.findElement(By.xpath("//select[@name='url']")).click();
    }
    @Test
    public void test15(){
        driver.findElement(By.xpath("//select[@name='url']")).click();
    }
    @Test
    public void test16(){
        driver.findElement(By.xpath("//select[@name='url']")).click();
    }
    @Test
    public void test17(){
        driver.findElement(By.xpath("//select[@name='url']")).click();
    }
    @Test
    public void test18(){
        driver.findElement(By.xpath("//select[@name='url']")).click();
    }
    @Test
    public void test19(){
        driver.findElement(By.xpath("//select[@name='url']")).click();
    }
    @Test
    public void test20(){
        driver.findElement(By.xpath("//select[@name='url']")).click();
    }

    
}
