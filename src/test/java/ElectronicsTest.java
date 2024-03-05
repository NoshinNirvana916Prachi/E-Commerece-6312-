import org.junit.Test;
import static org.junit.Assert.*;


public class ElectronicsTest {
	@Test
    public void testElectronicsConstructor() {
        // Test seller constructor and getter methods
        Electronics electronic = new Electronics("01","Electronics",10.5f,"Lifes good","LG", "45EA","TV");
        assertEquals("LG", electronic.getBrand());
        assertEquals("45EA", electronic.getModel());
        assertEquals("TV", electronic.getCategory());
        
  
    }
}
