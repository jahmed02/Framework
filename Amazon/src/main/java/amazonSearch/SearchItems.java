package amazonSearch;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SearchItems {

    public static List<String> getSearchItems(){
        List<String> list = new ArrayList<>();

        list.add("Books");
        list.add("Laptop");
        list.add("iPhone");
        list.add("Puzzles");
        list.add("Bike");
        return list;
    }

    public static List<String> getSearchItems2() {
        List<String> list2 = new ArrayList<>();

        list2.add("Jacob");
        list2.add("Barbara");
        return list2;
    }
}
