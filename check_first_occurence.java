public class check_first_occurence {

    public static int checkOccur(int[] arr, int key, int i) {

        if (i == arr.length || arr[i] != key) {
            return -1;
        }
        if (key == arr[i]) {
            return i;
        }
        return checkOccur(arr, key, i + 1);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 6, 8};
        int key = 5;

        System.out.println(checkOccur(arr, key, 0));

    }
}
