package ECommerce_P2;

import java.util.Arrays;
import java.util.Comparator;

public class SearchAlgorithms {
	
	public static Product2 linearSearch(Product2[] products, String productName) {
        for (Product2 product : products) {
            if (product.getProductName().equals(productName)) {
                return product;
            }
        }
        return null;
    }
	
    public static Product2 binarySearch(Product2[] products, String productName) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = products[mid].getProductName().compareTo(productName);

            if (comparison == 0) {
                return products[mid];
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Product2[] products = {
            new Product2("101", "Apple", "Fruit"),
            new Product2("102", "Banana", "Fruit"),
            new Product2("103", "Carrot", "Vegetable"),
            new Product2("104", "Date", "Fruit"),
            new Product2("105", "Eggplant", "Vegetable")
        };

        // Sorting products by productName for binary search
        Arrays.sort(products, Comparator.comparing(Product2::getProductName));

        // Linear Search
        Product2 foundProduct = linearSearch(products, "Banana");
        if (foundProduct != null) {
            System.out.println("Linear Search: " + foundProduct);
        } else {
            System.out.println("Product not found in Linear Search.");
        }

        // Binary Search
        foundProduct = binarySearch(products, "Banana");
        if (foundProduct != null) {
            System.out.println("Binary Search: " + foundProduct);
        } else {
            System.out.println("Product not found in Binary Search.");
        }
    }
}

