package dev.portfolio.designpattern.strategy;

public class PercentDiscountPolicy implements DiscountPolicy {

    private final int percent;

    public PercentDiscountPolicy(int percent) {
        this.percent = percent;
    }

    @Override
    public int apply(int price) {
        int discountAmount = price * percent / 100;
        return price - discountAmount;
    }
}
