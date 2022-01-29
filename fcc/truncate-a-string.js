function truncateString(str, num) {
  if(str.length > num){
    let newStr = "";
    let i = 0;
    while(i < num){
      newStr += str[i];
      i++;
    }
    console.log(newStr);
    return newStr+"...";
  } else {
    return str;
  }
}

truncateString("A-tisket a-tasket A green and yellow basket", 8);
