package pagess;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import javax.swing.*;

public class SectionPage{

//    // using FindBy method for locators
//    // we have to declare locators here first
//    @FindBy (how = How.CSS, using = "svg.search-icon") // getting the search bar locators at first
//    public static WebElement searchBar;  // this is an example


    //section bar locator
    @FindBy(how = How.CSS, using = "svg.menu-icon")   // section bar locator
    public static WebElement sectionBar;

    //politics webElement locator using findby
    @FindBy (how = How.XPATH,using = "//ul[@class='sc-cSHVUG bYPcOh']//a[@name='politics']")
    public static WebElement politicsLocator;

    // we need this for extent reporting
    public static WebElement getSectionBar() { return getSectionBar(); }   // get method for sectionBar locator
    public static WebElement getPoliticsLocator(){ return politicsLocator; }  // get method for politics locator


    public void clickOnSection(WebDriver driver) {

        getSectionBar().click();  // clicking on section bar
    }
    public void clickOnPolitics(){ getPoliticsLocator().click();}    // clicking on politics

}
