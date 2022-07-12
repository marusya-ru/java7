package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StatServiceTest {

    @Test
    public void shouldSumAllSales() {
        StatsService service = new StatsService();
        long[] stat = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSum = 180;
        long actualSum = service.sumSales(stat);

        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldAverageAmountSalesMonth() {
        StatsService service = new StatsService();
        long[] stat = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAverageAmount = 15;
        long actualAverageAmount = service.averageSumSales(stat);

        assertEquals(expectedAverageAmount, actualAverageAmount);
    }

    @Test
    public void shouldMonthMaxSales() {
        StatsService service = new StatsService();
        long[] stat = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMaxMonth = 8;
        long actualMaxMonth = service.maxSales(stat);

        assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    public void shouldMonthMinSales() {
        StatsService service = new StatsService();
        long[] stat = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMinMonth = 9;
        long actualMinMonth = service.minSales(stat);

        assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    public void shouldCountMonthsSalesBelowAverage() {
        StatsService service = new StatsService();
        long[] stat = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedCountMonth = 5;
        int actualCountMonth = service.countMonthSalesBelowAverage(stat);

        assertEquals(expectedCountMonth, actualCountMonth);
    }

    @Test
    public void shouldCountMonthsSalesAboveAverage() {
        StatsService service = new StatsService();
        long[] stat = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedCountMonth = 5;
        int actualCountMonth = service.countMonthSalesAboveAverage(stat);

        assertEquals(expectedCountMonth, actualCountMonth);
    }
}
