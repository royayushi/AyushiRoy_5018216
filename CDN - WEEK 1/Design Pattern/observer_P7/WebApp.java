package observer_P7;

public class WebApp implements Observer {
    @Override
    public void update(double stockPrice) {
        System.out.println("Web App: Stock price updated to $" + stockPrice);
    }
}

