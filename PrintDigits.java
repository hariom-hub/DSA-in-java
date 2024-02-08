
public class getDigits {

    static String[] Digits = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    public static void printDigits(int num) {

        // base case
        if (num == 0) {
            return;
        }

        int lastDigit = num % 10;
        printDigits(num / 10);

        System.out.println(Digits[lastDigit] + " ");
    }

    public static void main(String[] args) {

        printDigits(12345);

    }
}
