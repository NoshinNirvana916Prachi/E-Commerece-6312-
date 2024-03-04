import java.util.Date;

public class Order {
    private String orderId;
    private int userId;
    private String productId;
    private Date orderDate;
    private Date deliveryDate;
    private String status;
    private float totalPrice;

    // Constructor
    public Order(String orderId, int userId, String productId, Date orderDate, 
                 Date deliveryDate, String status, float totalPrice) {
        this.orderId = orderId;
        this.userId = userId;
        this.productId = productId;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.status = status;
        this.totalPrice = totalPrice;
    }

    // Method to place an order
    public void placeOrder() {
        // Logic to place an order
        // In a real scenario, this would involve more details such as inventory check, payment processing, etc.
        this.status = "Placed";
        this.orderDate = new Date(); // Assuming the order date is the current date/time
    }

    // Method to calculate the total price of the order
    public void calculateTotalPrice(float price, int quantity) {
        // Assuming that the total price is a product of the price per item and quantity
        this.totalPrice = price * quantity;
    }

    // Getters and Setters
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }
}

