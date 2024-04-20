package LLD.OBSERVER.observable;

public interface ObservableInterface {
    public void add(LLD.OBSERVER.observer.NotificationAlertObserver observer);
    public void remove(LLD.OBSERVER.observer.NotificationAlertObserver observer);
    public void notifySubscribers();
    public void changeState(int state);
    public int getState();
    public String getName();
}
