public class StockBuyAndSell {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 3, 8, 12 };
        int size = arr.length;
        int maxProfit = stockBuyAndSell(arr, 0, size - 1);
        System.out.println(maxProfit);
    }

    public static int stockBuyAndSell(int[] arr, int start, int end) {
        if (end <= start) {
            return 0;
        }
        int profit = 0;
        for (int i = start; i < end; i++) {
            for (int j = i + 1; j <= end; j++) {
                if (arr[j] > arr[i]) {
                    int currentProfit = arr[j] - arr[i] + stockBuyAndSell(arr, start, i - 1)
                            + stockBuyAndSell(arr, j + 1, end);
                    profit = max(profit, currentProfit);
                }
            }
        }
        return profit;
    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

}
