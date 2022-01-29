function binarySearch(list, lookFor){
	let middle;
	let start = 0;
	let end = list.length - 1;

	while(start < end){
		middle = Math.floor((start + end) / 2);
		if(lookFor < list[middle]){
			end = middle - 1;
		} else if (lookFor > middle){
			first = middle + 1;
		} else if (lookFor === list[middle]){
			return middle;
		}
	}

	return new Error("No such value in list !");
}
