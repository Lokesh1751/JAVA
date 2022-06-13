// Do not need to show it to user so make it abstract class
abstract class Animal {
    Animal(){
        System.out.println("Your are creating a new animal");
    }
    abstract void walk();
    public void eats(){
        System.out.println("Animal Eats");
    }
}

class Horse extends Animal {
    Horse(){
        System.out.println("Your are creating a horse");
    }
    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal {
    Chicken(){
        System.out.println("Your are creating a chicken");
    }
    public void walk() {
        System.out.println("Walk on 2 legs");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.walk();

    }
}
