import java.util.Scanner;

public class Search_in_nearly_sorted_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            a[i] = sc.nextInt();
        }
        int find = sc.nextInt();
        System.out.println(ModifiedBS(a , find));
        sc.close();
    }
    public static int ModifiedBS(int a[] , int find){
        int l = 0;
        int h = a.length-1;
        while(l <= h){
            int mid = (h-l)/2 + l;
            if(a[mid] == find){
                return mid;
            }
            else if(mid > l && a[mid+1] == find){
                return mid+1;
            }
            else if(mid < h && a[mid-1] == find){
                return mid-1;
            }
        }
        return -1;
    }
}
