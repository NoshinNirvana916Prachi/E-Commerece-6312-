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

    public void assignTicket(Ticket ticket) {
        this.assignedTickets.add(ticket);
        // Additional logic to assign a ticket to the support representative.
    }

    public boolean resolveTicket(String ticketId) {
        // Additional logic to resolve a ticket and remove it from the assigned tickets list.
        return assignedTickets.removeIf(ticket -> ticket.getTicketId().equals(ticketId));
    }

    // Getters and Setters
    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public List<Ticket> getAssignedTickets() { return assignedTickets; }
    public void setAssignedTickets(List<Ticket> assignedTickets) { this.assignedTickets = assignedTickets; }
}
