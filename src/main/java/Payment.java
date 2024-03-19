import java.util.Date;

public class Payment {
    private String id;
    private String orderId;
    private double total;
    private boolean paid;
    private String details;
    private String status;
    private Invoice invoice;

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
    	this.paid = true;
        this.status = "completed"; 
        return this.paid;
    }

    // Method to get the payment date
    public Date getPaymentDate() {
     
      
        return new Date(); 
    }

    // Method to make the transaction
    public boolean makeTransaction() {
    
        this.paid = true;
        return this.paid;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }
    
    // Constraint 19: NonEmptyPayemntID
    public void setId(String id) {
    	 if (id == null || id.trim().isEmpty()) {
    	        throw new IllegalArgumentException("ID cannot be empty.");
    	    }
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
    	if (!paid && (details == null || details.trim().isEmpty())) {
            throw new IllegalArgumentException("Details are required if the payment is not completed.");
        }
        this.paid = paid;
    }
    
    
    //Constraint 18: PaidWhenCompleted
    public void setStatus(String status) {
        this.status = status;
        if ("completed".equals(status)) {
            this.paid = true;
        }
    }

    public String getDetails() {
        return details;
    }
    
    //Constraint 20: DetailRequiredIfNotPaid
    public void setDetails(String details) {
    	if (!this.paid && (details == null || details.trim().isEmpty())) {
            throw new IllegalArgumentException("Details cannot be empty if the payment is not completed.");
        }
        this.details = details;
    }
    
    //Constraints 21: SingleInvoice
    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    // Getter for invoice
    public Invoice getInvoice() {
        return this.invoice;
    }
}
