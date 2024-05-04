package polymorphism;

class Animal{
    void eat(){
        System.out.println("Animal eats");
    }
}

class Cat extends Animal{
    @Override
    void eat(){
        System.out.println("Cat eats");
    }
}





public class Overriding {
    public static void main(String[] args) {
        Animal animal = new Cat();  //overriding (reference is the parent, animal | object is the child, cat). Will only call methods overridden methods 
        //parent reference will hold the child object

        Cat c = new Cat();  //inheritance rules - child reference will hold the child object
    }
}
