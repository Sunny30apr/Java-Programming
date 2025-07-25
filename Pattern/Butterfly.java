public class Butterfly {
    public static void main(String args[]) {
        
        int n=4;

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=2*n; j++) {
                if(j<=i || j>=2*n-i+1) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }    
            System.out.print("\n");
        }
        for(int i=n+1; i<=2*n; i++) {
            for(int j=1; j<=2*n; j++) {
                if(j<=2*n-i+1 || j>=i) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }    
            System.out.print("\n");
        }
    }
}