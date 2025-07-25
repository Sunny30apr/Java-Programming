public class StaticImplement {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name="Sunny";
        s1.schoolName = "Techno Main";
        System.out.println(s1.name + " from " + s1.schoolName);

        Student s2 = new Student();
         System.out.println(s2.name + " from " + s2.schoolName);
        System.out.println(s2.schoolName);
        System.out.print(s2.Percentage(95, 96, 99));

    }
}

class Student {
    static float Percentage(int phy, int chem, int  math) {
        return (phy + chem + math) / (float)3;
    }

    String name;
    int roll;

    static String schoolName;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}