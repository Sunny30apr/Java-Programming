import java.util.*;

public class NumberInWords {

    static String digits[] = {"zero", "one", "two", "three", "four", "five", "six",
    "seven", "eight", "nine"};

    public static void numToWords(int number) {
    if(number == 0) {
        return;
    }

    int lastDigit = number%10;
    numToWords(number/10);
    System.out.print(digits[lastDigit]+" ");
    }

    // public static void numToWords (int num) {
    //     if(num==0) {
    //         return;
    //     }

    //     numToWords(num/10);

    //     int digit=num%10;
    //     switch(digit) {
    //         case 1: System.out.print("One ");
    //                 break;

    //         case 2: System.out.print("Two ");
    //                 break;

    //         case 3: System.out.print("Three ");
    //                 break;

    //         case 4: System.out.print("Four ");
    //                 break;

    //         case 5: System.out.print("Five ");
    //                 break;

    //         case 6: System.out.print("Six ");
    //                 break;

    //         case 7: System.out.print("Seven ");
    //                 break;

    //         case 8: System.out.print("Eigth ");
    //                 break;

    //         case 9: System.out.print("Nine ");
    //                 break;

    //         case 0: System.out.print("Zero ");
    //                 break;
    //     }
        
    // }

    public static void main(String args[]) {
        int num=1947;
        numToWords(num);
    }
}