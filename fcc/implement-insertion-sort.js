function insertionSort(array) {
  function swap(i1,i2){
    var temp = array[i1];
    array[i1] = array[i2];
    array[i2] = temp;
  }
  
  for(let i = 0; i< array.length; i++){
    for(let j = i; j > 0; j--){
      if(array[j] < array[j-1]){
        swap(j,j-1);
      }
    }
  }
  console.log(array);
  return array;
  }

insertionSort([1, 4, 2, 8, 345, 123, 43, 32, 5643, 63, 123, 43, 2, 55, 1, 234, 92]);
