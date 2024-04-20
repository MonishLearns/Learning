package LLD.OBSERVER.observer;


public class EmailObserver implements NotificationAlertObserver{
    String emailId;
    LLD.OBSERVER.observable.ObservableInterface observable;


    public EmailObserver(String emailId, LLD.OBSERVER.observable.ObservableInterface observable){
        this.emailId = emailId;
        this.observable = observable;
    }   

    @Override
    public void update(){
        System.out.println("sent email to "+ emailId + " " + observable.getName());
    }
}
