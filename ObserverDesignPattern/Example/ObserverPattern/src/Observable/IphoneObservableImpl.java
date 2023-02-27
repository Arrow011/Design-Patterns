package Observable;

import java.util.ArrayList;
import java.util.List;

import Observer.NotificationAlertObserver;

public class IphoneObservableImpl implements StockObservable{

    public List<NotificationAlertObserver> observerList = new ArrayList<>();
    int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
      observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        observerList.forEach(observer -> observer.update());
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
