import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String arr[] = s.split(" ");
        char ch[] = new char[arr.length];
        for(int i = 0 ; i < ch.length ; i++){
            ch[i] = arr[i].charAt(0);
        }
        for(char c : ch){
            System.out.println(c);
        }
        Integer [] a = new Integer[arr.length];
        for(int i = 0 ;i < arr.length ; i++){
            a[i] = ch[i] - '0';
        }
        Integer sum = 0;

        for(int i = 0 ; i  < a.length ; i++){
            sum += a[i];
        }
        System.out.println(sum);
        // for(String s1 : arr){
        //     System.out.println(s1);
        // }
        sc.close();
    }
}
