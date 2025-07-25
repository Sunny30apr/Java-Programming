public class MultipleInheritance {
    public static void main(String args[]) {
        Bear bc = new Bear();
        bc.eat();
        bc.danger();
        bc.walk();
    }
}

interface Herbivore {
    void eat();
}

interface Carnivore {
    void danger();
}

class Bear implements Herbivore, Carnivore {
    public void eat() {
        System.out.println("Eats both veg and non-veg");
    }

    public void danger() {
        System.out.println("Dangerous for humans.");
    }
      
    void walk() {
        System.out.println("walks");
    }
}