const myArray = [3, 4, 6, 10, 11, 15];
const alicesArray = [1, 5, 8, 12, 14, 19, 22, 25];

function mergeArrays(arrayOne, arrayTwo){
    let mergedArray = [];
    let oneIndex = 0;
    let twoIndex = 0;
    let mergedIndex = 0;
    while(mergedIndex < arrayOne.length + arrayTwo.length){
	let oneExausted = oneIndex >= arrayOne.length;
	let twoExausted = twoIndex >= arrayTwo.length;
	if(!oneExausted && (twoExausted || arrayOne[oneIndex] < arrayTwo[twoIndex])){
	    mergedArray.push(arrayOne[oneIndex]);
	    oneIndex++;
	} else {
	    mergedArray.push(arrayTwo[twoIndex]);
	    twoIndex++;
	}
	mergedIndex++;
    }
    return mergedArray;
}

console.log(mergeArrays(myArray, alicesArray));
// logs [1, 3, 4, 5, 6, 8, 10, 11, 12, 14, 15, 19, 22, 25]
