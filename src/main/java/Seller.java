import java.util.ArrayList;
import java.util.List;

public class Seller extends User {
    private List<Product> productList;
    private String address;
    private String phone;

    // Constructor
    public Seller(int userId, String username, String password, String email, String address, String phone) {
        super(userId, username, password, email);
        this.productList = new ArrayList<>();
        this.address = address;
        this.phone = phone;
    }

    // Method to add a product to the seller's catalog
    public void addProduct(Product product) {
        this.productList.add(product);
    }

    // Method to remove a product from the seller's catalog
    public boolean removeProduct(String productId) {
        return this.productList.removeIf(product -> product.getProductId().equals(productId));
    }

    // Method to update a product's information in the seller's catalog
    public boolean updateProduct(Product updatedProduct) {
        for (int i = 0; i < this.productList.size(); i++) {
            if (this.productList.get(i).getProductId().equals(updatedProduct.getProductId())) {
                this.productList.set(i, updatedProduct);
                return true;
            }
        }
        return false;
    }

    // Getters and Setters
    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
