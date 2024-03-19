import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Invoice {
    private int invoiceNumber;
    private Date date;
    private List<Product> items;
    private double totalAmount;
    private boolean paid;

    // Constructor
    public Invoice(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
        this.date = new Date(); 
        this.items = new ArrayList<>();
        this.totalAmount = 0.0;
        this.paid = false;
    }

    // Method to add a product to the invoice
    public void addItem(Product product) {
        items.add(product);
        recalculateTotalAmount();
    }

    // Method to remove a product from the invoice
    public boolean removeItem(Product product) {
        boolean removed = items.remove(product);
        if (removed) {
            recalculateTotalAmount();
        }
        return removed;
    }

    // Method to clear all items from the invoice
    public void clearItems() {
        items.clear();
        totalAmount = 0.0;
    }

    // Helper method to recalculate the total amount
    private void recalculateTotalAmount() {
        totalAmount = items.stream().mapToDouble(Product::getPrice).sum();
    }

    // Method to mark the invoice as paid
    public void markAsPaid() {
        this.paid = true;
    }

    // Getters and Setters
    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Product> getItems() {
        return items;
    }

    public void setItems(List<Product> items) {
        this.items = items;
        recalculateTotalAmount();
    }

    public double getTotalAmount() {
        return totalAmount;
    }


    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }
}
