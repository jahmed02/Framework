package pagess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

    private final WebDriver driver;
    public LandingPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.CSS, using = "svg.menu-icon") // getting the locators at first
    public static WebElement sectionNavBar;     // naming the webElement

    public static WebElement getSectionNavBar(){   // gettting the webElement and returning the value for the get method
        return sectionNavBar;
    }
    public static void clickNavBar(){    // this is the method for clicking on that section nav bar web element
        getSectionNavBar().click();
    }


}
