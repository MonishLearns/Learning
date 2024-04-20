package LLD.OBSERVER;

public class Main {
    public static void main(String args[]){
        LLD.OBSERVER.observable.ObservableInterface iphoneObservable = new LLD.OBSERVER.observable.Iphone();

        LLD.OBSERVER.observer.NotificationAlertObserver emailObserver1 = new LLD.OBSERVER.observer.EmailObserver("monish@gmail.com", iphoneObservable);
        LLD.OBSERVER.observer.NotificationAlertObserver emailObserver2 = new LLD.OBSERVER.observer.EmailObserver("monish123@gmail.com", iphoneObservable);

        iphoneObservable.add(emailObserver1);
        iphoneObservable.add(emailObserver2);

        iphoneObservable.changeState(10);
    }
}
