var Person = function(firstAndLast) {
  // Only change code below this line
  // Complete the method below and implement the others similarly
  this.getFullName = function() {
    return firstAndLast;
  };
  this.getFirstName = function(){
    return firstAndLast.split(" ")[0];
  }
  this.getLastName = function(){
    return firstAndLast.split(" ")[1];
  }
  this.setFirstName = function(fname){
    firstAndLast = firstAndLast.split(" ");
    firstAndLast[0] = fname;
    firstAndLast = firstAndLast.join(" ");
  }
  this.setLastName = function(lname){
    firstAndLast = firstAndLast.split(" ");
    firstAndLast[1] = lname;
    firstAndLast = firstAndLast.join(" ");
  }
  this.setFullName = function(arg){
    arg = arg.split(" ");
    firstAndLast = firstAndLast.split(" ");
    firstAndLast[0] = arg[0];
    firstAndLast[1] = arg[1];
    firstAndLast = firstAndLast.join(" ");
  }
  
};

var bob = new Person('Bob Ross');
bob.setFirstName("Sanad");
console.log(bob.getFullName()
)