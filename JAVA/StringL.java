package JAVA;

public class StringL {
    public static void main(String args[]){
        String a = "monish";
        a += " reddy";
        System.out.println(a);

        StringBuffer sb = new StringBuffer("reddy");
        System.out.println(sb.capacity()); // default 16

        sb.append("monish reddy");
        System.out.println(sb);
        System.out.println(sb.capacity());

        System.out.println(sb.charAt(20)); // exception
    }
    
}
