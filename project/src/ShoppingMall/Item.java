package ShoppingMall;

import java.util.Objects;

public class Item {

    private String name;
    private Integer ID;
    //private String storeID;
    private Double price;

    public Item(){}

    public Item (Integer ID, String name, Double price) {
        this.ID = ID;
        this.name = name;
        this.price = price;
    }


    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }


    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getpID() {
        return ID;
    }

    public void setpID(Integer pid) {
        this.ID = ID;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.ID);
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + Objects.hashCode(this.price);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Item other = (Item) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.ID, other.ID)) {
            return false;
        }
        if (!Objects.equals(this.price, other.price)) {
            return false;
        }
        return true;
    }

}
