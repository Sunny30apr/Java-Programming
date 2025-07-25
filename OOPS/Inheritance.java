//Animal -> Fish            = Single Inheritance

//Animal -> Fish -> Shark   = Multiple Inheritance

//       -> Fish 
//Animal -> Bird            = heirarchial Inheritance
//       -> mammal 

//       -> Fish   -> Shark 
//                 ->Tuna
//Animal -> Bird            = hybrid Inheritance
//       -> mammal 

public class Inheritance {
    public static void main(String args[]) {
        Shark s = new Shark();
        s.eat();
    }
}

class Animal {
    String name;

    void eat() {
        System.out.print("eats");
    }

    void breath() {
        System.out.print("breaths");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.print("swims");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.print("fly");
    }
}

class Mammals extends Animal {
    void walk() {
        System.out.print("walks");
    }
}

class Tuna extends Fish{
    void bony() {
        System.out.print("Made of bones");
    }
}

class Shark extends Fish {
    void cartilagious() {
        System.out.print("Made of cartilage");
    }
}

