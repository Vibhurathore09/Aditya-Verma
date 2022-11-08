import java.util.Scanner;

public class Bitonic_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            a[i] = sc.nextInt();
        }
        System.out.println(Bitonic(a));
    }
    public static int Bitonic(int []a ){
        int s = 0;
        int e = a.length-1;
        while(s <= e){
            int mid = (e-s)/2 + s;
            if(mid > 0 && mid < a.length-1){
                if(a[mid] > a[mid-1] && a[mid] > a[mid+1]){
                    return mid;
                }
                else if(a[mid] < a[mid-1]){
                    e = mid-1;
                }else{
                    s = mid+1;
                }
            }

        }
        return -1;
    }
}
