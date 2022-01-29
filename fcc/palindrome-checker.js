function palindrome(str) {
  str = str.replace(/[^0-9a-z]/gi, '').toLowerCase();
  console.log(str);
  let strRev = [];
  
  for(let i = str.length - 1; i >= 0; i--){
    strRev.push(str.split('')[i]);
  }
  strRev = strRev.join('')
  console.log(strRev);
  if(str == strRev){
    return true;
  } else {
    return false;
  }
}



palindrome("A man, a plan, a canal. Panama");
