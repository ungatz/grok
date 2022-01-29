var displayTree = tree => console.log(JSON.stringify(tree, null, 2));
function Node(value) {
  this.value = value;
  this.left = null;
  this.right = null;
}
function BinarySearchTree() {
  this.root = null;
  // Only change code below this line
  this.findMin = function(){
    if(this.root === null){
      return null;
    }
    let current = this.root;
    while(current.left){
      current = current.left;
    }
    return current.value;
  }

  this.findMax = function(){
    if(this.root === null){
      return null;
    }
    let current = this.root;
    while(current.right){
      current = current.right;
    }
    return current.value;
  }
  // Only change code above this line
}
