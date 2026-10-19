package dev.portfolio.designpattern.observer.stock;

import java.util.ArrayList;
import java.util.List;

public class RestockCustomer implements RestockSubscriber {

    private final List<Integer> receivedStocks = new ArrayList<>();

    @Override
    public void onRestocked(int stock) {
        receivedStocks.add(stock);
    }

    public List<Integer> getReceivedStocks() {
        return new ArrayList<>(receivedStocks);
    }
}
