package JAVA;

class A {

}

class B extends A {
    public void show1() {
        System.out.println("show2");
    }
}

public class DownCasting {
    public static void main() {
        A obj = new B();
        B obj1 = (B) obj;  // this is called down casting
        obj1.show1();
    }
}
