package JAVA;

public class InttoString {
    public static void main(String[] args){
        String n = "12";
        int num1 = Integer.parseInt(n); 
        System.out.println(num1*3); // 36

        int n1 = 10;
        Integer l = n1; // auto boxing
        String l1 = l.toString(); // convert integer to string
        System.out.println(l1);
        int p = l;       // auto unboxing
        System.out.println(p+" "+n1+" "+l); // 10 10 10
    }
}
