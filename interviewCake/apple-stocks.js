/* Write an efficient function that takes stockPrices and returns the best profit I could 
have made from one purchase and one sale of one share of Apple stock yesterday. */

const prices = [10, 10, 7, 5, 8, 11, 9];
// should return 6 as buy at 5 and sell at 11 provides
// 6 which is the max profit you can get.

function getMaxProfits(prices){
	let greatestPrice = getMaxPrice(prices);
	let lowestPrice = getLowestPrice(prices, greatestPrice[1]);
	console.log(greatestPrice,lowestPrice);
	return greatestPrice[0] - lowestPrice;
}

function getMaxPrice(prices){
	let greatest = prices[0];
	let index = 0;
	for(let i = 0; i < prices.length; i++){
		if(prices[i] > greatest){
			index = i;
			greatest = prices[i];
		}
	}
		return [greatest, index];
}

	function getLowestPrice(prices, index){
	let lowest = prices[0];
	for(let i = 0; i < index; i++){
		if(prices[i] < lowest) lowest = prices[i];
	}
	return lowest;
	}
	
console.log(getMaxProfits(prices));

