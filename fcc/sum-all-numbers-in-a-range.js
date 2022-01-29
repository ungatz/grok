function sumAll(arr) {
  let sumBetween = [];
  for(let i = Math.min(arr[0],arr[1]); i < Math.max(arr[0],arr[1]); i++){
    if(i !== Math.max(arr[0],arr[1]) && i !== arr[0] && i !== arr[1] && i !== Math.min(arr[0],arr[1])){
      sumBetween.push(i);
    }
  }
  console.log(sumBetween);
  let sum = sumBetween.reduce((accumulator, currentValue) => {
    return accumulator + currentValue;
  });
  console.log(sum);
  return sum + arr.reduce((arr,cur)=>{
    return arr + cur;
  })
}

sumAll([5, 10]);
