package dev.portfolio.designpattern.adapter.thermometer;

public class FahrenheitThermometer {

    // Fahrenheit: 화씨
    private final double fahrenheit;

    public FahrenheitThermometer(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }
}
