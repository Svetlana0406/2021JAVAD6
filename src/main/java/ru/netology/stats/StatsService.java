package ru.netology.stats;

public class StatsService {
    public long calculateSum(long[] sales) {
        long sum = 0;
        for (long monthlySales : sales) {
            sum += monthlySales;
        }
        return sum;
    }

    public long calculateAverage(long[] sales) {
        long result = 0;
        if (sales.length > 0) {
            result = calculateSum(sales) / sales.length;
        }
        return result;
    }

    public long findMaxMonthNumber(long[] sales) {
        long max = sales[0];
        long monthMax = 1;
        long monthNumber = 0;
        for (long monthlySales : sales) {
            monthNumber += 1;
            if (monthlySales >= max) {
                max = monthlySales;
                monthMax = monthNumber;
            }
        }
        return monthMax;
    }

    public long findMinMonthNumber(long[] sales) {
        long min = sales[0];
        long monthMin = 1;
        long monthNumber = 0;
        for (long monthlySales : sales) {
            monthNumber += 1;
            if (monthlySales <= min) {
                min = monthlySales;
                monthMin = monthNumber;
            }
        }
        return monthMin;
    }

    public long findMonthsUnderAverage(long[] sales) {
        long inferior = 0;
        for (long monthlySale : sales) {
            if (monthlySale < calculateAverage(sales)) {
                inferior += 1;
            }
        }
        return inferior;
    }

    public long findMonthsOverAverage(long[] sales) {
        long superior = 0;
        for (long monthlySale : sales) {
            if (monthlySale > calculateAverage(sales)) {
                superior += 1;
            }
        }
        return superior;

    }
}