package strategy;

import java.util.Arrays;
import java.util.Collections;

public class QuickSort implements SortingMethod {

  @Override
  public int[] sort(int[] arr) {
    Collections.shuffle(Arrays.asList(arr)); // To ensure runtime does not exceed O(nlogn)
    return sort(arr, 0, arr.length - 1);
  }

  private int[] sort(int[] arr, int low, int high) {
    if (low >= high) {
      return arr;
    }

    int pivotIndex = pivot(arr, low, high);
    sort(arr, low, pivotIndex - 1);
    sort(arr, pivotIndex + 1, high);

    return arr;
  }

  private int pivot(int[] arr, int low, int high) {
    int i            = low;
    int j            = high + 1;
    int pivotElement = arr[low];
   
    while (true) {
      while (arr[++i] < pivotElement) {
        if (i == high) {
          break;
        }
      }

      while (pivotElement < arr[--j]) {
        if (j == low) {
          break;
        }
      }
      
      if (i >= j) {
        break;
      }
      
      SortHelper.swap(arr, i, j);
    }

    SortHelper.swap(arr, low, j);
    
    return j;
  }

}
