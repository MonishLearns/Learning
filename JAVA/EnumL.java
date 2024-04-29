package JAVA;

enum StatusExtended {
    Running(2), Failed(1), Pending(4), Success(9);
    int value;
    StatusExtended(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
}
enum Status {
    Running, Failed, Pending, Success;
}





public class EnumL {
    public static void main(String args[]){
        Status s = Status.Running;
        System.out.println(s); // Running
        System.out.println(s.ordinal()); // 0
        Status[] values = Status.values();
        System.out.println(values[1]); // Failed
        StatusExtended l = StatusExtended.Running;
        System.out.println(l.getValue());
    }
}
