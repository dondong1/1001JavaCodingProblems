package testing;


import java.util.Scanner;

public class BestTimeToBuySellStockMinMaxArray {
	public static int maxProfit(int[] prices) {
		if(prices == null || prices.length <= 1)
			return 0;
		int min = prices[0];
		int result = 0;
		for(int i = 1; i <prices.length; i ++) {
			min = Math.min(min, prices[i]);
			result = Math.max(result, prices[i] - min);
		}
		
		return result;
	}
	// another way
	public static int maxProfit2(int[] prices) {
		int min = Integer.MAX_VALUE;
		int max = 0;
		for (int i = 0; i<prices.length; i++) {
			if(prices[i]<min) {
				min = prices[i];
			}
			else if (prices[i] - min > max) {
				max = prices[i] - min;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
	
			for (int i = 0; i<n; i++) {
				nums[i]= sc.nextInt();
				
			
			}
			System.out.println(maxProfit(nums));
			System.out.println(maxProfit2(nums));
		}

	}

