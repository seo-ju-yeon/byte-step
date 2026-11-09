package dev.portfolio.designpattern.strategy.discount;

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
