function confirmEnding(str, target) {
  let lastStrEl = str.split(' ')[str.split(' ').length - 1];
  console.log(lastStrEl);
  console.log(lastStrEl.search(target));
  let regex = new RegExp(target + "$", "i");
  if(lastStrEl.match(regex)){
    return true;
  } else {
    return false;
  }
  
}

confirmEnding("Open sesame", "sage");
