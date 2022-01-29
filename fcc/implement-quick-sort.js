function quickSort(array) {
  if(array.length === 1){
    return array;
  }

  const pivot = array[array.length - 1];
  const leftArr = [];
  const rightArr = [];

  for(let i = 0; i < array.length - 1; i++){
    if(array[i]<pivot){
      leftArr.push(array[i]);
    }else{
      rightArr.push(array[i]);
    }
  }

  if(leftArr.length > 0 && rightArr.length > 0){
    return[...quickSort(leftArr),pivot,...quickSort(rightArr)];
  }else if(leftArr.length > 0){
    return[...quickSort(leftArr),pivot]
  }else{
    return[pivot,...quickSort(rightArr)];
  }

  return array;
}
quickSort([1,4,2,8,345,123,43,32,5643,63,123,43,2,55,1,234,92]);