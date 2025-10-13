
// Abstract class
abstract class Animal {
    abstract void makeSound(); // Abstract method

    void sleep() {
        System.out.println("Animal is sleeping.");
    }
}

// First subclass
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks.");
    }
}

// Second subclass
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows.");
    }
}

// Runner class
public class AnimalRunner {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();
        dog.sleep();

        Animal cat = new Cat();
        cat.makeSound();
        cat.sleep();
    }
}


Let me know if you want this with constructor use or another example (bank, hospital, etc.).