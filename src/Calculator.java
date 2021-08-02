import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the numbers for calculations");
        float a=scanner.nextFloat();
        float b=scanner.nextFloat();
        System.out.println("Enter 1 for ADD ");
        System.out.println("Enter 2 for Subtract ");
        System.out.println("Enter 3 for Multiply ");
        System.out.println("Enter 4 for Divide ");
        System.out.println("Enter 5 for Modules ");
        int per=scanner.nextInt();
        System.out.println("your output ");
        switch (per){
            case 1:
                System.out.println(add(a,b));
                break;
            case 2:
                System.out.println(sub(a,b));
                break;
            case 3:
                System.out.println(Multiply(a,b));
                break;
            case 4:
                System.out.println(Divide(a,b));
                break;
            case 5:
                System.out.println(Modules(a,b));
                break;
        }
    }
    public static float add(float a,float b){
        float s=a+b;
        return s;

    }
    public static float sub(float a,float b){
        float s=a-b;
        return s;
    }
    public static float Multiply(float a,float b){
        float s=a*b;
        return s;
    }
    public static float Divide(float a,float b){
        float s=a/b;
        return s;
    }
    public static float Modules(float a,float b){
        float s=a%b;
        return s;
    }
}
