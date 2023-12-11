package Vit.Java;

abstract class Animal{
    int n;
    public abstract void makeSound();
}
class Cat extends Animal{
    public void makeSound(){
        System.out.println("meow");
    }
}
class Dog extends Animal{
    public void makeSound(){
        System.out.println("woof");
    }
}

public class AbstractEx {
    public static void main(String[] args) {
        new Dog().makeSound();
        new Cat().makeSound();
    }
}
