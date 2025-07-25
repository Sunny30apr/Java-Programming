public class Diamond {
    public static void main(String args[]) {
        
        int n=4;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=2*n; j++) {
                if(j>=n-i+1 && j<n+i) {
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
                if(j>=i-n && j<=3*n-i) {
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