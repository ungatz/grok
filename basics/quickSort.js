function quickSort(list){
	let pivot = list.length - 1;
	let pivotValue = list[pivot];
	let left = [];
	let right = [];
	list = list.slice(0, pivot).concat(list.slice(pivot + 1));

	for(let i = 0; i < list.length; i++){
		if(list[i] < pivot){
			left.push(list[i]);
		} else {
			right.push(list[i]);
		}
	}

	return quickSort(left).concat([pivotValue], quickSort(right));
}
