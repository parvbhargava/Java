import java.util.Arrays;
import java.util.Scanner;
public class Anagrams {
    public static boolean isAnagram(String a , String b) {
        char stra[] = new char[a.length()];
        char strb[] = new char[b.length()];
        if(a.length() != b.length()){
            return false;
        }
        Arrays.sort(stra);
        Arrays.sort(stra);
        for(int i=0;i<a.length();i++){
            if(stra[i] != strb[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = scan.nextLine();
        scan.close();
        boolean res = isAnagram(a,b);
        System.out.println((res)?"Anagrams":"Not Anagrams");
    }
}