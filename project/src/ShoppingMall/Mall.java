package ShoppingMall;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Mall{

    private String name;
    private List<String> stores;
    private List<String> customers;

    public static void saveMall(String name) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("mall.txt"));
        writer.write(name);

        writer.close();
    }

    public void enter(Customer c){

    }

    public void exit(Customer c){

    }

//    public List<String>getItems(){
//        return ShoppingCart.getItems();
//    }

    enum customers{

    }


    public void addStore(Store s){

    }
}
