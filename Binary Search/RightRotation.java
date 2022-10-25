import java.util.Scanner;

public class RightRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            a[i] = sc.nextInt();
        }
        System.out.println(findKRotation(a, n));
        sc.close();
    }
    public static int findKRotation(int arr[], int n) {
        // code here
        if(n == 1){
            return 0;
        }
        int min = minValue(arr , n);
        return min;
        
    }
    public static int minValue(int arr[] , int n){
        int si = 0 ;
        int ei = arr.length-1;
        while(si <= ei){
            int mid = (ei-si)/2 + si;
            int prev = (mid + n -1)%n;
            int next = (mid+1)%n;
            if(arr[mid] <= arr[prev] && arr[mid] < arr[next]){
                return mid;
            }else if(arr[ei] < arr[mid]){
                si = mid +1;
            }else{
                ei = mid -1;
            }
            
        }
        return -1;
    }
}
