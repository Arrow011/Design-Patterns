package Observer;

import Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{

    private String emailId;
    private StockObservable stockObservable;
    private static String MESSAGE = "Hurry! Product back in stock. :)";

    public EmailAlertObserverImpl(String emailId, StockObservable observable){
        this.emailId = emailId;
        this.stockObservable = observable;
    }

    @Override
    public void update() {
        sendEmail(emailId, MESSAGE);
    }

    private void sendEmail(String emailID, String message){
        System.out.println("Mail sent to "+emailID);
        System.out.println("===========");
        System.out.println(message);
    }
    
}
