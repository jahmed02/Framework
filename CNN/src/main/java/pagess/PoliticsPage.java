package pagess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PoliticsPage {

    // POM model for politics page only
    private final WebDriver driver;
    public PoliticsPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    //politics webElement locator
    @FindBy (how = How.XPATH,using = "//ul[@class='sc-cSHVUG bYPcOh']//a[@name='politics']")
    public static WebElement politicsLocator;

    public static WebElement getPoliticsLocator(){
        return politicsLocator;
    }

    public static void clickOnPolitics(){
        getPoliticsLocator().click();
    }

}
