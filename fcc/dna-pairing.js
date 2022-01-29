function pairElement(str) {
  str = str.split('');
  let element;
  let newArr = [];
  for(let  i = 0; i < str.length; i++){
  element = str[i];
  switch(element){
    case "G":
      newArr.push([element,"C"]);
      break;
    case "C":
      newArr.push([element,"G"]);
      break;
    case "A":
      newArr.push([element,"T"]);
      break;
    case "T":
      newArr.push([element,"A"]);
      break;
  }
  }
  console.log(newArr);
  return newArr;
}

pairElement("ATCGA");
