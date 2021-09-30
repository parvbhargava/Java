import java.util.Scanner;
public class AnagramMethodTwo {
    public static boolean isAnagram(String a,String b) {
        if(a.length() != b.length()) return false;

        a.toLowerCase();
        b.toLowerCase();

        char str1[] = new char[a.length()];
        char str2[] = new char[b.length()];
        
        int count[] = new int[256];
        
        for(int i=0;i<a.length();i++){
            count[a.charAt(i)]++;
            count[b.charAt(i)]--;        
        }

        for(int i=0;i<256;i++){
            if(count[i] != 0) return false;
        }

        return true;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );    
}
}
