package strategy;

public class SelectionSort implements SortingMethod {

  @Override
  public int[] sort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {

      int minIndex = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[minIndex]) {
          minIndex = j;
        }
      }
      SortHelper.swap(arr, i, minIndex);
    }

    return arr;
  }

}
