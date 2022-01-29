function bubbleSort(array) {
  function swap(indexA,indexB){
    var tem = array[indexA];
    array[indexA] = array[indexB];
    array[indexB] = tem;
  }
  
  
  for(let i =0; i < array.length; i++){
    for(let j = i+1; j < array.length; j++){
      if(array[i]>array[j]){
        swap(i,j);
      }
    }
  }
  console.log(array)
  return array;
  // Only change code above this line
}

bubbleSort([1, 4, 2, 8, 345, 123, 43, 32, 5643, 63, 123, 43, 2, 55, 1, 234, 92]);
