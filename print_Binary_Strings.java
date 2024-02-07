public class print_Binary_Strings {

    public static void BinaryStrings(int n, int lastBit, String str) {

        if (n == 0) {
            System.out.println(str);
            return;
        }

        BinaryStrings(n - 1, 0, str + "0");

        if (lastBit == 0) {
            BinaryStrings(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {

        BinaryStrings(5, 1, "");
    }
}
