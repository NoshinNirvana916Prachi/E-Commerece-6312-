import org.junit.Test;
import static org.junit.Assert.*;


public class InvoiceTest {
	@Test
    public void testInvoiceConstructor() {
        // Test seller constructor and getter methods
        Invoice invoice = new Invoice(1);
        assertEquals(1, invoice.getInvoiceNumber());
  
    }
}
