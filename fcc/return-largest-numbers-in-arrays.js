function largestOfFour(arr) {
  let resultArr = [];
  for(let i = 0; i < arr.length; i++){
    console.log(arr[i]);
    resultArr.push(Math.max(...arr[i]));
    console.log(resultArr);
    
  }
  return resultArr;
}

largestOfFour([[4, 5, 1, 3], [13, 27, 18, 26], [32, 35, 37, 39], [1000, 1001, 857, 1]]);
