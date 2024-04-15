package Learning.LLD.OBSERVER;

public class Main {
    public static void main(String args[]){
        Learning.LLD.OBSERVER.observable.ObservableInterface iphoneObservable = new Learning.LLD.OBSERVER.observable.Iphone();

        Learning.LLD.OBSERVER.observer.NotificationAlertObserver emailObserver1 = new Learning.LLD.OBSERVER.observer.EmailObserver("monish@gmail.com", iphoneObservable);
        Learning.LLD.OBSERVER.observer.NotificationAlertObserver emailObserver2 = new Learning.LLD.OBSERVER.observer.EmailObserver("monish123@gmail.com", iphoneObservable);

        iphoneObservable.add(emailObserver1);
        iphoneObservable.add(emailObserver2);

        iphoneObservable.changeState(10);
    }
}
