package ua.tverdokhlib;

public class Practice {
    //Известны данные о стоимости каждого из 12 товаров. Найти общую стоимость тех
    //товаров, которые стоят дороже 1000 uah (количество таких товаров неизвестно).
    public static void main(String[] args) {
        int[] prices = {100, 1569, 5067, 456, 1200, 6500, 895, 435, 123, 7651, 999, 2000};
        System.out.println(sumPrices(prices));
    }

    public static int sumPrices(int[] prices) {
        int sum = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > 1000) {
                sum += prices[i];
            }

        }
        return sum;
    }
}
