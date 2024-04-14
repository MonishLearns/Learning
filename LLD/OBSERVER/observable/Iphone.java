package LLD.OBSERVER.observable;

import java.util.*;

import LLD.OBSERVER.observer.NotificationAlertObserver;

public class Iphone implements ObservableInterface{
    public List<NotificationAlertObserver> ObserverList = new ArrayList<>();
    public int stockCount =0;
    public String name = "IPHONE";

    @Override
    public void add(NotificationAlertObserver observer){
        ObserverList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer){
        ObserverList.remove(observer);
    }

    @Override
    public void notifySubscribers(){
        for(NotificationAlertObserver observer: ObserverList){
            observer.update();
        }
    }

    @Override
    public void changeState(int state){
        if(stockCount==0){
            notifySubscribers();
        }
        stockCount+=state;
    }

    @Override
    public int getState(){
        return stockCount;
    }

    @Override
    public String getName() {
        return name;
    }
}
