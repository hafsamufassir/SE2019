package ShoppingMall;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    static List<Item> items = new ArrayList<Item>();


    public void getItems() {
        for (Item product: items) {
            System.out.println(product.getName());
        }
    }

    public static void addItem(Item item){
        items.add(item);
    }

    public void removeItem(Item item){

    }
}

