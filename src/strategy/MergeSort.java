package strategy;

import java.util.Arrays;

public class MergeSort implements SortingMethod {

  @Override
  public int[] sort(int[] arr) {
    return sort(arr, 0, arr.length - 1);
  }

  private int[] sort(int[] arr, int start, int end) {
    if (start >= end) {
      return Arrays.copyOfRange(arr, start, end + 1);
    } else {
      int   mid       = (start + end) / 2;
      int[] leftHalf  = sort(arr, start, mid);
      int[] rightHalf = sort(arr, mid + 1, end);
      return merge(leftHalf, rightHalf);
    }
  }

  private int[] merge(int[] leftHalf, int[] rightHalf) {
    int i = 0;
    int j = 0;
    int k = 0;

    int[] resultantArray = new int[leftHalf.length + rightHalf.length];

    while (i < leftHalf.length && j < rightHalf.length) {
      if (leftHalf[i] < rightHalf[j]) {
        resultantArray[k++] = leftHalf[i++];
      } else {
        resultantArray[k++] = rightHalf[j++];
      }
    }

    while (i < leftHalf.length) {
      resultantArray[k++] = leftHalf[i++];
    }

    while (j < rightHalf.length) {
      resultantArray[k++] = rightHalf[j++];
    }

    return resultantArray;
  }

}
