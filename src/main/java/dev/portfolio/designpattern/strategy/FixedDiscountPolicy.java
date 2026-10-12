package dev.portfolio.designpattern.strategy;

public class FixedDiscountPolicy implements DiscountPolicy {

    private final int discountAmount;

    public FixedDiscountPolicy(int discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Override
    public int apply(int price) {
        return Math.max(0, price - discountAmount);
    }
}
