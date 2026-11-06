package dev.portfolio.designpattern.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoffeeTest {

    private final Coffee coffee = new Coffee();
    private final MilkDecorator milkDecorator = new MilkDecorator(coffee);

    @Test
    void 기본_커피의_가격과_설명을_반환한다() {
        assertEquals(3000, coffee.getPrice());
        assertEquals("커피", coffee.getDescription());
    }

    @Test
    void 우유를_추가하면_가격과_설명에_반영된다() {
        // milkDecorator: 커피+우유 = 3500

        assertEquals(3500, milkDecorator.getPrice());
        assertEquals("커피 + 우유", milkDecorator.getDescription());
    }

    @Test
    void 우유와_샷을_순서대로_추가하면_가격과_설명에_반영된다() {
        // milkShotCoffee: 커피+우유+샷 = 4200

        Beverage milkShotCoffee = new ShotDecorator(milkDecorator);

        assertEquals(4200, milkShotCoffee.getPrice());
        assertEquals("커피 + 우유 + 샷", milkShotCoffee.getDescription());
    }

    @Test
    void 샷을_두번_추가하면_가격과_설명에_중복_반영된다() {
        // doubleShotCoffee: 커피+샷+샷 = 4400

        Beverage shotCoffee = new ShotDecorator(coffee);
        Beverage doubleShotCoffee = new ShotDecorator(shotCoffee);

        assertEquals(4400, doubleShotCoffee.getPrice());
        assertEquals("커피 + 샷 + 샷", doubleShotCoffee.getDescription());
    }

}