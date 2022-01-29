function productOfAllExceptAtIndex(numbers){
	let productOfAllExceptAtIndex = [];
	let product = 1;
	for(let i = 0; i < numbers.length; i++){
		productOfAllExceptAtIndex[i] = product;
		product *= numbers[i];
	}
	product = 1;
	for(let i = numbers.length - 1; i >= 0; i--){
		productOfAllExceptAtIndex[i] *= product;
		product *= numbers[i];
	}
	return productOfAllExceptAtIndex;
}


console.log(productOfAllExceptAtIndex([2, 4, 10]));
