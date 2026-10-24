package dev.portfolio.designpattern.observer.order;

import java.util.ArrayList;
import java.util.List;

public class CustomerNotifier implements OrderObserver {

    private final List<OrderStatus> receivedStatuses = new ArrayList<>();

    @Override
    public void onStatusChanged(OrderStatus status) {
        receivedStatuses.add(status);
    }

    public List<OrderStatus> getReceivedStatuses() {
        return new ArrayList<>(receivedStatuses);
    }
}
