import java.util.ArrayList;
import java.util.List;

public class CustomerSupport extends User {
    private String department;
    private List<Ticket> assignedTickets;

    public CustomerSupport(int userId, String username, String password, String email, String department) {
        super(userId, username, password, email);
        this.department = department;
        this.assignedTickets = new ArrayList<>();
    }

    // Method to assign a ticket to the support representative
    public void assignTicket(Ticket ticket) {
        this.assignedTickets.add(ticket);
        System.out.println("Ticket " + ticket.getTicketId() + " assigned to " + getUsername());
    }

    // Method to resolve a ticket and remove it from the assigned tickets list
    public boolean resolveTicket(String ticketId) {
        boolean removed = false;
        for (Ticket ticket : assignedTickets) {
            if (ticket.getTicketId().equals(ticketId)) {
                assignedTickets.remove(ticket);
                ticket.setResolved(true);
                removed = true;
                System.out.println("Ticket " + ticketId + " resolved by " + getUsername());
                break;
            }
        }
        return removed;
    }

    // Getters and Setters
    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public List<Ticket> getAssignedTickets() { return assignedTickets; }
    public void setAssignedTickets(List<Ticket> assignedTickets) { this.assignedTickets = assignedTickets; }

  

    // Constraint 7: ResolvedByCustomerSupport
    public boolean isResolvedByCustomerSupport(Ticket ticket) {
        return assignedTickets.stream().anyMatch(t -> t.equals(ticket));
    }
}
