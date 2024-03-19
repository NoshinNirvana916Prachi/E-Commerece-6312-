public class Ticket {
    private String ticketId;
    private String customerQuery;
    private boolean isResolved;
	private User user;

    public Ticket(String ticketId, String customerQuery, User user) {
        this.ticketId = ticketId;
        this.customerQuery = customerQuery;
        this.isResolved = false;
        this.user = user;
    }

    // Getters and Setters
    public String getTicketId() { return ticketId; }
    public void setTicketId(String ticketId) { this.ticketId = ticketId; }

    public String getCustomerQuery() { return customerQuery; }
    public void setCustomerQuery(String customerQuery) { this.customerQuery = customerQuery; }

    public boolean isResolved() { return isResolved; }
    public void setResolved(boolean resolved) { isResolved = resolved; }
    
    //Constraint 23: TicketHasUser
    public User getUser() {
        return user;
    }
}
