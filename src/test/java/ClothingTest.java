import org.junit.Test;
import static org.junit.Assert.*;


public class ClothingTest {
	@Test
    public void testClothingConstructor() {
        // Test seller constructor and getter methods
        Clothing cloth = new Clothing("01","Clothes",4f,"Pants for comfort","Levis", "35","Men","Red","Cotton");
        assertEquals("Levis", cloth.getBrand());
        assertEquals("35", cloth.getSize());
        assertEquals("Men", cloth.getGender());
        assertEquals("Red", cloth.getColor());
        assertEquals("Cotton", cloth.getMaterial());
  
    }
}
