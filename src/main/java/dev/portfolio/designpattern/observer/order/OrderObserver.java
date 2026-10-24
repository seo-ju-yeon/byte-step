package dev.portfolio.designpattern.observer.order;

public interface OrderObserver {
    void onStatusChanged(OrderStatus status);
}
