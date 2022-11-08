import java.util.Scanner;

public class Search_in_Bitonic_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0 ; i  < n ; i++){
            a[i] = sc.nextInt();
        }
        int find = sc.nextInt();
        int mid = findBitonicPoint(a, n);
        int as = ascendingBS(a, 0, mid, find);
        int ds = descendingBS(a, mid+1, n-1, as);
        if(as > 0){
            System.out.println(as);
        }else{
            System.out.println(ds);
        }
        sc.close();
    }
    public static int findBitonicPoint(int a[] , int n ){
        int s = 0;
        int e = a.length-1;
        while(s <= e){
            int mid = (e-s)/2 + s;
            if(a[mid] > a[mid-1] && a[mid] > a[mid+1]){
                return mid;
            }
            else {
                if(a[mid] > a[mid-1] && a[mid] < a[mid+1]){
                    s = mid+1 ;

                }
                else{
                    if(a[mid] < a[mid-1] && a[mid] > a[mid+1]){
                        e = mid-1 ;   
                    }
                }
            }
        }
        return -1;
    }
    public static int ascendingBS(int a[] , int s , int e , int key){
        while(s <= e){
            int mid = (e-s)/2 + s;
            if(a[mid] == key){
                return mid;
            }
            if(a[mid] > key){
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        return -1;
    }
    public static int descendingBS(int a[] , int s , int e , int key){
        while(s <= e){
            int mid = (e-s)/2 + s;
            if(a[mid] == key){
                return mid;
            }
            if(a[mid] < key){
                e = mid-1;
            }else{
                s = mid+1;
            }
        }
        return -1;
    }
}