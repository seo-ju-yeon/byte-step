package dev.portfolio.designpattern.templatemethod.beverage;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BeverageMakerTest {

    @Test
    void 커피를_정해진_순서대로_준비한다() {
        BeverageMaker maker = new CoffeeMaker();

        List<String> expected = List.of(
                "물 끓이기",
                "커피 추출하기",
                "컵에 따르기",
                "설탕과 우유 추가하기"
        );

        assertEquals(expected, maker.prepare());
    }

    @Test
    void 차를_정해진_순서대로_준비한다() {
        BeverageMaker maker = new TeaMaker();

        List<String> expected = List.of(
                "물 끓이기",
                "찻잎 우리기",
                "컵에 따르기",
                "레몬 추가하기"
        );

        assertEquals(expected, maker.prepare());
    }

    @Test
    void 커피를_여러번_준비해도_단계가_누적되지_않는다() {
        BeverageMaker maker = new CoffeeMaker();

        List<String> expected = List.of(
                "물 끓이기",
                "커피 추출하기",
                "컵에 따르기",
                "설탕과 우유 추가하기"
        );

        // 같은 객체에서 두 번 호출
        List<String> first = maker.prepare();
        List<String> second = maker.prepare();

        // 두 결과 모두 정확히 네 단계여야 함
        assertEquals(expected, first);
        assertEquals(expected, second);
    }

    @Test
    void 차를_여러번_준비해도_단계가_누적되지_않는다() {
        BeverageMaker maker = new TeaMaker();

        List<String> expected = List.of(
                "물 끓이기",
                "찻잎 우리기",
                "컵에 따르기",
                "레몬 추가하기"
        );

        // 같은 객체에서 두 번 호출
        List<String> first = maker.prepare();
        List<String> second = maker.prepare();

        // 두 결과 모두 정확히 네 단계여야 함
        assertEquals(expected, first);
        assertEquals(expected, second);
    }

}