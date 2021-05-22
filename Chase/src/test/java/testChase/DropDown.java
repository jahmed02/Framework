package testChase;

import base.CommonAPI;
import org.testng.annotations.Test;

import java.util.List;

public class DropDown extends CommonAPI {

    @Test
    public void dropDown(){
        List<String> printMenu = getListOfText("");
        printText(printMenu);
    }
}
