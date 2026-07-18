package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.statistic.StatisticsService;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;
        long actual = service.findMax(incomesInBillions);
        Assertions.assertEquals(expected, actual);
    }

    // 1. Максимум — первый элемент (ветка false для всех остальных)
    @Test
    void findMaxWhenMaxFirst() {
        StatisticsService service = new StatisticsService();
        long[] data = {10, 3, 7, 2, 5};
        long expected = 10;
        long actual = service.findMax(data);
        Assertions.assertEquals(expected, actual);
    }

    // 2. Максимум — последний элемент (ветка true срабатывает в конце)
    @Test
    void findMaxWhenMaxLast() {
        StatisticsService service = new StatisticsService();
        long[] data = {1, 3, 5, 7, 9};
        long expected = 9;
        long actual = service.findMax(data);
        Assertions.assertEquals(expected, actual);
    }

    // 3. Один элемент (цикл выполняется один раз)
    @Test
    void findMaxSingleElement() {
        StatisticsService service = new StatisticsService();
        long[] data = {42};
        long expected = 42;
        long actual = service.findMax(data);
        Assertions.assertEquals(expected, actual);
    }

    // 4. Все элементы равны (ветка false всегда)
    @Test
    void findMaxAllEqual() {
        StatisticsService service = new StatisticsService();
        long[] data = {7, 7, 7, 7, 7};
        long expected = 7;
        long actual = service.findMax(data);
        Assertions.assertEquals(expected, actual);
    }

    // 5. Отрицательные числа (для уверенности)
    @Test
    void findMaxWithNegativeNumbers() {
        StatisticsService service = new StatisticsService();
        long[] data = {-5, -2, -8, -1, -3};
        long expected = -1;
        long actual = service.findMax(data);
        Assertions.assertEquals(expected, actual);
    }
}
