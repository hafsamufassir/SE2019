package ShoppingMall;

import java.util.List;
import java.util.Scanner;

public class Driver {

    ShoppingCart cart = new ShoppingCart();
    private int ch = 0;

    public Driver(){
        menu();
    }

    public void greetingScreen(){
        System.out.println("Welcome to our online service!");
        //Scanner input = new Scanner(System.in);
    }

    public void chooseStore(){
        System.out.println("1. BookStore");
        System.out.println("2. GameStore");
        System.out.println("3. ShoeStore");
    }

    public void startScreen () {
        System.out.println("1. Display Store Products");
        System.out.println("2. Display Cart");
        System.out.println("0. Exit");
    }

    public void storeProductsMenu() {
        System.out.println("1. Add to Cart");
        System.out.println("2. Remove From Cart");
        System.out.println("0. Exit");
    }

    public void menu () {
        do {
            greetingScreen();
            chooseStore();
            //startScreen();
            getUserInput();

            switch (ch) {
                case 1:
                    displayBookStoreProducts();
                    storeProductsMenu();
                    getUserInput();
                    innerChoice1();
                    break;
                case 2:
                    showCart();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:

                    break;
            }
        } while (ch != 0);
    }

    private void innerChoice1() {
        switch (ch) {
            case 1:
                addProductToCart();
                showCart();
                break;
            case 2:
                removeProductFromCart();
                break;
            default:

                break;
        }
    }

    private int getUserInput() throws NumberFormatException {
        Scanner input = new Scanner (System.in);
        ch = Integer.parseInt(input.nextLine());
        return ch;
    }

    private void displayBookStoreProducts() {
        List<Item> products = new BookStore().getItems();
        for (Item prod: products) {
            System.out.println(
                    prod.getpID() + "- " +
                            prod.getName() + " " +
                            prod.getPrice()
            );
        }
        System.out.println();
    }
    private void displayGameStoreProducts() {
        List<Item> products = new GameStore().getItems();
        for (Item prod: products) {
            System.out.println(
                    prod.getpID() + "- " +
                            prod.getName() + " " +
                            prod.getPrice()
            );
        }
        System.out.println();
    }
    private void displayShoeStoreProducts() {
        List<Item> products = new ShoeStore().getItems();
        for (Item prod: products) {
            System.out.println(
                    prod.getpID() + "- " +
                            prod.getName() + " " +
                            prod.getPrice()
            );
        }
        System.out.println();
    }

    private void addProductToCart() {
        int pid = getUserInput();
        cart.addProductToCartByPID(pid);
    }

    private void showCart() {
        cart.printCartItems();
    }

    private void removeProductFromCart() {
        int pid = getUserInput();
        cart.removeProductByPID(pid);
    }
}

