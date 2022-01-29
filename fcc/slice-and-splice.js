function frankenSplice(arr1, arr2, n) {
  let afterArr = arr2.slice(n);
  let beforeArr = arr2.slice(0,n);
  console.log(beforeArr);
  console.log(afterArr);
  let i = 0;
  let j = 0;
  while(j < arr1.length){
    beforeArr.push(arr1[j]);
    j++;
  }
  while(i < afterArr.length){
  beforeArr.push(afterArr[i]);
  i++;
  }
  console.log(beforeArr);
  return beforeArr;
}

frankenSplice([1, 2], ["a","b"], 1);
