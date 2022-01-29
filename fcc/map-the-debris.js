function orbitalPeriod(arr) {
  let GM = 398600.4418;
  let earthRadius = 6367.4447;
  let a = 2 * Math.PI;
  let newArr = [];
  let getOrbPeriod = function(obj) {
    let c = Math.pow(earthRadius + obj.avgAlt, 3);
    let b = Math.sqrt(c / GM);
    let orbitalPeriod = Math.round(a*b);
    return {name: obj.name , orbitalPeriod: orbitalPeriod}
  }
  for(let element in arr){
    newArr.push(getOrbPeriod(arr[element]));
  }
  return newArr;
}

orbitalPeriod([{name : "sputnik", avgAlt : 35873.5553}]);
