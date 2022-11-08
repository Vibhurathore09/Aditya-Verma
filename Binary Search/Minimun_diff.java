import java.util.Scanner;

public class Minimun_diff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            a[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        System.out.println(BS(a, key));
        sc.close();
    }
    public static int BS(int a[] , int key){
        int si = 0;
        int ei = a.length-1;
        while(si <= ei){
            int mid = (ei-si)/2 + si;
            if(a[mid] == key){
                return a[mid]-key;
            }
            else if(a[mid] > key){
                ei = mid-1;
            }
            else {
                si = mid+1;
            }

        }
        int low = Math.abs(a[si] - key);
        int high = Math.abs(a[ei] - key);

        return low>high?high : low;
    }
}
