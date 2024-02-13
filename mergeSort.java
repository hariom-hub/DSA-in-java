public class mergeSort {

    // print the sorted elements of the array
    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void Mergesort(int[] arr, int si, int ei) {

        // base case
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;

        // workd
        Mergesort(arr, si, mid);
        Mergesort(arr, mid + 1, ei);
        Merge(arr, si, mid, ei);
    }

    public static void Merge(int[] arr, int si, int mid, int ei) {

        int temp[] = new int[ei - si + 1];

        int i = si; // iterator for left part
        int j = mid + 1; // iterator for right part
        int k = 0; // iterator for temporary array

        while (i <= mid && j <= ei) {

            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // right part

        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copying temp to original array

        for (k = 0, j = si; k < temp.length; k++, j++) {

            arr[j] = temp[k];
        }

    }

    public static void main(String[] args) {

        int[] arr = { 6, 3, 9, 5, 2, 8, -1 };
        Mergesort(arr, 0, arr.length - 1);
        printArray(arr);

    }
}
