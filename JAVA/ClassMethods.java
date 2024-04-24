package JAVA;

class A {     // by defaul all the classes extends Object class and toString() is a part of the Object class
    @Override
    public String toString() {
        return "Hey";
    }
}

class B {

}

public class ClassMethods {
    public static void main (String args[]) {
        A obj = new A();
        System.out.println(obj); // Hey 
        // this is happening because when you don't override the toString() method in A() class , it actually calls the toString() methods of Object class whicj returns the data 
        B obj1 = new B();
        System.out.println(obj1); // JAVA.B@5c0d922b
    }
}
