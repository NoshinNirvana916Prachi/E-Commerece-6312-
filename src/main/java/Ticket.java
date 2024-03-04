public class Ticket {
    private String ticketId;
    private String customerQuery;
    private boolean isResolved;

    public Ticket(String ticketId, String customerQuery) {
        this.ticketId = ticketId;
        this.customerQuery = customerQuery;
        this.isResolved = false;
    }

    // Getters and Setters
    public String getTicketId() { return ticketId; }
    public void setTicketId(String ticketId) { this.ticketId = ticketId; }

    public String getCustomerQuery() { return customerQuery; }
    public void setCustomerQuery(String customerQuery) { this.customerQuery = customerQuery; }

    public boolean isResolved() { return isResolved; }
    public void setResolved(boolean resolved) { isResolved = resolved; }
}
