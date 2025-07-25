public class Palindrome {
    public static void main(String args[]) {
        
        int n=5;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=2*n; j++) {
                if(j>=n-i+1 && j<=n+i-1) {
                    if(j<=n) {
                        System.out.print(n-j+1 + " ");
                    } 
                    else {
                        System.out.print(j-n+1 + " ");
                    }
                    
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }
}