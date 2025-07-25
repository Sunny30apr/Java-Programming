import java.util.*;

public class IncomeTaxCalc {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your annual income: ");
        int income=sc.nextInt();
        int tax;

        if(income<500000) {
            tax=0;
        }
        else if(income>=500000 && income<=10000000){
            tax=(int)(0.20*income);   
        }
        else {
            tax=(int)(0.30*income);
        }
        System.out.print("Your tax: "+tax);
    }
}