package dev.portfolio.designpattern.adapter.thermometer;

public class FahrenheitAdapter implements CelsiusThermometer {

    private final FahrenheitThermometer thermometer;

    public FahrenheitAdapter(FahrenheitThermometer thermometer) {
        this.thermometer = thermometer;
    }

    @Override
    public double getCelsius() {
        double fahrenheit = thermometer.getFahrenheit();

        return (fahrenheit - 32) * 5.0 / 9.0;
    }
}
