package dev.portfolio.designpattern.adapter.thermometer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FahrenheitAdapterTest {

    @Test
    void 화씨_온도계는_이력한_온도를_그대로_반환한다() {
        FahrenheitThermometer thermometer = new FahrenheitThermometer(77.0);

        // assertEquals(예상값, 실제값, 허용오차);
        assertEquals(77.0, thermometer.getFahrenheit(), 0.000001);
    }

    @Test
    void 화씨_32도는_섭씨_0도로_변환한다() {
        FahrenheitThermometer thermometer = new FahrenheitThermometer(32.0);
        CelsiusThermometer adapter = new FahrenheitAdapter(thermometer);

        assertEquals(0.0, adapter.getCelsius(), 0.000001);
    }

    @Test
    void 화씨_212도는_섭씨_100도로_변환된다() {
        FahrenheitThermometer thermometer = new FahrenheitThermometer(212.0);
        CelsiusThermometer adapter = new FahrenheitAdapter(thermometer);

        assertEquals(100.0, adapter.getCelsius(), 0.000001);
    }

    @Test
    void 화씨_77도는_섭씨_25도로_변환된다() {
        FahrenheitThermometer thermometer = new FahrenheitThermometer(77.0);
        CelsiusThermometer adapter = new FahrenheitAdapter(thermometer);

        assertEquals(25.0, adapter.getCelsius(), 0.000001);
    }

    @Test
    void 화씨_영하_40도는_섭씨_영하_40도로_변환된다() {
        FahrenheitThermometer thermometer = new FahrenheitThermometer(-40.0);
        CelsiusThermometer adapter = new FahrenheitAdapter(thermometer);

        assertEquals(-40.0, adapter.getCelsius(), 0.000001);
    }

    @Test
    void 섭씨로_변환해도_원본_화씨_온도는_유지된다() {
        FahrenheitThermometer thermometer = new FahrenheitThermometer(77.0);
        CelsiusThermometer adapter = new FahrenheitAdapter(thermometer);

        // 어댑터를 통해 섭씨로 변환
        double celsius = adapter.getCelsius();

        // 반환 결과와 원본 온도를 각각 확인
        assertEquals(25.0, celsius, 0.000001);
        assertEquals(77.0, thermometer.getFahrenheit(), 0.000001);
    }

}