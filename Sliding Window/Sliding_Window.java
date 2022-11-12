import java.util.Scanner;

public class Sliding_Window {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println("MaxSum = "+SlidingWindow(a, n, k));
        sc.close();
    }
    public static int SlidingWindow(int a[] , int n , int k){
        int maxSum = 0;
        int sum = 0;
        for(int i = 0 ; i < k ;i++){
            sum+=a[i];
        }
        maxSum = sum;
        System.out.println(sum );
        for(int i=0; i<n-k ; i++){
            sum = sum - a[i];
            sum = sum + a[i+k];
            System.out.println(sum +" "+a[i] + " "+ a[i+k]);
            if(sum > maxSum){
                maxSum = sum;
            }
        }
        return maxSum;
    }
}