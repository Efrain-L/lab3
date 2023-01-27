import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test
  public void testReversedList() {
    int[] input = {1, 2, 3, 4, 5, 6, 7, 8};
    assertArrayEquals(new int[]{8, 7, 6, 5, 4, 3, 2, 1}, ArrayExamples.reversed(input));
  }

  @Test
  public void testReverseInPlaceList() {
    int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1}, input);
  }

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }
}
