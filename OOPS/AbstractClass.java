public class AbstractClass {
    public static void main(String args[]) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);

        Chicken c = new Chicken();
        c.eat();
        c.walk();
        c.changeColor();
        System.out.println(c.color);

        //Animal a = new Animal();

        Mustang m = new Mustang();

    }
}

abstract class Animal {
    String color;

    Animal() {
        System.out.println("Animal constructor is called. . .");
        color = "brown";
    }

    void eat() {
        System.out.println("Animal eats.");
    }

    abstract void walk();
}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse constructor is called. . .");
    }
    void changeColor() {
        color = "dark Brown";
    }
    void walk() {
        System.out.println("Horse walks on 4 legs.");
    }
}

class Chicken extends Animal {
    void changeColor() {
        color = "yellow";
    }
    void walk() {
        System.out.println("Horse walks on 2 legs.");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constructor is called. . .");
    }
}
