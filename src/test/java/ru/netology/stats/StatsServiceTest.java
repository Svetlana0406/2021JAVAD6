package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    class StatsServiceTest {
        long[]sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        @Test
        void shouldCalculateTotalSum() {
            StatsService service = new StatsService();
            long expected = 180;
            long actual = service.calculateSum(sales);
            assertEquals(expected,actual);
            System.out.println("Сумма всех продаж:" +" "+ service.calculateSum(sales));
        }

        @Test
        void shouldCalculateAverageSales() {
            StatsService service = new StatsService();
            long expected = 15;
            long actual = service.calculateAverage(sales);
            assertEquals(expected,actual);
            System.out.println("Средняя сумма одной продажи:" +" "+ service.calculateAverage(sales));
        }

        @Test
        void shouldFindTheMonthWithMaxSales() {
            StatsService service = new StatsService();
            long expected = 8;
            long actual = service.findMaxMonthNumber(sales);
            assertEquals(expected, actual);
            System.out.println("Номер месяца, в котором был пик продаж:" +" "+ service.findMaxMonthNumber(sales));
        }


        @Test
        void shouldFindTheMonthWithMinSales() {
            StatsService service = new StatsService();
            long expected = 9;
            long actual = service.findMinMonthNumber(sales);
            assertEquals(expected, actual);
            System.out.println("Номер месяца, в котором был минимум продаж:" +" "+ service.findMinMonthNumber(sales));
        }

        @Test
        void shouldFindNumberOfMonthsUnderAverage() {
            StatsService service = new StatsService();
            long expected = 5;
            long actual = service.findMonthsUnderAverage(sales);
            assertEquals(expected, actual);
            System.out.println("Кол-во месяцев, в которых продажи были ниже среднего:" +" "+ service.findMonthsUnderAverage(sales));
        }

        @Test
        void shouldFindNumberOfMonthsOverAverage() {
            StatsService service = new StatsService();
            long expected = 5;
            long actual = service.findMonthsOverAverage(sales);
            assertEquals(expected, actual);
            System.out.println("Кол-во месяцев, в которых продажи были выше среднего:" +" "+ service.findMonthsUnderAverage(sales));

        }
    }
