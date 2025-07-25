public class AccessModifier {
    public static void main(String args[]) {
        bankAccount a = new bankAccount();
        a.username = "krsunny3004";
        // a.password="abcde1234";
        a.setPass("abcde1234");
        System.out.print(a.username + " : " + a.getPass());
    }
}   

class bankAccount {
    public String username;
    private String password;

    void setPass(String pwd) {
        password=pwd;
    }

    String getPass() {
        return this.password;
    }
}