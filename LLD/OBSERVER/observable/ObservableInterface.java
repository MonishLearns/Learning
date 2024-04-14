package LLD.OBSERVER.observable;

import LLD.OBSERVER.observer.NotificationAlertObserver;

public interface ObservableInterface {
    public void add(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver observer);
    public void notifySubscribers();
    public void changeState(int state);
    public int getState();
    public String getName();
}
