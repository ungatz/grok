function myReplace(str, before, after) {
  let regex = /^[A-Z]/;
  console.log(regex.test(before));
  if(regex.test(before)){
    after = after.charAt(0).toUpperCase() + after.slice(1);
  } else {
    after = after.charAt(0).toLowerCase() + after.slice(1);
  }
  return str.replace(before,after);;
}

myReplace("I think we should look up there", "up", "Down");
