package JAVA;

public class Array {
    public static void main(String args[]){
        int num[] = {5,6,7};
        int num1[] = new int[4]; // it will have 0 until you fill something
        int nums[][] = new int[3][4];    
        System.out.println((int)(Math.random()*100));
        for(int n: num){
            System.out.println(n);
        }

        // jagged array
        int numj[][] = new int[3][];
        numj[0] = new int[4];
        numj[1] = new int[3];

        System.out.println(num.length);


    }
}
