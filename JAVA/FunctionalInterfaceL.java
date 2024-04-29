package JAVA;

@FunctionalInterface // this make sure interface has only function, if you uncomment the show1() function it will show error as it has 2 functions
interface A  {
    void show();
    // void show1();
}

public class FunctionalInterfaceL {
    public static void main(String args[]){
        A obj = new A() {
            public void show() {
                System.out.println("showing A");
            }
        };

        // with functional interfaces we can do the same thing below
        A obj1 = () -> {
            System.out.println("Showing A");
        };
        obj.show();
        obj1.show();
    }
}
