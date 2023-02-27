package Observer;

import Observable.StockObservable;

public class SMSAlertObserverImpl implements NotificationAlertObserver{

    private String userName;
    private StockObservable observable;
    private final String MESSAGE = "Hurry! Product Back in Stock :)";

    public SMSAlertObserverImpl(String userName, StockObservable observable){
        this.userName = userName;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendSMS(userName,MESSAGE);
    }

    private void sendSMS(String userName, String message){
        System.out.println("SMS send to "+userName);
        System.out.println("============");
        System.out.println(message);
    }
    
}
