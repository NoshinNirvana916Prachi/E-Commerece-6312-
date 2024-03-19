import java.util.ArrayList;
import java.util.List;

public class Wishlist {
    private List<Product> items;

    public Wishlist() {
        this.items = new ArrayList<>(); // Initialize the wishlist with an empty list of items
    }

    // Method to add an item to the wishlist
    //Constraint 33: OnlyProductsInWishlist
    public void addItem(Product product) {
        if (!items.contains(product)) { // Prevent adding duplicates
            items.add(product);
        }
    }

    // Method to remove an item from the wishlist
    public void removeItem(Product product) {
        items.remove(product);
    }

    // Method to clear the wishlist
    public void clear() {
        items.clear();
    }


    public List<Product> getItems() {
        return items;
    }

    public void setItems(List<Product> items) {
        this.items = items;
    }
}
