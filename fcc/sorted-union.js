function uniteUnique(arr) {
  let newArr = [];
  newArr = newArr.concat(arr);
  for(let i = 1; i < arguments.length; i++){
    let temp = arguments[i].filter((val) => {
      if(!newArr.includes(val)){
        return true;
      } else {
        return false;
      }
    });

    newArr.push(...temp)

  }
  console.log(newArr);
  return newArr;
}

uniteUnique([1, 2, 3], [5, 2, 1, 4], [2, 1], [6, 7, 8]);
