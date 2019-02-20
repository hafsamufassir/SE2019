package ShoppingMall;

import java.util.ArrayList;
import java.util.List;

public class ShoeStore extends Store {

    public static List<Item> products = new ArrayList<Item>();
    Store store;

    public ShoeStore (){
        this.initStoreItems();
    }

    public ShoeStore (Store store){
        this.store = store;
    }

    public static List<Item> getItems() {
        return products;
    }

    @Override
    public void initStoreItems() {
        String [] productNames = {"Shoe 1", "Shoe 2", "Shoe 3", "Shoe 4", "Shoe 5"};
        Double [] productPrice = {50.00d, 70.00d, 20.00d, 80.00d, 10.00d};

        for (int i=0; i < productNames.length; i++) {
            this.products.add(new Item(i+12, productNames[i], productPrice[i]));
            store.products.add(new Item(i+12, productNames[i], productPrice[i]));
        }
    }
}
