package dev.portfolio.algorithm.date;

import java.time.LocalDate;

/**
 * 기준일부터 종료일까지 특정 월·일이 몇 번 등장하는지 센다.
 *
 * <p>찾을 월·일은 매년 한 번씩 반복된다. 시작일과 종료일도 계산 범위에 포함한다.</p>
 *
 * <p>예시:</p>
 * <ul>
 *     <li>2022-06-19부터 2026-10-12까지 10월 16일 → 4번
 *         (2022년, 2023년, 2024년, 2025년)</li>
 *     <li>2022-10-16부터 2022-10-16까지 10월 16일 → 1번</li>
 *     <li>2022-11-01부터 2023-10-15까지 10월 16일 → 0번</li>
 * </ul>
 *
 * <p>제한 조건:</p>
 * <ul>
 *     <li>{@code startDate}는 {@code endDate}보다 늦지 않다.</li>
 *     <li>{@code month}와 {@code day}는 매년 존재하는 날짜를 나타낸다.
 *         예를 들어 2월 29일은 입력되지 않는다.</li>
 *     <li>오늘 날짜가 필요하면 호출하는 쪽에서 {@code endDate}로 전달한다.</li>
 * </ul>
 */
public class YearlyDateCounter {

    public int solve(LocalDate startDate, LocalDate endDate, int month, int day) {

        int count = 0;

        for (int year = startDate.getYear(); year <= endDate.getYear(); year++) {
            LocalDate targetDate = LocalDate.of(year, month, day);

            boolean withinRange =
                    !targetDate.isBefore(startDate)
                            && !targetDate.isAfter(endDate);

            if (withinRange) {
                count++;
            }
        }

        return count;
    }

}
