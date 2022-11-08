import java.util.Scanner;

public class Search_in_Row_Col_Sorted_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] []= new int[n][n];
        for(int i = 0  ; i < n ; i++){
           for(int j = 0 ; j < n ; j++){
            a[i][j] = sc.nextInt();
           }
        }
        int find = sc.nextInt();
        // System.out.println(Search(a, find));
        Search(a, find);
        sc.close();
    }
    public static void Search(int a[][] , int find){
        int j = a.length-1;
        for(int i = 0 ; i < a.length;i++){
            if(a[i][j] == find){
                System.out.println(i+" "+j);
                return;
            }
            if(a[i][j] > find){
                j--;
            }
            else{
                i++;
            }
        }
        // return -1;
        System.out.println("NOt FOUND");
        return;
    }
}
