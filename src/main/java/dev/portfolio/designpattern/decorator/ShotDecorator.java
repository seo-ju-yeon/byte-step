package dev.portfolio.designpattern.decorator;

public class ShotDecorator implements Beverage {

    private final Beverage beverage;

    public ShotDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int getPrice() {
        return beverage.getPrice() + 700;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + 샷";
    }
}
