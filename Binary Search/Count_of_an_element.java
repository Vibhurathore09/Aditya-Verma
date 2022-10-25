import java.util.Scanner;

public class Count_of_an_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            a[i] = sc.nextInt();
        }
        int find = sc.nextInt();
        System.out.println(Count(a,find));
        sc.close();
    }
    public static int Count(int a[] , int find){
        int lb = firstOccurence(a , find);
        int ub = LastOccurence(a , find);
        
        return ub-lb+1;
    }
    private static int LastOccurence(int[] a, int find) {
        int ans = -1;
        int si = 0;
        int ei = a.length-1;
        while(si <= ei){
            int mid= (ei-si)/2 + si;
            if(a[mid] == find){
                ans = mid;
                si = mid+1;
            }
            else if(a[mid] > find){
                ei = mid -1;
            }else{
                si = mid+1;
            }
        }
        return ans;
    }
    private static int firstOccurence(int[] a, int find) {
        int ans = -1;
        int si = 0;
        int ei = a.length-1;
        while(si <= ei){
            int mid= (ei-si)/2 + si;
            if(a[mid] == find){
                ans = mid;
                ei = mid-1;
            }
            else if(a[mid] > find){
                ei = mid -1;
            }else{
                si = mid+1;
            }
        }
        return ans;
    }
}
