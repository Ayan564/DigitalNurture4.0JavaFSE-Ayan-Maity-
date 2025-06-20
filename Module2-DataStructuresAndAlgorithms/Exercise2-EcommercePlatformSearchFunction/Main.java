import ecommerce.Product;
import ecommerce.LinearSearch;
import ecommerce.BinarySearch;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Phone", "Electronics"),
            new Product(3, "Table", "Furniture")
        };

        int index = LinearSearch.search(products, "Phone");
        System.out.println("Linear Search Result: " + index);

        index = BinarySearch.search(products, "Phone");
        System.out.println("Binary Search Result: " + index);
    }
}
