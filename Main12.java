
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}


class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}


class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}


interface Domestic {
    void play();
}

interface DogBehavior extends Domestic {
    void guard();
}


class DomesticDog implements DogBehavior {
    public void play() {
        System.out.println("Domestic dog is playing");
    }

    public void guard() {
        System.out.println("Domestic dog is guarding");
    }
}

public class Main12 {
    public static void main(String[] args) {
        DomesticDog dog = new DomesticDog();
        dog.play();    
        dog.guard();   
    }
}
