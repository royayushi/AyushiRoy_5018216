package observer_P7;

public class MobileApp implements Observer {
    @Override
    public void update(double stockPrice) {
        System.out.println("Mobile App: Stock price updated to $" + stockPrice);
    }
}

