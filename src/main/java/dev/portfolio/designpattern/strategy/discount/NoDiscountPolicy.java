package dev.portfolio.designpattern.strategy.discount;

public class NoDiscountPolicy implements DiscountPolicy {

    @Override
    public int apply(int price) {
        return price;
    }

}
