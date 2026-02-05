// Superclass: Animal
class Animal {
    public void eat() {
        System.out.println("This animal is eating");
    }
}

// Subclass: Dog (inherits from Animal)
class Dog extends Animal {
    public void bark() {
        System.out.println("The dog is barking");
    }
}

// Main class
public class InheritanceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // Inherited method from Animal class
        dog.bark(); // Method from Dog class
        // Output:
        // This animal is eating
        // The dog is barking
    }
}

