package dev.portfolio.designpattern.templatemethod.beverage;

public class TeaMaker extends BeverageMaker {

    @Override
    protected String brew() {
        return "찻잎 우리기";
    }

    @Override
    protected String addCondiments() {
        return "레몬 추가하기";
    }
}
