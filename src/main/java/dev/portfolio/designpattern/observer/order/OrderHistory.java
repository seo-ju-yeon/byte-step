package dev.portfolio.designpattern.observer.order;

import java.util.ArrayList;
import java.util.List;

public class OrderHistory implements OrderObserver {

    private final List<OrderStatus> statuses = new ArrayList<>();

    @Override
    public void onStatusChanged(OrderStatus status) {
        statuses.add(status);
    }

    public List<OrderStatus> getStatuses() {
        return new ArrayList<>(statuses);
    }
}
