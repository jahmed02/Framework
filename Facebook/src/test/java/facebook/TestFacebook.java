package facebook;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestFacebook extends CommonAPI {

    @Test
    public void userName(){
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("");
        //driver.findElement(By.xpath("//div[@id='passContainer']")).sendKeys("",Keys.ENTER);
        //driver.findElement(By.xpath("//div[@id='passContainer']")).sendKeys("",Keys.ENTER);
        //driver.findElement(By.xpath("//button[@name='login']")).click();
    }
}
