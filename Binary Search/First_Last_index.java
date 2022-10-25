import java.util.Scanner;

public class First_Last_index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            a[i] = sc.nextInt();
        }
        int find = sc.nextInt();
        System.out.println(firstOccurence(a, find));
        System.out.println(lastOccurence(a, find));
        sc.close();

    }
    public static int firstOccurence(int []a , int find){
        int lo = 0;
        int hi = a.length-1;
        int ans = -1;
        while(lo <= hi){
            int mid = (hi-lo)/2 + lo;
            if(a[mid] == find){
                ans = mid ;
                hi = mid-1;
            }
            else if(a[mid] > find){
                hi = mid-1;
            }else{
                lo = mid+1;
            }
        }
        return ans;
    }
    public static int lastOccurence(int []a , int find){
        int ans = -1;
        int lo = 0 ;
        int hi = a.length -1;
        while(lo <= hi){
            int mid = (hi-lo)/2 + lo;
            if(a[mid] == find){
                ans = mid;
                lo = mid+1;
            }
            else if(a[mid] > find){
                hi = mid-1;
            }
            else if(a[mid] < find){
                lo = mid-1;
            }
        }
        return ans;
    }
}
