package Control;
import constant.Common;
import constant.ERROR;
import constant.SuccessMessage;
import model.Product;
import model.Laptop;
import model.SmartPhone;
import java.util.ArrayList;
public class ProductController {
    private ArrayList<Product> products = Main.products;

    public ProductController() {
    }

    public ProductController(ArrayList<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product) {
        if (product != null) {
            products.add(product);
            System.out.println(SuccessMessage.SUCCESS_ADD);
        }
    }

    public void addProduct(int id, String type, String name, String description, double price) {
        Product newProduct = null;
        if (Common.PRODUCT_LAPTOP_TYPE.equalsIgnoreCase(type)) {
            newProduct = new Laptop(id, name, description, price, Common.LAPTOP_RAM, Common.LAPTOP_CPU);
        } else if (Common.PRODUCT_SMARTPHONE_TYPE.equalsIgnoreCase(type)) {
            newProduct = new SmartPhone(id, name, description, price, true);
        } else {
            System.out.println(ERROR.ERROR_INVALID_PRODUCT);
        }
        addProduct(newProduct);
    }

    public void removeByID(int id){
        boolean removed = this.products.removeIf(product -> product.getId() == id);
        if (removed) {
            System.out.println(SuccessMessage.SUCCESS_REMOVE);
        }
        else {
            System.out.println(ERROR.ERROR_NOT_FOUND);
        }
    }

    public Product getByID(int id){
        for (Product product : products) {
            if (product.getId() == id) {
                System.out.println(SuccessMessage.SUCCESS_FOUNDED + id);
                return product;
            }
        }
        return null;
    }
    public ArrayList<Product> getAllProducts() {
        return products;
    }
}
