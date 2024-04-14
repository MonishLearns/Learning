package LLD.OBSERVER;

import LLD.OBSERVER.observable.Iphone;
import LLD.OBSERVER.observable.ObservableInterface;
import LLD.OBSERVER.observer.EmailObserver;
import LLD.OBSERVER.observer.NotificationAlertObserver;

public class Main {
    public static void main(String args[]){
        ObservableInterface iphoneObservable = new Iphone();

        NotificationAlertObserver emailObserver1 = new EmailObserver("monish@gmail.com", iphoneObservable);
        NotificationAlertObserver emailObserver2 = new EmailObserver("monish123@gmail.com", iphoneObservable);

        iphoneObservable.add(emailObserver1);
        iphoneObservable.add(emailObserver2);

        iphoneObservable.changeState(10);
    }
}
