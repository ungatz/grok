function getIndexToIns(arr, num) {
  arr.sort(function(a, b) {
        return a - b;
  });
  console.log(arr);
  let index ;
  if(arr[0] == num || arr.length == 0){
    index = 0;
  } else {
  for(let i = 0; i < arr.length; i++){
    if(num > arr[i]){
      index = i + 1;
  } else if(num == arr[i]){
    index = i;
  }
  }
  }
  return index;
}

getIndexToIns([3, 10, 5], 3);
