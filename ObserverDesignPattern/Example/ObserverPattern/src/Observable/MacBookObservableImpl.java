package Observable;

import java.util.ArrayList;
import java.util.List;

import Observer.NotificationAlertObserver;

public class MacBookObservableImpl implements StockObservable{

    private List<NotificationAlertObserver> observableList = new ArrayList<>();
    private int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver observer) {
        observableList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observableList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        observableList.forEach(observer -> observer.update());
    }

    @Override
    public void setStockCount(int newStocksAdded) {
       if(stockCount == 0 && newStocksAdded != 0){
        notifySubscribers();
       }
       stockCount = newStocksAdded;
    }

    @Override
    public int getStockCount() {
       return stockCount;
    }
    
}
