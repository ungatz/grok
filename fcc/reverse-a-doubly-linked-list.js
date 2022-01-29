var Node = function(data, prev) {
  this.data = data;
  this.prev = prev;
  this.next = null;
};
var DoublyLinkedList = function() {
  this.head = null;
  this.tail = null;
  // Only change code below this line
  this.add = function(element){
    let newNode = new Node(element,this.tail);
    let currentNode = this.head;
    if(this.head === null){
      this.head = newNode;
      this.tail = newNode;
    } else {
      while(currentNode.next){
        currentNode = currentNode.next;
      }
      newNode.prev = currentNode;
      currentNode.next = newNode;
      this.tail = newNode;
    }
  }

  this.reverse = function(){
    var temp = null;
    let currentNode = this.head;
    if(this.head === null){
      return null;
    } else {
      this.tail = currentNode;
      while(currentNode){
        temp = currentNode.prev;
        currentNode.prev = currentNode.next;
        currentNode.next = temp;
        currentNode = currentNode.prev;
      }
      if(temp != null){
        this.head = temp.prev;
      }
    }
  }
  // Only change code above this line
};
let dlr = new DoublyLinkedList();
dlr.add('a');
dlr.add('2');
dlr.add('5');
dlr.reverse();
console.log(dlr);
