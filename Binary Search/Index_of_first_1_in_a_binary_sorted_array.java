import java.util.Scanner;

public class Index_of_first_1_in_a_binary_sorted_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int a[] = new int[n];
        // INput array of 0's and 1's in sorted format
        for(int i = 0 ; i < n ; i++){
            a[i] = sc.nextInt();

        }
        int find = 1;
        System.out.println(findStartAndEnd(a, find));
        sc.close();
    }

    public static int findStartAndEnd(int[] a, int find) {
        int start = 0;
        int end = 1;
        while (a[end] == 0) {
            start = end;
            end = end * 2;
        }
        return FindPos(a, find, start, end);
    }

    public static int FindPos(int a[], int find, int start, int end) {
        int res = -1;
        while (start <= end) {
            int mid = (end - start) / 2 + start;
            if (a[mid] == find) {
                res = mid;
                end = mid - 1;
            } else if (a[mid] < find) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return res;
    }
}
