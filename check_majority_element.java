
// O(n*log(n))

public class check_majority_element {

    public static int countInRange(int[] nums, int num, int lo, int hi) {

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num) {
                count++;
            }
        }
        return count;
    }

    public static int majElecountRec(int[] nums, int lo, int hi) {

        //base case
        if (lo == hi) {
            return nums[lo];
        }

        int mid = lo + (hi - lo) / 2;

        int leftPart = majElecountRec(nums, lo, mid);
        int rightPart = majElecountRec(nums, mid + 1, hi);

        if (leftPart == rightPart) {
            return leftPart;
        }

        int leftCount = countInRange(nums, leftPart, lo, hi);
        int rightCount = countInRange(nums, rightPart, lo, hi);

        return leftCount > rightCount ? leftPart : rightPart;
    }

    public static int MajorityElement(int[] nums) {

        return majElecountRec(nums, 0, nums.length - 1);
    }

    public static void main(String[] args) {

        int[] nums = {4, 5, 5, 6, 4, 5, 5, 4};
        System.out.println(MajorityElement(nums));

    }
}
