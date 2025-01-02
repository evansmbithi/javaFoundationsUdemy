package src.main.lessons.section2.z_exercises.models.onlineShopping;

public class Product {
    private String productCode;
    private String productName;
    private int productPrice;

    public Product(String productCode, String productName, int productPrice) {
        this.productCode = productCode;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "{" +
                "\"productID\":\"" + productCode + "\", " +
                "\"product\":\"" + productName + "\", " +
                "\"price\":" + productPrice +
                "}";

    }

}
