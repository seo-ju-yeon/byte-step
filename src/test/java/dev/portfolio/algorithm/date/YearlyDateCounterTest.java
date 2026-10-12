package dev.portfolio.algorithm.date;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class YearlyDateCounterTest {

    private final YearlyDateCounter counter = new YearlyDateCounter();

    @Test
    void 여러_해에_걸친_반복_횟수를_센다() {
        LocalDate startDate = LocalDate.of(2022, 6, 19);
        LocalDate endDate = LocalDate.of(2026, 11, 12);
        int month = 10;
        int day = 16;

        int result = counter.solve(startDate, endDate, month, day);
        assertEquals(5, result);
    }

    @Test
    void 시작일과_종료일이_목표_날짜면_포함한다() {
        LocalDate startDate = LocalDate.of(2022, 10, 16);
        LocalDate endDate = LocalDate.of(2022, 10, 16);
        int month = 10;
        int day = 16;

        int result = counter.solve(startDate, endDate, month, day);
        assertEquals(1, result);
    }

    @Test
    void 범위에_목표_날짜가_없으면_0을_반환한다() {
        LocalDate startDate = LocalDate.of(2022, 11, 1);
        LocalDate endDate = LocalDate.of(2023, 10, 15);
        int month = 10;
        int day = 16;

        int result = counter.solve(startDate, endDate, month, day);
        assertEquals(0, result);
    }

    @Test
    void 종료일이_목표_날짜면_포함한다() {
        LocalDate startDate = LocalDate.of(2022, 11, 1);
        LocalDate endDate = LocalDate.of(2023, 10, 16);
        int month = 10;
        int day = 16;

        int result = counter.solve(startDate, endDate, month, day);
        assertEquals(1, result);
    }
}