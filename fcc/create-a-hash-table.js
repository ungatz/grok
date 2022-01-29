var called = 0;
var hash = string => {
  called++;
  var hashed = 0;
  for (var i = 0; i < string.length; i++) {
    hashed += string.charCodeAt(i);
  }
  return hashed;
};
var HashTable = function() {
  this.collection = {};
  // Only change code below this line
  this.add = function(key,value){
    var hashedKey = hash(key);
    if(!this.collection.hasOwnProperty(hashedKey)){
      this.collection[hashedKey] = {};
    }
    this.collection[hashedKey][key] = value;
  }

  this.remove = function(key){
    var hashedObj = this.collection[hash(key)];
    if(hashedObj.hasOwnProperty(key)){
      delete hashedObj[key];
    }
    if(!Object.keys(hashedObj).length){
      delete this.collection[hash(key)];
    }
    
    }

  this.lookup = function(key){
    var hashedKey = hash(key);
    if(this.collection.hasOwnProperty(hashedKey)){
      return this.collection[hashedKey][key];
    }
    return null;
  }
  // Only change code above this line
};
console.log(hash("sanad"))