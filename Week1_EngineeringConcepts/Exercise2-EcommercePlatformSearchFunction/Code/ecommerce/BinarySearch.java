package ecommerce;

import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch {
    public static int search(Product[] products, String targetName) {
        // Sort the array by productName (case-insensitive)
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        int left = 0, right = products.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(targetName);
            if (cmp == 0) return mid;
            else if (cmp < 0) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
}
