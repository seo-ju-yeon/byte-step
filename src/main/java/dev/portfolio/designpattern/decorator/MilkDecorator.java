package dev.portfolio.designpattern.decorator;

public class MilkDecorator implements Beverage {

    // 우유를 추가할 대상 음료
    private final Beverage beverage;

    // 생성자로 전달받은 음료를 필드에 저장
    public MilkDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int getPrice() {
        return beverage.getPrice() + 500;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + 우유";
    }
}
