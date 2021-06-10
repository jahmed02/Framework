package search;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo {
    SoftAssert softAssert = new SoftAssert();

    

    @Test
    public void assertPass(){
        Assert.assertEquals("Assertion","Assertion");
        System.out.println("Print");

        Assert.assertEquals("Assert","Assert");
        System.out.println("not print");

        Assert.assertNotEquals("Assert","Asset");
        System.out.println("Print");


    }
}
