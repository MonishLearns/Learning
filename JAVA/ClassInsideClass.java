package JAVA;

class A {
    int a =10;
    public void show() {
        System.out.println("showing");
    }
    class B {
        public void show1() {
            System.out.println("class B showing");
        }
    }

    static class C {  // only inner classes can be made static
        public void show2() {
            System.out.println("showing c Class");
        }
    }
}

public class ClassInsideClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        A.B obj1 = obj.new B();
        obj1.show1();

        A.C obj2 = new A.C(); // because C is a static class
        obj2.show2();
    }
}
