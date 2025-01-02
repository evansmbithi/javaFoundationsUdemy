package src.main.lessons.section2.z_exercises.models.onlineShopping;

import java.util.ArrayList;

/* Refs:
 * https://www.educative.io/answers/how-to-append-to-an-array-in-java
 * usage: public ArrayList setProducts(Product[] products) { ... }
 */

public class Order {
    private String orderNumber;
    private ArrayList<Product> products;
    private double totalPrice;

    public Order(Product[] products) {
        this.orderNumber = setOrderNumber((int) Math.round(Math.random()*10000));
        this.totalPrice = setTotalPrice(products);
        this.products = setProducts(products);
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public String setOrderNumber(int orderCode) {
        return "#KEN" + orderCode;
    }


    public ArrayList setProducts(Product[] products) {
        // Create an ArrayList and add elements
        // ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Product> arr = new ArrayList<>();
        for (int i = 0; i<products.length; i++){
            // Append individual products to the ArrayList
            arr.add(products[i]);
        }
        return arr;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public double setTotalPrice(Product[] products) {
        for (int i = 0; i<products.length; i++){
            totalPrice += products[i].getProductPrice();
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return "{" +
                "orderID:" + orderNumber + ", " +
                "products:" + products + ", " +
                "totalPrice:" + totalPrice+
                "}";
    }

//    public static void main(String[] args) {
//        Product[] products = allProducts();
//        Order order = new Order(products);
//        System.out.println(order);
//    }
}
