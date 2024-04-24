package JAVA;

class Mobile {
    static String type;
    String name;
    static {
        type="smartPhone";    // this static block will be created only once no matter how many objects you create.
    }
    // static block is always called before constructor

    public static void show() {
        System.out.println(type);
    }
}

public class StaticE {
    public static void main(String args[]){
        System.out.println(Mobile.type);
        Mobile.type = "smartPhone1";
        System.out.println(Mobile.type); // this is right way of accessing static variables
        Mobile obj = new Mobile();
        System.out.println(obj.type); // it works but wrong way of accessing static variables
    }
}
