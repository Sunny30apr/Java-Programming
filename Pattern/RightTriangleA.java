public class RightTriangleA {
    public static void main(String args[]) {
        
        int n=4;
        char ch='A';

        for(int i=0; i<n; i++) {
            for(int j=0; j<i+1; j++) {
                System.out.print(ch++ +" ");
            }
            System.out.print("\n");
        }
    }
}