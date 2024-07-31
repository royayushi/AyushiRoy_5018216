package observer_P7;

public class ObserverPatternTest {
    public static void main(String[] args) {
        // Creating a stock market instance
        StockMarket stockMarket = new StockMarket();

        // Creating observer instances
        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();

        // Registering observers
        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        // Changing stock price and notifying observers
        stockMarket.setStockPrice(150.75);
        stockMarket.setStockPrice(155.00);
    }
}
