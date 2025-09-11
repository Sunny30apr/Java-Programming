public class Subsets {
    public static void printSubsets(String str, String ans, int i) {
        if(i==str.length()) {
            if(ans.length() == 0) {
                System.out.print("null");
            }
            else {
                System.out.print(ans + " ");
            }
            return;
        }

        printSubsets(str, ans+str.charAt(i), i+1);
        printSubsets(str, ans, i+1);

    }

    public static void main(String args[]) {
        String str = "abc";
        printSubsets(str, "", 0);
    }
}