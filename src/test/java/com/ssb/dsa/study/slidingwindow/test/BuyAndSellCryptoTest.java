package com.ssb.dsa.study.slidingwindow.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.ssb.dsa.study.slidingwindow.BuyAndSellCrypto;

class BuyAndSellCryptoTest {

	@Test
	void TestPositive() {
		BuyAndSellCrypto buyAndSellCrypto = new BuyAndSellCrypto();
		assertEquals(6, buyAndSellCrypto.maxProfit(new int[] {10,1,5,6,7,1}));
	}
	
	@Test
	void TestPositive2() {
		BuyAndSellCrypto buyAndSellCrypto = new BuyAndSellCrypto();
		assertEquals(0, buyAndSellCrypto.maxProfit(new int[] {10,8,7,5,2}));
	}
}
