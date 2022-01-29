function chunkArrayInGroups(arr, size) {
  let arrTemp = [];
  for(let i = 0; i < arr.length; i += size){
    arrTemp.push(arr.slice(i,size + i));
  }
  console.log(arrTemp);
  return arrTemp;
}

chunkArrayInGroups([0, 1, 2, 3, 4, 5, 6], 3);
