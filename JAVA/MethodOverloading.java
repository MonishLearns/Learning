package JAVA;

class Calculator{
    public int add(int n1, int n2){
        return n1+n2;
    }
    public int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }

    public double add(double n1, int n2){
        return n1+n2;
    }
}

public class MethodOverloading {
    public static void main(String args[]){
        Calculator cal = new Calculator();
        int r1 =cal.add(1, 2);
        double r2 = cal.add(1.0, 2);
        System.out.println(r1);
        System.out.println(r2);
    }
}
