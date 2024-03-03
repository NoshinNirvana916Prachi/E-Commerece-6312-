import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Date;

public class OrderTest {
    @Test
    public void testOrderConstructor() {
        // Test order constructor and getter methods
        Date orderDate = new Date();
        Order order = new Order("O1", 1, "P1", orderDate, null, "Pending", 20.0f);
        assertEquals("O1", order.getOrderId());
        assertEquals(1, order.getUserId());
        assertEquals("P1", order.getProductId());
        assertEquals(orderDate, order.getOrderDate());
        assertEquals("Pending", order.getStatus());
        assertEquals(20.0f, order.getTotalPrice(), 0.001);
    }
}
