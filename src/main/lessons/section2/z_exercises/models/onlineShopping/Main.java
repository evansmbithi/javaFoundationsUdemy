package src.main.lessons.section2.z_exercises.models.onlineShopping;

public class Main {
    public static Product[] allProducts() {
        Product[] product = new Product[3];
        product[0] = new Product("1", "Dettol", 499);
        product[1] = new Product("2", "Menthol", 1499);
        product[2] = new Product("3", "Kettle", 2499);
        return product;
    }

    public static void main(String[] args) {
        Address address = new Address("Kenya","Nairobi","Mwiki Rd");
        Product[] products = allProducts();
        Order order = new Order(products);
        Customer evans = new Customer("Evans","Mbithi",address,order);
        System.out.println(evans);
    }
}
