package search;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestSearch extends CommonAPI {

    // normal way to test directly
//    @Test
//    public void test1() {
//        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Books" , Keys.ENTER);
//        driver.findElement(By.id("twotabsearchtextbox")).clear();
//    }
//
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
        clickOnWebElement("twotabsearchtextbox");   // any id locators can be turned into css locator by adding a "#" in front of the locator
        typeOnWebElement("twotabsearchtextbox", "Books");
        clearInputField("twotabsearchtextbox");
        typeOnWebElementAndEnter("twotabsearchtextbox", "Honey");

    }
}
