import java.util.*;

public class IntroArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int marks[] = new int[10];

        marks[0] = 95;
        marks[1] = 96;
        marks[2] = 97;
        marks[3] = 98;

        System.out.println(marks.length);

        for(int i=0; i<marks.length; i++) {
            System.out.print(marks[i] + " ");
        }

    }
}