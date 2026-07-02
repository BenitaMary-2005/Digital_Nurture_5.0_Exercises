import java.util.Arrays;
import java.util.Comparator;

class Product {
    int productId;
    String productName;
    String category;

    Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public String toString() {
        return productId + " " + productName + " " + category;
    }
}

public class EcommerceSearch {

    // Linear Search
    static Product linearSearch(Product[] products, int id) {
        for (Product p : products) {
            if (p.productId == id)
                return p;
        }
        return null;
    }

    // Binary Search
    static Product binarySearch(Product[] products, int id) {
        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (products[mid].productId == id)
                return products[mid];
            else if (products[mid].productId < id)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
                new Product(105, "Laptop", "Electronics"),
                new Product(102, "Shoes", "Fashion"),
                new Product(108, "Phone", "Electronics"),
                new Product(101, "Watch", "Accessories"),
                new Product(110, "Bag", "Fashion")
        };

        int searchId = 108;

        // Linear Search
        Product result1 = linearSearch(products, searchId);

        if (result1 != null)
            System.out.println("Linear Search Found: " + result1);
        else
            System.out.println("Product Not Found");

        // Sort for Binary Search
        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));

        Product result2 = binarySearch(products, searchId);

        if (result2 != null)
            System.out.println("Binary Search Found: " + result2);
        else
            System.out.println("Product Not Found");
    }
}