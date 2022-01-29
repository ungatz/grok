function pairwise(arr, arg) {
  if (arr.length === 0) return 0;
  var sum = 0;
  var indices = [];
  for(let i=0;i<arr.length;i++){
    for(let j=i+1;j<arr.length;j++){
      if(arr[i]+arr[j]===arg){
        sum += i+j;
        arr[i]=arr[j]=NaN;
      }
    }
  }
  
   console.log(sum);
  
  return sum;
}

pairwise([1, 1, 1], 2);
