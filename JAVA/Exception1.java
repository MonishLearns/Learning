package JAVA;

public class Exception1 {
    public static void main(String[] args){
        int i =0;
        int j =10;
        try {
            j = j / i;
        }
        catch(Exception e){
            System.out.println("something went wrong"); // something went wrong
        }
        System.out.println(j); // 10
        System.out.println("printing even after error"); // printing even after error
    }
}
