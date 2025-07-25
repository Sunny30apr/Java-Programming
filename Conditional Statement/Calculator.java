import java.util.*;

public class Calculator{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your 1st operand: ");
        int a=sc.nextInt();
        // sc.nextLine();
        System.out.print("Enter operator: ");
        char b=sc.next().charAt(0);
        System.out.print("Enter your 2nd operand: ");
        int c=sc.nextInt();

        float ans;
        switch(b) {
            case '+': ans=a+c;
            break;
            case '-': ans=a-c;
            break;
            case '*': ans=a*c;
            break;
            case '/': ans=a/c;
            break;
            case '%': ans=a%c;
            break;
            default: ans=0;
        }
        System.out.print(ans);
        
    }
}