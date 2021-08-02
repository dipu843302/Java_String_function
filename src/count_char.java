import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class count_char {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        HashMap<Character,Integer>hashMap=new HashMap<>();
        for (int i=0;i<s.length();i++){
           if(hashMap.containsKey(s.charAt(i))){
               hashMap.put(s.charAt(i),hashMap.get(s.charAt(i))+1);
           }else {
               hashMap.put(s.charAt(i),1);
           }
        }
        for (Map.Entry<Character,Integer>map:hashMap.entrySet()){
            System.out.println(map.getKey()+" - "+map.getValue() );
        }
    }
}
