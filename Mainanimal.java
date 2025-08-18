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
class Labrador extends Dog {
  void display() {
   System.out.println("Labrator is type of Dog");
  }
}
public class Mainanimal {
  public static void main(String[] args) {
    Labrador Labrador=new Labrador();
    Labrador.eat();
    Labrador.bark();
    Labrador.display();
  }
}