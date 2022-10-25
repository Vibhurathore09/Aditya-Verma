import java.util.Scanner;

public class NumberofTimesArrayIsSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            a[i] = sc.nextInt();
        }
        System.out.println(findMin(a));
        System.out.println("NO of times array is rotated from left "+ (n-findMin(a)));
        sc.close();
    }
    public static int findMin(int [] a){
        int start = 0;
        int end = a.length-1;
        int n = a.length;
        if(n == 1){
            return a[0];
        }
        while(start <= end){
            int mid = (end-start)/2 + start;
            int prev = (mid + n -1)%n;
            int next = (mid+1)%n;
            System.out.println(prev+" prev "+mid+" mid "+next+" next ");
            if(a[mid] <= a[prev] && a[mid] <= a[next]){
                return a[mid];
            }
            else if(a[end] <= a[mid]){
                start = mid + 1;
            }else {
                end = mid-1;
            }
        }
        return -1;
    }   
}