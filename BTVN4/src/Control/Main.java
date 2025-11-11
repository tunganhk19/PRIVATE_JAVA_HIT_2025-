package Control;

import model.*;
import Control.*;
import constant.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
        public static ArrayList<Product> products = new ArrayList<Product>();

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ProductController productController = new ProductController();

            int choice;
            do {
                System.out.println(Common.MENU);
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    choice = 0;
                }

                switch (choice) {
                    case 1:
                        System.out.println(Common.ENTER_TYPE);
                        String type = scanner.nextLine();
                        System.out.println(Common.ENTER_ID);
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println(Common.ENTER_PRODUCT_NAME);
                        String name = scanner.nextLine();
                        System.out.println(Common.ENTER_PRODUCT_DESCRIPTION);
                        String description = scanner.nextLine();
                        System.out.println(Common.ENTER_PRODUCT_PRICE);
                        double price;
                        try {
                            price = Double.parseDouble(scanner.nextLine());
                        } catch (NumberFormatException e) {
                            price = 0.0;
                        }

                        productController.addProduct(id, type , name, description, price);
                        break;

                    case 2:
                        ArrayList<Product> res = productController.getAllProducts();
                        if (res.isEmpty()) {
                            System.out.println(ERROR.ERROR_EMPTY_LIST);
                        } else {
                            for (Product p : res) {
                                System.out.println(p.getInfo());
                            }
                        }

                        break;
                    case 3:
                        System.out.println(Common.ENTER_ID_FOUND);
                        int idFound = Integer.parseInt(scanner.nextLine());
                        if (productController.getByID(idFound) != null) {
                            Product foundProduct = productController.getByID(idFound);
                            System.out.println(foundProduct.getInfo());
                        }
                        else {
                            System.out.println(ERROR.ERROR_NOT_FOUND);
                        }
                        break;
                    case 4:
                        System.out.println(Common.ENTER_ID_REMOVE);
                        int idRemove = Integer.parseInt(scanner.nextLine());
                        productController.removeByID(idRemove);
                        break;
                    case 5:
                        System.out.println(SuccessMessage.SUCCESS_EXIT);
                        break;
                    default:
                        System.out.println(ERROR.ERROR_CHOICE);
                }
            } while (choice != 5);
        }
}