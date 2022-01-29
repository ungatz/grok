//no fucking loops just conditionals and recursion 
//like magic nearly.
//when i call mergeSort inside mergeSort merger() gets
//called every time.

function mergeSort(array){
  if (array.length == 1) return array; //edge condition

  let middle = Math.floor(array.length/2);
  let left = mergeSort(array.slice(0,middle));
  let right = mergeSort(array.slice(middle));
  
  return merger(left,right);
}

function merger(arr1,arr2){
  let i = 0;
  let j = 0;
  let mergedArr = [];
  
  while (i < arr1.length && j < arr2.length) {
    if(arr1[i] > arr2[j]){
      mergedArr.push(arr2[j++]);
    }else{
      mergedArr.push(arr1[i++]);
    }
    }
  while(i < arr1.length){
    mergedArr.push(arr1[i++]);
  }
  while(j < arr2.length){
    mergedArr.push(arr2[j++]);
  }
  return mergedArr;
  }


mergeSort([1, 4, 2, 8, 345, 123, 43, 32, 5643, 63, 123, 43, 2, 55, 1, 234, 92]);
