package search;

import amazonSearch.SearchItems;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
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
    @Test
    public void test3(){
//        clickOnWebElement("twotabsearchtextbox");   // any id locators can be turned into css locator by adding a "#" in front of the locator
//        typeOnWebElement("twotabsearchtextbox", "Books");
//        clearInputField("twotabsearchtextbox");
        //typeOnWebElementAndEnter("twotabsearchtextbox", "Honey");

        //driver.findElement(By.id("searchDropdownBox")).click();
        // driver.findElement(By.cssSelector(".nav-search-dropdown")).click();
        //driver.findElement(By.xpath("//select[@id='searchDropdownBox']")).click();
        //driver.findElement(By.xpath("//select[@name='url']")).click();


        clickOnWebElement("//select[@name='url']");

    }

    
}
