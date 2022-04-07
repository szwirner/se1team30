import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TasksSortIFTest {

	TasksSortIF ts;
	
	@BeforeEach
	public void setUp() {
		ts = new TasksSort(new String[][]{{ "A" , "C" }, { "C", "D" }, { "B", "C" }});
	}
	
	@Test
	@DisplayName("isWellSorted() should work correctly")
	void testIsWellSorted() {
		assertTrue(ts.isWellSorted(new String[]{ "A" , "B", "C", "D" }));
		assertFalse(ts.isWellSorted(new String[]{ "D" , "C", "B", "A" }));
	}

}
