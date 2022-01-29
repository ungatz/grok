function destroyer(arr) {
  var args = Array.prototype.slice.call(arguments);
  return arr.filter((val) => { if(args.indexOf(val) == -1){
    return val;
  } else {
    return ;
  }});
}

console.log(destroyer([1, 2, 3, 1, 2, 3], 2, 3));