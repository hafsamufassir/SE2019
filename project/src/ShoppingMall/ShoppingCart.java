package ShoppingMall;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<Item> cartItems = new ArrayList<Item>();

    public void addProductToCartByPID(int pid) {
        Item product = getProductByProductID(pid);
        addToCart(product);
    }

    private Item getProductByProductID(int pid) {
        Item product = null;
        List<Item> products = new Store().getItems();
        for (Item prod: products) {
            if (prod.getpID() == pid) {
                product = prod;
                break;
            }
        }
        return product;
    }

    private void addToCart(Item product) {
        cartItems.add(product);
    }

    public void removeProductByPID(int pid) {
        Item prod = getProductByProductID(pid);
        cartItems.remove(prod);
    }

    void printCartItems() {
        for (Item prod: cartItems) {
            System.out.println(prod.getName());
        }
    }
}