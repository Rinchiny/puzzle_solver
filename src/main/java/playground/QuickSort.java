package playground;

public class QuickSort {

  public void sort(int[] arr) {
    quickSort(arr, 0, arr.length - 1);
  }

  private void quickSort(int[] arr, int low, int high) {
    if (low < high) {
      int pivot = partition(arr, low, high);
      quickSort(arr, low, pivot - 1);
      quickSort(arr, pivot + 1, high);
    }
  }

  private int partition(int[] arr, int low, int high) {
    int pivot = getPivot(arr, high);
    int i = low - 1;

    for (int j = low; j <= high; j++) {
      if (arr[j] <= pivot) {
        i++;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }

    return i;
  }

  //we can use different pivot selection strategies
  private int getPivot(int[] arr, int high) {
    return arr[high];
  }
}
