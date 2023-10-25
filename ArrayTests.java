import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
  @Test
  public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[] { 3 }, input1);

  }

  @Test
  public void testReverseInPlace2() {
    int[] input2 = { 1, 2 };
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[] { 2, 1 }, input2);
  }

  @Test
  public void testReverseInPlace3() {
    int[] input3 = null;
    ArrayExamples.reverseInPlace(input3);
    assertArrayEquals(null, input3);
  }

  @Test
  public void testReversed() {
    int[] input1 = {};
    assertArrayEquals(new int[] {}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed2() {
    int[] input2 = { 1, 1, 2, 3, 4 };
    ArrayExamples.reversed(input2);

    assertArrayEquals(new int[] { 4, 3, 2, 1, 1 }, input2);
  }

  @Test
  public void testReversed3() {
    int[] input3 = null;
    assertArrayEquals(null, ArrayExamples.reversed(input3));
  }
}
