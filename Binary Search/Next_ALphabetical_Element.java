import java.util.Scanner;

public class Next_ALphabetical_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char ch[] = new char[n];
        for(int i = 0 ; i < n ;i++ ){
            ch[i] = sc.next().charAt(0);
        }
        char find = sc.next().charAt(0);
        System.out.println(BinarySearch(ch , find));
        sc.close();
    }

    private static char BinarySearch(char[] ch, char find) {
        char res = '0';
        int si = 0;
        int ei = ch.length-1;
        while(si<= ei){
            int mid = (ei-si)/2 + si;
            if(ch[mid] == find){
                si = mid+1;
            }
            else if(ch[mid] < find){
                si = mid+1;
            }else if(ch[mid] > find){
                res = ch[mid];
                ei = mid-1;
            }
        }
        return res;
    }
}
