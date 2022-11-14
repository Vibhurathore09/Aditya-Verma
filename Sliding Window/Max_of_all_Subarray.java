import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Max_of_all_Subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        sc.close();

        Deque<Integer> q = new LinkedList<>();
        int i = 0 ; int j = 0;
        int ans []= new int[n-k+1];
        while(j <  a.length){
            if(q.size() == 0){
                q.add(a[j]);
            }
            else{
                while(q.size()>0 && q.peekLast() < a[j]){
                    q.removeLast();
                }
                q.add(a[j]);
            }

            //Now move J pointer
            if(j-i+1 < k){
                j++;
            }
            if(j-i+1 == k){
                ans[i] = q.peek();
                if(a[i] == q.peek()){
                    q.removeLast();
                }
                i++;
                j++;
            }

        }
        for(int aa : ans)
            System.out.print(aa+" ");
    }
}
