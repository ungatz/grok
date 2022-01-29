var displayTree = tree => console.log(JSON.stringify(tree, null, 2));
function Node(value) {
  this.value = value;
  this.left = null;
  this.right = null;
}
function BinarySearchTree() {
  this.root = null;
  // Only change code below this line
  this.isPresent = function(element){
    
    if(this.root === null){
      return false;
    }

    let current = this.root;

    while(current){
      if(element == current.value) return true;
      if(current.right && element > current.value){
        current = current.right;
      }else{
        current = current.left;
      }
    }
    return false;
  }
  // Only change code above this line
}
