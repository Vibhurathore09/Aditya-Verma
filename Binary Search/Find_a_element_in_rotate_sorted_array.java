import java.util.Scanner;

public class Find_a_element_in_rotate_sorted_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0 ; i  < n ; i ++){
            a[i] = sc.nextInt();
        }
        int find = sc.nextInt();
        System.out.println("Min INdex "+minIndex(a, find));
        int min = minIndex(a, find);
        int a1 = BinarySearch(a, find , min , a.length-1 );
        int a2 = BinarySearch(a, find, 0, min-1);
        if(a1 > 0){
            System.out.println(a1);
        }else if(a2 > 0){
            System.out.println(a2);
        }
        else{
            System.out.println(-1);
        }
        sc.close();
    }
    public static int minIndex(int a[] , int x ){
        int n = a.length;
        int si = 0 ; 
        int ei = a.length-1;
        while(si <= ei){
            int mid = (ei-si)/2 + si;
            int prev = (mid + n -1)%n;
            int next = (mid+1)%n;
            if(a[mid] <= a[prev] && a[mid] <= a[next]){
                return mid;
            }
            else if(a[mid] >= a[ei]){
                si = mid+1;
            }else{
                ei = mid-1;
            }
        }
        return -1;
    }
    public static int BinarySearch(int a[] , int x ,int si , int ei){
        // int si = 0 ; 
        // int ei = a.length-1;
        while(si <= ei){
            int mid = (ei-si)/2 + si;
            if(a[mid] == x){
                return mid;
            }else if(a[mid] > x){
                ei = mid-1;
            }else{
                si = mid+1;
            }
        }
        return -1;
    }
}
