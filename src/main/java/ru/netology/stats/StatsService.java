package ru.netology.stats;

public class StatsService {
    public int findTheSumOfAllSales(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }

    public int findTheAverageMonthlySales(int[] numbers) {
        int averageSum = 0;
        if (numbers.length > 0) {
            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }
            averageSum = sum / numbers.length;
        }
        return averageSum;
    }

    public int findTheNumberOfTheMonthWithTheMaxSalesAmount(int[] numbers) {
        int dayMaxSales = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >=numbers[dayMaxSales]){
                dayMaxSales = i;
            }
        }
        return dayMaxSales + 1;
    }

    public int findTheNumberOfTheMonthWithTheMinSalesAmount(int[] numbers) {
        int dayMinSales = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] <=numbers[dayMinSales]){
                dayMinSales = i;
            }
        }
        return dayMinSales + 1;
    }

    public int findTheNumberOfMonthsInWhichSalesWereBelowAverage(int[] numbers) {
        int salesBelowAverage = 0;
        int averageSum = findTheAverageMonthlySales(numbers);
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < averageSum){
                salesBelowAverage ++;
            }
        }
        return salesBelowAverage;
    }

    public int findTheNumberOfMonthsInWhichSalesWereAboveAverage(int[] numbers) {
        int salesAboveAverage = 0;
        int averageSum = findTheAverageMonthlySales(numbers);
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > averageSum){
                salesAboveAverage ++;
            }
        }
        return salesAboveAverage;
    }
}
