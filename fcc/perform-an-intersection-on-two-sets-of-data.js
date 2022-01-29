class Set {
  constructor() {
    // This will hold the set
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
  // This method will add an element to the set
  add(element) {
    if (!this.has(element)) {
      this.dictionary[element] = true;
      this.length++;
      return true;
    }

    return false;
  }
  // This method will remove an element from a set
  remove(element) {
    if (this.has(element)) {
      delete this.dictionary[element];
      this.length--;
      return true;
    }

    return false;
  }
  // This method will return the size of the set
  size() {
    return this.length;
  }
  // This is our union method 
  union(set) {
    const newSet = new Set();
    this.values().forEach(value => {
      newSet.add(value);
    })
    set.values().forEach(value => {
      newSet.add(value);
    })

    return newSet;
  }
  
  intersection(set){
    const intSet = new Set();
    let Lset;
    let Sset;

    if(this.length > set.length){
      Lset = this;
      Sset = set;
    } else {
      Sset = this;
      Lset = set;
    }
    
    Sset.values().forEach(value => {
      if(Lset.dictionary[value])
        intSet.add(value);
    })
    return intSet;
  }
}

const set = new Set();
set.add("2");
set.add("7");
set.add("4");
const set2 = new Set();
set2.add("3");
set2.add("2");
set2.add("4");
set2.add("5");
console.log(set.intersection(set2));
