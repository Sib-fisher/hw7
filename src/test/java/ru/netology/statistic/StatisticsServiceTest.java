package ru.netology.statistic;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;
        long actual = service.findMax(incomesInBillions);
        assertEquals(expected, actual);
    }

    @Test
    void findMaxWhenMaxAtEnd() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {1, 2, 3, 4, 5};
        long expected = 5;
        long actual = service.findMax(incomes);
        assertEquals(expected, actual);
    }

    @Test
    void findMaxWhenMaxAtStart() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {10, 5, 3, 2, 1};
        long expected = 10;
        long actual = service.findMax(incomes);
        assertEquals(expected, actual);
    }

    @Test
    void findMaxWithNegativeNumbers() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {-5, -2, -10, -1, -8};
        long expected = -1;
        long actual = service.findMax(incomes);
        assertEquals(expected, actual);
    }

    @Test
    void findMaxWithSingleElement() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {42};
        long expected = 42;
        long actual = service.findMax(incomes);
        assertEquals(expected, actual);
    }

    @Test
    void findMaxWithAllEqual() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {7, 7, 7, 7, 7};
        long expected = 7;
        long actual = service.findMax(incomes);
        assertEquals(expected, actual);
    }
}
