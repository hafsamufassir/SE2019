package ShoppingMall;

import java.util.ArrayList;
import java.util.List;

public class GameStore extends Store {

    public static List<Item> products = new ArrayList<Item>();
    Store store;

    public GameStore (){
        this.initStoreItems();
    }

    public GameStore (Store store){
        this.store = store;
    }

    public static List<Item> getItems() {
        return products;
    }

    @Override
    public void initStoreItems() {
        String [] productNames = {"Monopoly", "UNO", "Chess", "Scrabble", "Risk"};
        Double [] productPrice = {30.00d, 120.00d, 40.00d, 12.00d, 40.00d};

        for (int i=0; i < productNames.length; i++) {
            this.products.add(new Item(i+6, productNames[i], productPrice[i]));
            store.products.add(new Item(i+6, productNames[i], productPrice[i]));
        }
    }
}
