function smallestCommons(arr) {
  let newArr = [];
  if(arr[0] > arr[1]){
    for(let i = arr[1]; i <= arr[0]; i++){
      newArr.push(i);
    }
  } else {
    for(let j = arr[0]; j <= arr[1]; j++){
      newArr.push(j);
    }
  }

  var quot = 0;
  var loop = 1;
  var n;
   do {
     quot = newArr[0] * loop * newArr[1];
      for (n = 2; n < newArr.length; n++) {
              if (quot % newArr[n] !== 0){
                break;
              }
          }
          loop++;
     }while (n !== newArr.length);


  console.log(quot)
  return quot;
}


smallestCommons([2,10]);
