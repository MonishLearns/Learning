package LLD.OBSERVER.observer;

import LLD.OBSERVER.observable.ObservableInterface;

public class EmailObserver implements NotificationAlertObserver{
    String emailId;
    ObservableInterface observable;


    public EmailObserver(String emailId, ObservableInterface observable){
        this.emailId = emailId;
        this.observable = observable;
    }   

    @Override
    public void update(){
        System.out.println("sent email to "+ emailId + " " + observable.getName());
    }
}
