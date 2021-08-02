import java.util.ArrayList;
import java.util.Scanner;

public class String_palimdrome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter word");
        String s=scanner.nextLine();
        String(s);
    }
    public static void String(String s){
        String a="";
        for (int i=s.length()-1;i>=0;i--){
            a+=s.charAt(i);
        }
        if (a.equals(s)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }
}
