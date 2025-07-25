public class Triangle1_0 {
    public static void main(String args[]) {
        
        int n=5;
        int num=1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                if(j<=i) {
                    System.out.print(num + " ");
                    if(num==1) {
                        num=0;
                    }
                    else {
                        num=1;
                    }
                }
            }
            System.out.print("\n");
        }
    }
}