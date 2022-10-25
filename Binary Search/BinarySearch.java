import java.util.Scanner;

public class BinarySearch{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            a[i] = sc.nextInt();
        }
        int find = sc.nextInt();
        System.out.println(search(a, find));
        sc.close();
    }
    public static int search(int a[] , int target){
        int si = 0;
        int ei = a.length-1;
        while(si <= ei){
            int mid = (si+ei)/2;
            if(a[mid]== target){
                return mid;
            }
            else if(a[mid] > target){
                // System.out.println("mid -1 ");
                ei = mid -1;
            }
            else if(a[mid]< target){
                // System.out.println("mid +1 ");
                si = mid+1;
            }
        }
        return -1;
    }
}