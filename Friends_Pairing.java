public class Friends_Pairing {

    public static int printFriendsPair(int n){

        if(n==1||n==2){
            return n;
        }

        return printFriendsPair(n-1) + (n-1)*printFriendsPair(n-2);
    }
    public static void main(String[] args){


        System.out.println(printFriendsPair(20));
    }
    
}
