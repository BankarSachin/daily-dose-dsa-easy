package com.ssb.dsa.study.slidingwindow;

public class BuyAndSellCrypto {

	public int maxProfit(int[] prices) {
		int maxProfit = 0;
		int buyPointer = 0;
		int sellPointer = 1;
		
		while(sellPointer < prices.length) {
			if(prices[buyPointer]>=prices[sellPointer]) { //No profit
				buyPointer = sellPointer;
				sellPointer +=1;
			}else {
				maxProfit = Math.max(prices[sellPointer]-prices[buyPointer],maxProfit);
				sellPointer +=1;
			}
		}
		return maxProfit;
	}
}