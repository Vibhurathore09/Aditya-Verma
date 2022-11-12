import java.util.Scanner;

public class Max_of_SubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            a[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        int sum = 0;
        for(int i = 0 ; i < k ; i++){
            sum += a[i];
        }

        int maxSum = sum;
        for(int i = 0 ; i < n-k ; i++){
            sum = sum - a[i];
            sum = sum + a[i+k];
            if(sum > maxSum){
                maxSum = sum;
            }
        }
        System.out.println(maxSum);
        sc.close(); 
    }
}
