package dev.portfolio.designpattern.mvc.lotto.model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LottoGeneratorTest {

    private final LottoGenerator generator = new LottoGenerator();

    @Test
    void 로또_번호를_6개_생성한다() {
        List<Integer> numbers = generator.generate();

        assertEquals(6, numbers.size());
    }

    @Test
    void 모든_번호는_1부터_45_사이이다() {
        List<Integer> numbers = generator.generate();

        assertTrue(numbers.stream().allMatch(number -> number >= 1 && number <= 45));
    }

    @Test
    void 생성된_번호는_서로_중복되지_않는다() {
        List<Integer> numbers = generator.generate();

        assertEquals(numbers.size(), new HashSet<>(numbers).size());
    }

    @Test
    void 생성된_번호는_오름차순으로_정렬된다() {
        List<Integer> numbers = generator.generate();
        List<Integer> sortedNumbers = new ArrayList<>(numbers);
        sortedNumbers.sort(Integer::compareTo);

        assertEquals(sortedNumbers, numbers);
    }
}
