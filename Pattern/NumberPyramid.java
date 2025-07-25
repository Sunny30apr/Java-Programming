public class NumberPyramid {
    public static void main(String args[]) {
        
        int n=5;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=2*n; j++) {
                if(j>=n-i+1 && j<=n+i-1 && j%2==i%2) {
                    System.out.print(i);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}