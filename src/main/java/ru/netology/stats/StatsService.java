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
        int sum = 0;
        int quantity = monthlySales.length;
        for (int avergeSale : monthlySales) {
            sum += avergeSale;
        }
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
        int sum = 0;
        int quantity = monthlySales.length;
        for (int avergeSale : monthlySales) {
            sum += avergeSale;
        }
        int minAvergesale = (sum / quantity);
        int count = 0;
        for (int i = 0; i < monthlySales.length; i++) {
            if (monthlySales[i] < minAvergesale) {
                count++;
            }
        }
        return count;
    }

    public int monthsMaxAverageSales(int[] monthlySales) {
        int sum = 0;
        int quantity = monthlySales.length;
        for (int avergeSale : monthlySales) {
            sum += avergeSale;
        }
        int maxAvergeSale = (sum / quantity);
        int count = 0;
        for (int i = 0; i < monthlySales.length; i++) {
            if (monthlySales[i] > maxAvergeSale) {
                count++;
            }
        }
        return count;
    }

}
