package ShoppingMall;

import java.io.*;

public class Customer {

    private String name;
    private ShoppingCart shoppingCart;
    private Store store;

    public static void saveCustomer(String name) throws IOException {
            BufferedWriter writer = new BufferedWriter(new FileWriter("user.txt"));
            writer.write(name);

        writer.close();
    }


}
