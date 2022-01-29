function addTogether() {
  let checkNum = function(num){
    if(typeof num !== "number"){
      return undefined;
    } else {
      return num;
    }
  };

  if(arguments.length > 1){
    let a = checkNum(arguments[0]);
    let b = checkNum(arguments[1]);
    if (a === undefined || b === undefined){
      return undefined;
    } else {
      return a+b;
    }
  } else {
    let c = arguments[0];
    if(checkNum(c)){
      return function(arg){
        if (c === undefined || checkNum(arg) === undefined){
          return undefined;
        } else {
          return c + arg;
        }
      };
    }
  }

  
}

addTogether(2,3);
