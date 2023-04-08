package hf.dp.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {
    ArrayList<MenuItem> menuItems;
    public PancakeHouseMenu( ) {
        menuItems = new ArrayList( );
        addItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage", false, 2.99);
        addItem("Blueberry pancakes",
                "Pancakes made with fresh blueberries", true, 3.49);
    }
    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public Iterator<MenuItem> createIterator(){
        return menuItems.iterator();
    }
}
