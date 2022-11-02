import java.util.Scanner;

public class Find_position_of_element_in_infinite_sorted_array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            a[i] = sc.nextInt();
        }
        int find = sc.nextInt();
        int pos = findEnd(a, find);
        System.out.println(pos);
        sc.close();
    }
    public static int findEnd(int a[] , int find){
        int start = 0 ;
        int end = 1;
        while(a[end] < find){
            start = end;
            end = start*2;
        }
        return FindPos(a, find, start, end);
    }
    public static int FindPos(int a[] , int find , int start , int end){
        int res = -1;
        while(start <= end){
            int mid = (end-start)/2 + start;
            if(a[mid] == find){
                return a[mid];
            }
            else if(a[mid] > find){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return res;
    }
}