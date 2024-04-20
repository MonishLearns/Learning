package LLD.CHAINOFRESPONSIBILITY;

public class Main {
    public static void main(String args[]){
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logProcessor.log(LogProcessor.INFO, "just for info");
        logProcessor.log(LogProcessor.ERROR, "error bhai");
    }
}
