function reverseString(str) {
  let revStr = "";
  for(let i  = str.length -1 ; i >= 0; i--){
    revStr += str[i];
  }
  console.log(revStr);
  str = revStr;
  console.log(str);
  return str;
}

reverseString("hello");
