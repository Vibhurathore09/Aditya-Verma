import java.util.ArrayDeque;
import java.util.Scanner;

public class First_Negative_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        sc.close();

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        int ans[] = new int[n-k+1];
        int i =0;
        int j = 0;
        int idx = 0;
        while(j < n){
            if(a[j] < 0){
                queue.add(a[j]);
            }
            if(j-i+1 == k){
                if(queue.size() == 0){
                    ans[idx++] = 0;
                }
                else  {
                    ans[idx++] = queue.peek();
                }
                if(queue.size() > 0 && queue.peek() == a[i]){
                    queue.poll();
                }
                i++;
            }
            j++;
        }
        System.out.println(queue);
        
    }
}
