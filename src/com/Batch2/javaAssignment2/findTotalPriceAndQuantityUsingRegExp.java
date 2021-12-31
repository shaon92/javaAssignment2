/* 4. 1 piece sharee 3500 tk, 2 piece shirt 2000 tk and 1 piece pant 750 tk. Find total price and total quantity using
regular expression. */

package com.Batch2.javaAssignment2;
public class findTotalPriceAndQuantityUsingRegExp {
    public static void main(String[] args) {
        String str = "1 piece sharee 3500 tk, 2 piece shirt 2000 tk and 1 piece pant 750 tk";
        str = str.replaceAll("[^\\d]", " ");
        str = str.trim();
        str = str.replaceAll(" +", " ");
        String[] arr = (str.split(" "));
        int shareeQuantity = Integer.parseInt(arr[0]);
        double shareePrice = Double.parseDouble(arr[1]);
        int shirtQuantity = Integer.parseInt(arr[2]);
        double shirtPrice = Double.parseDouble(arr[3]);
        int pantQuantity = Integer.parseInt(arr[4]);
        double pantPrice = Double.parseDouble(arr[5]);
        int totalQuantity = shareeQuantity + shirtQuantity + pantQuantity;
        double totalPrice = shareePrice + shirtPrice + pantPrice;
        System.out.println("1 piece sharee 3500 tk, 2 piece shirt 2000 tk and 1 piece pant 750 tk\n");
        System.out.println("Total Quantity: " + totalQuantity + "\nTotal Price: " + totalPrice);
    }
}