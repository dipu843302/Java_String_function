
import java.util.Scanner;

public class remove_char {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter String ");
        String s=scanner.next();
        System.out.println("Enter char (remove)");
        char ch=scanner.next().charAt(0);

        res(s,ch);
    }
    public static void res (String s,char ch){
        int l=s.length();
        String res="";
        for (int i=0;i<l;i++){
            if (s.charAt(i)==ch){

            }else {
                res+=s.charAt(i);
            }
        }
        System.out.println(res);
    }
}
