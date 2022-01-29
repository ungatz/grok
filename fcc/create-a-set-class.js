class Set {
  constructor() {
    // Dictionary will hold the items of our set
    this.dictionary = {};
    this.length = 0;
  }

  // This method will check for the presence of an element and return true or false
  has(element) {
    return this.dictionary[element] !== undefined;
  }

  // This method will return all the values in the set
  values() {
    return Object.keys(this.dictionary);
  }

  // Only change code below this line
  add(item){
    if(!this.has(item)){
      this.dictionary[item] = true;
      this.length++;
      return true;
    }
    return false;
  }

  remove(item){
    if(this.has(item)){
      delete this.dictionary[item];
      this.length--;
      return true;
    }
    return false;
  }

  size(){
    return this.length;
  }
  // Only change code above this line
}
