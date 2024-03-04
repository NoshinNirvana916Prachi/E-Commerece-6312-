import java.util.Date;

public class Payment {
    private String id;
    private String orderId;
    private double total;
    private boolean paid;
    private String details;

    // Constructor
    public Payment(String id, String orderId, double total, boolean paid, String details) {
        this.id = id;
        this.orderId = orderId;
        this.total = total;
        this.paid = paid;
        this.details = details;
    }

    // Method to process the payment
    public boolean confirmTransaction() {
        // Logic to confirm payment transaction
        // This would be replaced with real payment processing logic
        this.paid = true;
        return this.paid;
    }

    // Method to get the payment date
    public Date getPaymentDate() {
        // Logic to return payment date
        // This placeholder assumes payment date is current date
        return new Date(); // This would typically be the date the payment was confirmed
    }

    // Method to make the transaction
    public boolean makeTransaction() {
        // Logic to perform the payment transaction
        // This would interact with a payment gateway or service
        this.paid = true;
        return this.paid;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
