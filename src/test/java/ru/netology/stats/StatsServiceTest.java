package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {

    @org.junit.jupiter.api.Test
    void sumOfAllSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.sumOfAllSales(sales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void averageMonthlySales() {
        StatsService service = new StatsService();
        int[] monthPrice = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.averageMonthlySales(monthPrice);
        assertEquals(expected, actual);
    }

    @Test
    void lastmonthMaxSales() {
        StatsService service = new StatsService();
        int[] monthPrice = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 7;
        int actual = service.monthMaxSales(monthPrice);
        assertEquals(expected, actual);
    }

    @Test
    void monthMinSales() {
        StatsService service = new StatsService();
        int[] monthPrice = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.monthMinSales(monthPrice);
        assertEquals(expected, actual);
    }

    @Test
    void monthsMinAverageSales() {
        StatsService service = new StatsService();
        int[] monthPrice = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.monthsMinAverageSales(monthPrice);
        assertEquals(expected, actual);
    }

    @Test
    void monthsMaxAverageSales() {
        StatsService service = new StatsService();
        int[] monthPrice = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.monthsMaxAverageSales(monthPrice);
        assertEquals(expected, actual);
    }

}