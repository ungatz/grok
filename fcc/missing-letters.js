function fearNotLetter(str) {
  var compare = str.charCodeAt(0);
  var missing;

  str.split("").map((letter,index) => {
    if(str.charCodeAt(index) == compare){
      ++compare;
    } else {
      missing = String.fromCharCode(compare);
    }
  })
  return missing;
}

fearNotLetter("abce");
