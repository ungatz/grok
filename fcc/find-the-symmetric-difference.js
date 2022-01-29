function sym(){
  var args = [];
  for(var i = 0;i<arguments.length;i++){
    args.push(arguments[i]);
  }

  function symDiff(arrayOne , arrayTwo){
    var result = [];

    arrayOne.forEach(function(item){
      if(arrayTwo.indexOf(item)<0 && result.indexOf(item)<0){
      result.push(item);
     }
    });

    arrayTwo.forEach(function(item){
      if(arrayOne.indexOf(item)<0 && result.indexOf(item)<0){
        result.push(item);
      }
    });

    return result;
  }
  return args.reduce(symDiff);
}