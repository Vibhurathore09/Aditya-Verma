import java.util.Scanner;

public class Ciel_of_an_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            a[i] = sc.nextInt();

        }
        int find = sc.nextInt();
        System.out.println(Ciel(a , find));
        sc.close();
    }  
    public static int Ciel(int a[] , int find){
        int ans  = -1;
        int si = 0 , ei = a.length-1;
        while(si <= ei){
            int mid = (ei-si)/2 +si;
            if(a[mid] == find){
                return mid;
            }
            if(a[mid] < find){
                si = mid+1;
            }
            else{
                ans = mid;
                ei = mid-1;
            }
        }
        return ans;
    }
}
