import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = {2, 4, 6, 8 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{8, 6, 4, 2}, input1);
	}

  @Test
  public void testReversed() {
    int[] input1 = {4, 5};
    assertArrayEquals(new int[]{5, 4}, ArrayExamples.reversed(input1));
  }

}
