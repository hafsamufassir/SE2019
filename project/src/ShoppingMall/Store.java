package ShoppingMall;

import ShoppingMall.Customer;

import java.util.Collection;

public abstract class Store {

    private String name;
    private String ID;
    public Collection<String> items;
    public Collection<String> customers;
    protected Stores stores;

    public Collection<String> observes;

    public Stores getStores(){
        return stores;
    }
    void enter(Customer c){

    }
    void exit(Customer c){

    }

    enum customers{

    }

    enum items{

    }

    void addObserver (Observer O){

    }

}
