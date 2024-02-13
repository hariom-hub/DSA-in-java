public class quickSort {

    public static void printArr(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // partition

    public static int Partition(int[] arr, int si, int ei) {

        int pivot = arr[ei];
        int i = si - 1;

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {

                // swap

                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void Quicksort(int[] arr, int si, int ei) {

        // base case
        if (si >= ei) {
            return;
        }
        int pivotIdx = Partition(arr, si, ei);
        Quicksort(arr, si, pivotIdx - 1); // left
        Quicksort(arr, pivotIdx + 1, ei); // right

    }

    public static void main(String[] args) {

        int[] arr = { 6, 3, 9, 8, 2, 5 };

        System.out.println("Sorted array is : ");
        Quicksort(arr, 0, arr.length - 1);
        printArr(arr);

    }
}
