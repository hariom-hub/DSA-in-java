
public class optimized_power_n {

    public static int calcPower(int x, int n) {

        if(n==0){
            return 1;
        }
        int halfPower = calcPower(x, n / 2);
        int halfPowersq = halfPower * halfPower;

        if (n % 2 != 0) {
            halfPowersq = x * halfPowersq;
        }

        return halfPowersq;
    }

    public static void main(String[] args) {

        System.out.println(calcPower(2,11));

    }
}
