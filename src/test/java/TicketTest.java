import org.junit.Test;
import static org.junit.Assert.*;


public class TicketTest {
	@Test
    public void testTicketConstructor() {
        // Test seller constructor and getter methods
        Ticket ticket = new Ticket("01", "Issue with Order");
        assertEquals("01", ticket.getTicketId());
        assertEquals("Issue with Order", ticket.getCustomerQuery());
  
    }
}
