package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    // 1. Сумма всех продаж
    @Test
    void shouldCalculateSum () {

        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calculateSum(sales);

        assertEquals(expected, actual);
    }

    // 2. Средняя сумма продаж в месяц
    @Test
    void shouldCalculateAverage () {

        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.calculateAverage(sales);

        assertEquals(expected, actual);
    }

    // 3. Номер последнего месяца, в котором был пик продаж
    @Test
    void shouldMaxSales () {

        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.maxSales(sales);

        assertEquals(expected, actual);
    }

    // 4. Номер последнего месяца, в котором был минимум продаж
    @Test
    void shouldMinSales () {

        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.minSales(sales);

        assertEquals(expected, actual);
    }

    // 5. Кол-во месяцев, в которых продажи были ниже среднего
    @Test
    void  shouldBelowAverage () {

        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.belowAverage(sales);

        assertEquals(expected, actual);
    }

    // 6. Кол-во месяцев, в которых продажи были выше среднего
    @Test
    void  shouldAboveAverage () {

        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.belowAverage(sales);

        assertEquals(expected, actual);
    }
}