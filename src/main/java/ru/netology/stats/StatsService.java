package ru.netology.stats;

public class StatsService {
    public int sumOfAllSales(int[] monthlySales) {
        int sum = 0;
        for (int sale : monthlySales) {
            sum += sale;
        }
        return sum;
    }

    public int averageMonthlySales(int[] monthlySales) {
        StatsService service = new StatsService();
        int sum = service.sumOfAllSales(monthlySales);
        int quantity = monthlySales.length;
        return sum / quantity;
    }

    public int monthMaxSales(int[] monthlySales) {
        int maxPrise = 0;
        for (int i = 1; i < monthlySales.length; i++) {
            if (monthlySales[i] >= monthlySales[maxPrise]) {
                maxPrise = i;
            }
        }
        return maxPrise;
    }

    public int monthMinSales(int[] monthlySales) {
        int minPrise = 0;
        for (int i = 1; i < monthlySales.length; i++) {
            if (monthlySales[i] < monthlySales[minPrise]) {
                minPrise = i;
            }
        }
        return minPrise;
    }

    public int monthsMinAverageSales(int[] monthlySales) {
        StatsService service = new StatsService();
        int minAvergesale = service.averageMonthlySales(monthlySales);
        int count = 0;
        for (int i = 0; i < monthlySales.length; i++) {
            if (monthlySales[i] < minAvergesale) {
                count++;
            }
        }
        return count;
    }

    public int monthsMaxAverageSales(int[] monthlySales) {
        StatsService service = new StatsService();
        int maxAvergeSale = service.averageMonthlySales(monthlySales);
        int count = 0;
        for (int i = 0; i < monthlySales.length; i++) {
            if (monthlySales[i] > maxAvergeSale) {
                count++;
            }
        }
        return count;
    }
}
