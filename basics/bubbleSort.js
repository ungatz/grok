function bubbleSort(array){
	let doItAgain = false;
	let limit = array.length;
	let defaultValue = Number.POSITIVE_INFINITY;
	for(let i = 0; i < limit; i++){
		let currentValue = array[i];
		let nextValue = i + 1 < limit ? array[i + 1] : defaultValue;

		if(currentValue > nextValue){
			array[i] = nextValue;
			array[i + 1] = currentValue;
			doItAgain = true;
		}
		if(doItAgain) bubbleSort(array);
	}
}
