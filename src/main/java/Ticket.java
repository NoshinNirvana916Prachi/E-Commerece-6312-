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
    
    public void raiseTicket() {
        System.out.println("Ticket raised with ID: " + this.ticketId + " by user: " + user.getUsername());
    }


    public String getCustomerQuery() { return customerQuery; }
    public void setCustomerQuery(String customerQuery) { this.customerQuery = customerQuery; }

    public boolean isResolved() { return isResolved; }
    public void resolveTicket() {
        this.isResolved = true;
        System.out.println("Ticket with ID: " + this.ticketId + " has been resolved.");
    }
    public void setResolved(boolean resolved) { isResolved = resolved; }
    
    //Constraint 23: TicketHasUser
    public User getUser() {
        return user;
    }
    
    // Main method for demonstration
    public static void main(String[] args) {
        // Creating a new ticket
        Ticket ticket = new Ticket("TCK123", "My order hasn't arrived yet.",null);

        // Raising the ticket
        ticket.raiseTicket();

        // Checking if the ticket is resolved (expecting false)
        System.out.println("Is the ticket resolved? " + ticket.isResolved());

        // Resolving the ticket
        ticket.resolveTicket();

        // Checking if the ticket is resolved (expecting true)
        System.out.println("Is the ticket resolved? " + ticket.isResolved());
    }
}
