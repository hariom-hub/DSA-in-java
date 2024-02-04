public class print_nthfibonacci {
    

    public static int printFib(int n){

        if(n==0||n==1){
            return n;
        }
        int fib1 = printFib(n-1);
        int fib2 = printFib(n-2);
        int fib_n = fib1 + fib2;
        return fib_n;
    }
    public static void main(String[] args){


        System.out.println(printFib(10));
    }
}
