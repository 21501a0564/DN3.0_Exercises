package com.example.observer;

public class ObserverPatternTest {
    public static void main(String[] args) {
        // Create StockMarket instance
        StockMarket stockMarket = new StockMarket();

        // Create observer instances
        MobileApp mobileApp = new MobileApp();
        WebApp webApp = new WebApp();

        // Register observers
        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        // Set stock price and notify observers
        stockMarket.setStockPrice(100.50);
        stockMarket.setStockPrice(105.75);
    }
}
