package ru.netology.stats;

public class StatsService {
    public long sumSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public long averageSumSales(long[] sales) {
        long sum = sumSales(sales);
        long averageSum = sum / sales.length;
        return averageSum;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int countMonthSalesBelowAverage(long[] sales) {
        long averageSum = averageSumSales(sales);
        int countMonth = 0;
        for (long sale : sales) {
            if (sale < averageSum) {
                countMonth = countMonth + 1;
            }
        }
        return countMonth;
    }

    public int countMonthSalesAboveAverage(long[] sales) {
        long averageSum = averageSumSales(sales);
        int countMonth = 0;
        for (long sale : sales) {
            if (sale > averageSum) {
                countMonth = countMonth + 1;
            }
        }
        return countMonth;
    }
}
