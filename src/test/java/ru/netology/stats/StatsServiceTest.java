package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void findTheSumOfAllSales() {
        StatsService service = new StatsService();

        int[] numbers = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.findTheSumOfAllSales(numbers);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void findTheAverageMonthlySales() {
        StatsService service = new StatsService();

        int[] numbers = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverageSum = 15;
        int actualAverageSum = service.findTheAverageMonthlySales(numbers);

        Assertions.assertEquals(expectedAverageSum, actualAverageSum);
    }

    @Test
    public void findTheNumberOfTheMonthWithTheMaxSalesAmount() {
        StatsService service = new StatsService();

        int[] numbers = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDayMaxSales = 8;
        int actualDayMaxSales = service.findTheNumberOfTheMonthWithTheMaxSalesAmount(numbers);

        Assertions.assertEquals(expectedDayMaxSales, actualDayMaxSales);
    }

    @Test
    public void findTheNumberOfTheMonthWithTheMinSalesAmount() {
        StatsService service = new StatsService();

        int[] numbers = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDayMinSales = 9;
        int actualDayMinSales = service.findTheNumberOfTheMonthWithTheMinSalesAmount(numbers);

        Assertions.assertEquals(expectedDayMinSales, actualDayMinSales);
    }

    @Test
    public void findTheNumberOfMonthsInWhichSalesWereBelowAverage() {
        StatsService service = new StatsService();

        int[] numbers = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSalesBelowAverage = 5;
        int actualSalesBelowAverage = service.findTheNumberOfMonthsInWhichSalesWereBelowAverage(numbers);

        Assertions.assertEquals(expectedSalesBelowAverage, actualSalesBelowAverage);
    }

    @Test
    public void findTheNumberOfMonthsInWhichSalesWereAboveAverage() {
        StatsService service = new StatsService();

        int[] numbers = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSalesAboveAverage = 5;
        int actualSalesAboveAverage = service.findTheNumberOfMonthsInWhichSalesWereBelowAverage(numbers);

        Assertions.assertEquals(expectedSalesAboveAverage, actualSalesAboveAverage);
    }
}
