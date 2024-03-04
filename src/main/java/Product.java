public class Product {
    private String productId;
    private String productName;
    private float price;
    private String description;

    // Constructor
    public Product(String productId, String productName, float price, String description) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.description = description;
    }

    // Method to add this product to a shopping cart
    public void addToCart(ShoppingCart cart) {
        cart.addItem(this, 1); // Adds one quantity of this product to the cart
    }

    // Method to retrieve the product's details
    public String getProductDetails() {
        return "Product ID: " + productId + ", Name: " + productName +
               ", Price: " + price + ", Description: " + description;
    }

    // Getters and Setters
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
