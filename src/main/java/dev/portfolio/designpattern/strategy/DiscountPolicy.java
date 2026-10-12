package dev.portfolio.designpattern.strategy;

public interface DiscountPolicy {

    int apply(int price);  // 할인 후 가격을 반환

}
