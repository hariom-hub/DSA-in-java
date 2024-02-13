public class search_Rotated_Array {


    public static int SearchElement(int[] arr, int target, int si, int ei) {

        //base case
        if (si > ei) {
            return -1;
        }
        //WORK
        int mid = si + (ei - si) / 2;

        //case found

        if (arr[mid] == target) {
            return mid;
        }

        //case 1 if mid-lies on line 1

        if (arr[si] <= arr[mid]) {

            if (arr[si] <= target && target <= arr[mid]) {
                return SearchElement(arr, target, si, mid - 1);
            } else {
                return SearchElement(arr, target, mid + 1, ei);
            }
        }

        //case 2 if mid lies on line 2
        else {

            if (arr[mid] <= target && target <= arr[ei]) {

                return SearchElement(arr, target, mid + 1, ei);
            } else {
                return SearchElement(arr, target, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 4;
        int targetIdx = SearchElement(arr,target,0,arr.length-1);
        System.out.println(targetIdx);

    }
}
