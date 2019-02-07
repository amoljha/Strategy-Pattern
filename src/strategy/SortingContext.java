package strategy;

public class SortingContext {
  private SortingMethod sortingMethod;
  
  public SortingContext(SortingMethod sortingMethod) {
    this.sortingMethod = sortingMethod;
  }
  
  public int[] sortArray(int[] arr) {
    return sortingMethod.sort(arr);
  }
}
