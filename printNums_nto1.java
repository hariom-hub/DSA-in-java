public class printnums_nto1 {

    public static int printNums(int n) {

        if (n == 1) {
            return 1;
        }
        System.out.println(n);
        int nums = printNums(n - 1);
        return nums;
    }

    public static void main(String[] args) {

        System.out.println(printNums(10));
    }
}
