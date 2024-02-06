class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        buyPrice=float('inf')
        profit=0
        for price in prices:
            if price<buyPrice:
                buyPrice=price
            else:
                profit = max(profit,price-buyPrice)
        return profit
