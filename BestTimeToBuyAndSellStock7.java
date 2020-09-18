package com.apex.session.advanced.assignment;

public class BestTimeToBuyAndSellStock7 {

	public static void main(String[] args) {
		int[] stock = { 7, 1, 5, 8, 3, 6, 4 };

		System.out.println(bestTimeI(stock));
		System.out.println(bestTimeII(stock));
	}	

	private static int bestTimeI(int[] stock) {
		int minprice = Integer.MAX_VALUE;
		int maxprofit = 0;
		for (int i = 0; i < stock.length; i++) {
			
			if(stock[i] < minprice)
				minprice=stock[i];
			if(stock[i] - minprice > maxprofit)
				maxprofit=stock[i]-minprice;
		}
		
		return maxprofit;
	}
	
	private static int  bestTimeII(int[] stock) {
		int minprice = Integer.MAX_VALUE;
		int maxprofit = 0;
		
		for (int i = 1; i < stock.length; i++) {			
			if(stock[i] > stock[i-1])
				maxprofit+=stock[i] - stock[i-1];		
		}		
		
		return maxprofit;
	}

}
