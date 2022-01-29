function findRotationPoint(words){
	let beg = 0; 
	let end = words.length - 1;
	let firstWord = words[0];
	while(beg < end){
		let mid = Math.floor(beg + ((end - beg) / 2));
		if(words[mid] >= firstWord){
			beg = mid;
		} else {
			end = mid;
		}

		if(beg + 1 === end) {
			break;
		}
	}
	console.log(end);
}
findRotationPoint(['k', 'v', 'a', 'b', 'c', 'd', 'e', 'g', 'i']);


