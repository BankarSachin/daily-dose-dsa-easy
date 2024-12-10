package com.ssb.dsa.study.slidingwindow;

/**
 * @author Sachin
 * https://neetcode.io/problems/buy-and-sell-crypto
 */
public class BuyAndSellCrypto {

	public int maxProfit(int[] prices) {
		int maxProfit = 0;
		int buyPointer = 0;
		int sellPointer = 1;
		
		if (prices == null || prices.length < 2) {
		    return 0;
		}
		
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