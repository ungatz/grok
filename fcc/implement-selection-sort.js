function selectionSort(array) {
  function swap(i1,i2){
    var temp = array[i1];
    array[i1] = array[i2];
    array[i2] = temp;
  }

  for(let i = 0 ; i < array.length - 1; i++){
    let min = i;
    for(let j = i+1; j < array.length; j++){
      if(array[min]>array[j]){
        min = j;
      }
    }
    swap(i,min);
    }
  console.log(array);
  return array;
  }





selectionSort([1, 4, 2, 8, 345, 123, 43, 32, 5643, 63, 123, 43, 2, 55, 1, 234, 92]);
