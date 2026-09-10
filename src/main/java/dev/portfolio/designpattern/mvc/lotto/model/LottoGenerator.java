package dev.portfolio.designpattern.mvc.lotto.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * 로또 번호 추천기
 *
 * <p>1부터 45까지의 숫자 중 중복되지 않는 번호 6개를 무작위로 생성하고,
 * 오름차순으로 정렬하여 반환한다. 구매 번호를 추천하는 기능이므로
 * 보너스 번호는 생성하지 않는다.</p>
 */
public class LottoGenerator {

    private final Random random = new Random();

    public List<Integer> generate() {

        Set<Integer> numbers = new HashSet<>();

        while (numbers.size() < 6) {
            int number = random.nextInt(45) + 1;
            numbers.add(number);
        }

        List<Integer> sortedNumbers = new ArrayList<>(numbers);
        Collections.sort(sortedNumbers);

        return sortedNumbers;
    }

}
