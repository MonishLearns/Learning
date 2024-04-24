package JAVA;

class A {
    public void show(int a){
        System.out.println(a);
    }
}

class B extends A {
    public void show() {
        System.out.println("monish");
    }
}

public class Inheritence {
    public static void main(String args[]){
        B obj = new B();
        obj.show();
    }
}
