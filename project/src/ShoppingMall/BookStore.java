package ShoppingMall;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookStore extends Store {

    public static List<Item> products = new ArrayList<Item>();
    Store store;

    public BookStore (){
        this.initStoreItems();
        this.store = store;
    }

    public BookStore (Store store){
        this.store = store;
    }

    public static List<Item> getItems() {
        return products;
    }

    @Override
    public void initStoreItems() {
        String [] productNames = {"The Shadow of the Wind", "The Kite Runner", "Little Women", "Before you", "The Lord of the Rings"};
        Double [] productPrice = {50.00d, 70.00d, 20.00d, 50.00d, 70.00d};

        for (int i=0; i < productNames.length; i++) {
            this.products.add(new Item(i+1, productNames[i], productPrice[i]));
            store.products.add(new Item(i+1, productNames[i], productPrice[i]));
        }
    }



}