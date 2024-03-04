import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShoppingCart {
    private List<CartItem> items;
    private Date creationDate;

    public ShoppingCart() {
        this.items = new ArrayList<>();
        this.creationDate = new Date(); // Set the creation date to the current date
    }

    public void addItem(Product product, int quantity) {
        this.items.add(new CartItem(product, quantity));
    }

    public void removeItem(Product product) {
        this.items.removeIf(item -> item.getProduct().equals(product));
    }

    public void clear() {
        this.items.clear();
    }

    public double calculateTotal() {
        double total = 0.0;
        for (CartItem item : items) {
            total += item.getProduct().getPrice() * item.getQuantity();
        }
        return total;
    }

    // Getters
    public List<CartItem> getItems() {
        return items;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    // Setters
    public void setItems(List<CartItem> items) {
        this.items = items;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }


}
