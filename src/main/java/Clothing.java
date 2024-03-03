public class Clothing extends Product {
    private String brand;
    private String size;
    private String gender;
    private String color;
    private String material;

    // Constructor
    public Clothing(String productId, String productName, float cost, String description, 
                    String brand, String size, String gender, String color, String material) {
        super(productId, productName, cost, description);
        this.brand = brand;
        this.size = size;
        this.gender = gender;
        this.color = color;
        this.material = material;
    }

    // Getters
    public String getBrand() {
        return brand;
    }

    public String getSize() {
        return size;
    }

    public String getGender() {
        return gender;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    // Setters
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    // toString method for displaying clothing information
    @Override
    public String toString() {
        return "Clothing{" +
                "brand='" + brand + '\'' +
                ", size='" + size + '\'' +
                ", gender='" + gender + '\'' +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", productId='" + getProductId() + '\'' +
                ", productName='" + getProductName() + '\'' +
                ", cost=" + getPrice() +
                ", description='" + getDescription() + '\'' +
                '}';
    }
}
