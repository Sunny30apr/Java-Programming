public class Polymorphism {
    public static void main(String args[]) {
        Calculator c = new Calculator();
        System.out.println(c.sum(1, 2));
        System.out.println(c.sum((float)1.5, (float)2.5));
        System.out.println(c.sum(1, 2, 3));

        Deer d = new Deer();
        d.eat();
    }
}

//Method Overloading
class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

//Method Overriding
class Animal {
    void eat() {
        System.out.print("Eats anything");
    }
}

class Deer extends Animal {
    // @override
    void eat() {
        System.out.print("Eats grass");
    }
}