public class Electronics extends Product {
    private String brand;
    private String model;
    private String category;

    // Constructor
    public Electronics(String productId, String productName, float cost, String description,
                       String brand, String model, String category) {
        super(productId, productName, cost, description);
        this.brand = brand;
        this.model = model;
        this.category = category;
    }

    // Getters
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getCategory() {
        return category;
    }

    // Setters
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    // toString method for displaying electronic information
    @Override
    public String toString() {
        return "Electronics{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", category='" + category + '\'' +
                ", productId='" + getProductId() + '\'' +
                ", productName='" + getProductName() + '\'' +
                ", cost=" + getPrice() +
                ", description='" + getDescription() + '\'' +
                '}';
    }
}
