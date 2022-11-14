import java.util.Scanner;

public class Count_Occurences_of_Anagrams {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String txt = sc.next();
        String pat = sc.next();
        System.out.println(search(txt, pat));
        sc.close();
    }
    public static int search(String txt , String pat){
        if(txt.length() < pat.length()){
            return 0;
        }
        int count = 0;
        int a[] = new int[26];
        int b[] = new int[26];
        int k = pat.length();
        for(int i = 0 ; i <  k ; i++){
            a[txt.charAt(i)-'a']++;
        }
        for(int i = 0 ; i < k ; i++){
            b[pat.charAt(i)-'a']++;
        }
        if(check(a, b)){
            count++;
        }
        // int i = 0 ;
        int j = 0;
        for(int i= k; i < txt.length() ; i++){
            b[txt.charAt(j)-'a']--;
            b[txt.charAt(i)-'a']++;

            if(check(a , b)){
                count++;
            }
            j++;
        }


        return count;
    }
    public static boolean check(int a[] , int b[]){
        for(int i = 0 ;i <  26 ; i++){
            if(a[i] != b[i]){
                return false;
            }
        }
        return true;
    }
}