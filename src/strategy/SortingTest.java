package strategy;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class SortingTest {

  private static int[] tinyArray;
  private static int[] smallArray;
  private static int[] mediumArray;
  private static int[] largeArray;
  private static int[] veryLargeArray;

  static final int TINY       = 5;
  static final int SMALL      = 100;
  static final int MED        = 1000;
  static final int LARGE      = 10000;
  static final int VERY_LARGE = 100000;

  /**
   * Initializes and sets up the arrays to be sorted
   * 
   * @throws InvalidSizeException if size is invalid
   */
  @Before
  public void setUp() throws Exception {
    tinyArray      = SortHelper.createRandomArray(TINY);
    smallArray     = SortHelper.createRandomArray(SMALL);
    mediumArray    = SortHelper.createRandomArray(MED);
    largeArray     = SortHelper.createRandomArray(LARGE);
    veryLargeArray = SortHelper.createRandomArray(VERY_LARGE);
  }

  /**
   * Test cases which sort an array using a given sorting context.
   * 
   * @throws ArrayElementException If the elements are not sorted, i.e, out of
   *                               place
   */

  public static boolean testTinyArray(SortingContext sortingContext) 
      throws ArrayElementException {
    int[] sortedTinyArray = sortingContext.sortArray(tinyArray);
    return SortHelper.checkIfSorted(sortedTinyArray);
  }

  public static boolean testSmallArray(SortingContext sortingContext) 
      throws ArrayElementException {
    int[] sortedSmallArray = sortingContext.sortArray(smallArray);
    return SortHelper.checkIfSorted(sortedSmallArray);
  }

  public static boolean testMediumArray(SortingContext sortingContext)
      throws ArrayElementException {
    int[] sortedMediumArray = sortingContext.sortArray(mediumArray);
    return SortHelper.checkIfSorted(sortedMediumArray);
  }

  public static boolean testLargeArray(SortingContext sortingContext) 
      throws ArrayElementException {
    int[] sortedLargeArray = sortingContext.sortArray(largeArray);
    return SortHelper.checkIfSorted(sortedLargeArray);
  }

  public static boolean testVeryLargeArray(SortingContext sortingContext)
      throws ArrayElementException {
    int[] sortedVeryLargeArray = sortingContext.sortArray(veryLargeArray);
    return SortHelper.checkIfSorted(sortedVeryLargeArray);
  }

  @Test
  public void testSelectionSort() throws ArrayElementException {
    SortingContext sortingContext = new SortingContext(new SelectionSort());
    assertTrue(testTinyArray(sortingContext));
    assertTrue(testSmallArray(sortingContext));
    assertTrue(testMediumArray(sortingContext));
    assertTrue(testLargeArray(sortingContext));
    assertTrue(testVeryLargeArray(sortingContext));
  }

  @Test
  public void testBubbleSort() throws ArrayElementException {
    SortingContext sortingContext = new SortingContext(new BubbleSort());
    assertTrue(testTinyArray(sortingContext));
    assertTrue(testSmallArray(sortingContext));
    assertTrue(testMediumArray(sortingContext));
    assertTrue(testLargeArray(sortingContext));
    assertTrue(testVeryLargeArray(sortingContext));
  }

  @Test
  public void testInsertionSort() throws ArrayElementException {
    SortingContext sortingContext = new SortingContext(new InsertionSort());
    assertTrue(testTinyArray(sortingContext));
    assertTrue(testSmallArray(sortingContext));
    assertTrue(testMediumArray(sortingContext));
    assertTrue(testLargeArray(sortingContext));
    assertTrue(testVeryLargeArray(sortingContext));
  }
  
  @Test
  public void testMergeSort() throws ArrayElementException {
    SortingContext sortingContext = new SortingContext(new MergeSort());
    assertTrue(testTinyArray(sortingContext));
    assertTrue(testSmallArray(sortingContext));
    assertTrue(testMediumArray(sortingContext));
    assertTrue(testLargeArray(sortingContext));
    assertTrue(testVeryLargeArray(sortingContext));
  }
  
  @Test
  public void testQuickSort() throws ArrayElementException {
    SortingContext sortingContext = new SortingContext(new QuickSort());
    assertTrue(testTinyArray(sortingContext));
    assertTrue(testSmallArray(sortingContext));
    assertTrue(testMediumArray(sortingContext));
    assertTrue(testLargeArray(sortingContext));
    assertTrue(testVeryLargeArray(sortingContext));
  }
}
