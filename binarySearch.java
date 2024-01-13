

public class binarySearch {

    public static int biSearch(int arr[],int key){

        int start = 0;
        int end = arr.length - 1;
        int mid = (start+end)/2;

        while(start<=end){

            if(mid == key){
                return mid;
            }
            else if(mid<key){
                end = mid - 1;     //1st(left)half
            }
            else{
                //mid>key
                start = mid+1;   //2nd(right)half
            }
        }
        return 0;
    }
    public static void main(String[] args){

        int arr[] = {2,4,6,8,10,12,14};
        int key = 10;
        biSearch(arr, key);
        System.out.println(biSearch(arr, key));
    }
}
