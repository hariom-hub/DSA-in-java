public class counting_Sort {

    public static void Count_Sort(int[] arr, int n) {

        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int[] count = new int[largest + 1];

        for (int i = 0; i < count.length; i++) {
            count[arr[i]]++;
        }

        int j = 0;
        for (int i = 0; i < arr.length; i++) {

            while (count[i] > 0) {

                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void pritnArr(int[] arr) {

        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }

    }

    public static void main(String[] args) {

        int[] arr = { 1, 4, 1, 3, 2, 4, 3, 7 };
        int N = arr.length;
        Count_Sort(arr, N);
        pritnArr(arr);
    }
}
