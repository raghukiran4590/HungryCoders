package src.main.java;

public class Animal {

    void sound() {
        System.out.println("Animal makes sound");
    }

    public static void main(String[] args) {

        Animal animal = new Dog(); //Upcasting (Implicit)
        animal.sound();

        if (animal instanceof Dog) {
            Dog dog = (Dog) animal; //Downcasting (Explicit)
            dog.sound();
        }

        Animal animal1 = new Animal();

        if(animal1 instanceof Dog) {
            Dog anotherDog = (Dog) animal1;
            anotherDog.sound();
        } else {
            System.out.println("Cannot downcast as animal1 is not a Dog");
        }
    }


}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

}
