import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SortIFTest {

SortIF sort_if;
	
	@BeforeEach
	public void setUp() {
		sort_if = new Sort(new String[][]{{ "A" , "C" }, { "C", "D" }, { "B", "C" }});
	}
	
	@Test
	@DisplayName("The Method isWellSorted() is working")
	void testIsWellSorted() {
		assertFalse(sort_if.isWellSorted(new String[]{ "D" , "C", "B", "A" }));
		assertFalse(sort_if.isWellSorted(new String[]{ "C" , "A" }));
		assertFalse(sort_if.isWellSorted(new String[]{ "C" , "C", "D", "A" }));
		assertTrue(sort_if.isWellSorted(new String[]{ "A" , "B", "C", "D" }));
	}
}
