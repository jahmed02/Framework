package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public WebDriver driver = null;

    // using the Parameters annotation to call any url we want
    @Parameters({"url"})  // parameters are only uses for xml runner files

    // TestNG annotation of beforemethod, will run before executing the test cases
    @BeforeMethod
    public void setUp(String url) {
        // path setup for chrome browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jisan\\IdeaProjects\\FrameWork\\Generic\\driver\\chromedriver.exe");
        driver = new ChromeDriver();

        // implicit wait of 10 sec
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //go to the parameter based website
        driver.get(url);


        /*//other url methods
        driver.navigate().to(url);   // alternate of driver.get() to launch a website
        driver.navigate().refresh();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().to("");   // string */


        // maximizing the opening window by using selenium action class
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void cleanUp() {
        driver.close();

        // driver.quit();            // for closing all the windows running for tests
    }

    // generic click method for all modules
    public void clickOnWebElement(String locator) {
        try {
            driver.findElement(By.id(locator)).clear();
        } catch (Exception ex1) {
            try {
                driver.findElement(By.cssSelector(locator)).click();
            } catch (Exception ex2) {
                try {
                    driver.findElement(By.className(locator)).clear();
                } catch (Exception ex3) {
                    driver.findElement(By.xpath(locator)).click();
                }
            }
        }
    }

    //generic typing method for all modules
    public void typeOnWebElement(String locator, String value){
        try{
            driver.findElement(By.id(locator)).sendKeys(value);
        }catch (Exception ex1) {
            try{
                driver.findElement(By.cssSelector(locator)).sendKeys(value);
            }catch (Exception ex2) {
                try {
                    driver.findElement(By.className(locator)).sendKeys(value);
                }catch (Exception ex3){
                    driver.findElement(By.xpath(locator)).sendKeys(value);
                }
            }
        }
    }

    //generic type and hit enter method for all modules
    public void typeOnWebElementAndEnter(String locator, String value){
        try{
            driver.findElement(By.id(locator)).sendKeys(value, Keys.ENTER);
        }catch (Exception ex1) {
            try {
                driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
            }catch (Exception ex2){
                try {
                    driver.findElement(By.className(locator)).sendKeys(value, Keys.ENTER);
                }catch (Exception ex3){
                    driver.findElement(By.xpath(locator)).sendKeys(value, Keys.ENTER);
                }
            }
        }
    }

    //generic clear method for all modules
    public void clearInputField(String locator) {
        try {
            driver.findElement(By.id(locator)).clear();
        }catch (Exception ex1) {
            try {
                driver.findElement(By.cssSelector(locator)).clear();
            }catch (Exception ex2) {
                try {
                driver.findElement(By.className(locator)).clear();
            }catch (Exception ex3) {
                    driver.findElement(By.xpath(locator)).clear();
                }
            }
        }
    }

    // single method to get text of webElements (using cssSelector)
    public List<String> getListOfText(String locator){
        List<WebElement> elementList = driver.findElements(By.cssSelector(locator));
        List<String> listOfText = new ArrayList<String>();
        for(WebElement element: elementList) {
            System.out.println(element.getText());
        }
        return listOfText;
    }

    // using xpath locator
    // single method to get text of webElements (using xpath)
    public List<String> getListOfTextXpath(String locator){
        List<WebElement> elementList = driver.findElements(By.xpath(locator));
        List<String> listOfText = new ArrayList<String>();
        for(WebElement element: elementList) {
            System.out.println(element.getText());
        }
        return listOfText;
    }

    //simple print text method
    public void printText(List<String> list) {
        for(String string: list) {
            System.out.println(string);
        }
    }

    public void typeByXpath(String locator, String value) {
        driver.findElement(By.xpath(locator)).sendKeys(value,Keys.ENTER);
    }

    public void typeByID(String locator, String value) {
        driver.findElement(By.id(locator)).sendKeys(value,Keys.ENTER);
    }

    public void clearByID(String locator) {
        driver.findElement(By.id(locator)).clear();
    }

    public static void click(){
        
    }


     /*// (1) passing only List<WebElement>  method for elementList (storing the locators at first)
    public List<WebElement> getListOfWebElement(String locator) {
        List<WebElement> elementList = driver.findElements(By.cssSelector(locator));
        return elementList;
    }

    //(2)  passing the webElements through a new variable (elements)
    public List<String> getListOText(List<WebElement> elements) {
        List<String> listOfText = new ArrayList<String>();
        for (WebElement element: elements){
            listOfText.add(element.getText());
        }
        return listOfText;
    }     //    method and 1 and 2 are realted*/





}
