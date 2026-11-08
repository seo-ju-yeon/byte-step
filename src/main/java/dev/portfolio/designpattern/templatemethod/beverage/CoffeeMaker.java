package dev.portfolio.designpattern.templatemethod.beverage;

public class CoffeeMaker extends BeverageMaker{

    @Override
    protected String brew() {
        return "커피 추출하기";
    }

    @Override
    protected String addCondiments() {
        return "설탕과 우유 추가하기";
    }
}
