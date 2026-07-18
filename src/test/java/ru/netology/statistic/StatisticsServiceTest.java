package ru.netology.statistic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatisticsServiceTest {

    @Test
    void findMaxWhenMaxAtEnd() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;
        long actual = service.findMax(incomesInBillions);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWhenMaxAtBeginning() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {100, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 100;
        long actual = service.findMax(incomesInBillions);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxWhenSingleElement() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {42};
        long expected = 42;
        long actual = service.findMax(incomesInBillions);
        Assertions.assertEquals(expected, actual);
    }
}
