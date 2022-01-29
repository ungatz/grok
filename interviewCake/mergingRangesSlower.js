function mergedRanges(ranges){
    let mergedRanges = [];
    let range = {};
    for(let i = 0 ; i < ranges.length; i++){
	for(let j = i+1; j < ranges.length; j++){
	    let first;
	    if(ranges[j].startTime > ranges[i].startTime) first = ranges[i];
	    else first = ranges[j];
	    let second = first == ranges[i] ? ranges[j] : ranges[i];
	    if(first.endTime >= second.startTime){
		range.startTime = first.startTime;
		range.endTime = second.endTime;
		mergedRanges.push(range);
		range = {};
	    }
	}
    }
    return mergedRanges;
}

let ranges = [
  { startTime: 0,  endTime: 1 },
  { startTime: 3,  endTime: 5 },
  { startTime: 4,  endTime: 8 },
  { startTime: 10, endTime: 12 },
  { startTime: 9,  endTime: 10 },
];

console.log(mergedRanges(ranges));
