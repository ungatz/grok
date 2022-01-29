var displayTree = tree => console.log(JSON.stringify(tree, null, 2));
function Node(value) {
  this.value = value;
  this.left = null;
  this.right = null;
}
function BinarySearchTree() {
  this.root = null;
  // Only change code below this line
  this.add = function(element){
    let current = this.root;
    if(!current){
      this.root = new Node(element);
      return undefined;
    }
    while(current){
      if(current.value < element){
        if(!current.right){
          current.right = new Node(element);
          return undefined;
        }
      current = current.right;
    }else if(current.value > element){
        if(!current.left){
          current.left = new Node(element);
          return undefined;
        }
        current = current.left;
      } else {
        return null;
      }
    }
}
}
  // Only change code above this line

