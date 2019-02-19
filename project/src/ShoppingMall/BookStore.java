package ShoppingMall;

import java.util.Scanner;

public class BookStore extends Store {

    public void getBooks(){
        System.out.println(" 1  - Song of Solomon");
        System.out.println(" 2  - The Lord of the Rings");
        System.out.println(" 3  - The Shadow of the Wind");
        System.out.println(" 4  - The Kite Runner");
        System.out.println(" 5  - Little Women");

        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();

        while(choice < 1  ||  choice > 5){
            System.out.println(" 1  - Song of Solomon");
            System.out.println(" 2  - The Lord of the Rings");
            System.out.println(" 3  - The Shadow of the Wind");
            System.out.println(" 4  - The Kite Runner");
            System.out.println(" 5  - Little Women");
        }

//        switch (choice)
//        {
//            case 1:
//                ShoppingCart.addItem(Item);
//                break;
//            case 2:
//                admin.removeUser();
//                break;
//            case 3:
//                admin.printUsers();
//                break;
//            case 4:
//                admin.changePassword();
//                Storage.users.put(admin.getID(), admin);
//                Storage.admins.put(admin.getID(), admin);
//                break;
//            case 5:
//                return;
//            default:
//                System.out.println("Number too small or too big\n");
//                break;
//        }
    }
}
