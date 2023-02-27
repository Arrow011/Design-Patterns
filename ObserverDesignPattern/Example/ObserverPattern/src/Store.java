import Observable.IphoneObservableImpl;
import Observable.MacBookObservableImpl;
import Observable.StockObservable;
import Observer.EmailAlertObserverImpl;
import Observer.NotificationAlertObserver;
import Observer.SMSAlertObserverImpl;

public class Store {
    public static void main(String[] args) {

        StockObservable iphoneObservable = new IphoneObservableImpl();
        StockObservable macbookObservable = new MacBookObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("abc@gmail.com", iphoneObservable);
        NotificationAlertObserver observer2 = new SMSAlertObserverImpl("Logan", iphoneObservable);
        NotificationAlertObserver observer3 = new EmailAlertObserverImpl("xyz@gmail.com", macbookObservable);

        iphoneObservable.add(observer1);
        iphoneObservable.add(observer2);
        macbookObservable.add(observer3);

        iphoneObservable.setStockCount(500);
        macbookObservable.setStockCount(200);
    }
}
