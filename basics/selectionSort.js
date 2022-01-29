function selectionSort(list){
	for(let i = 0; i < list.length; i++){
		let currentMinIndex = i;

		for(let x = currentMinIndex + 1; x < list.length; x++){
			if(list[x] < list[currentMinIndex]) currentMinIndex = x;
		}

		if(currenMinIndex !== i){
			let oldMinValue = list[i];
			list[i] = list[currentMinIndex];
			list[currentMinIndex] = oldMinValue;
		}
	}

	return list;
}
