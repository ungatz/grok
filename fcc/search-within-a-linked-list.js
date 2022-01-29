function LinkedList() {
  var length = 0;
  var head = null;

  var Node = function(element){
    this.element = element;
    this.next = null;
  };

  this.size = function() {
    return length;
  };

  this.head = function(){
    return head;
  };

  this.add = function(element){
    var node = new Node(element);
    if(head === null){
        head = node;
    } else {
      var currentNode = head;

      while(currentNode.next){
        currentNode = currentNode.next;
      }

      currentNode.next = node;
    }

    length++;
  };

  this.remove = function(element){
    var currentNode = head;
    var previousNode;
    if(currentNode.element === element){
      head = currentNode.next;
    } else {
      while(currentNode.element !== element) {
        previousNode = currentNode;
        currentNode = currentNode.next;
      }

      previousNode.next = currentNode.next;
    }

    length --;
  };

  // Only change code below this line
  this.isEmpty = function(){
    if(head === null){
      return true;
    }
    return false;
  }
  this.indexOf = function(element){
    if(head === null) return -1;

    let current = head;
    let currentIndex = 0;

    while(current.next){
      if(current.element === element){
        return currentIndex;
      }
      current = current.next;
      currentIndex++;
    }
    if(current.next === null && current.element !== element){
      return -1;
    }
    return currentIndex;
    }
  

  this.elementAt = function(index){
    if(head === null) return -1;
    let i = 0;
    let current = head;
    while(i < index && current.next !== null){
      current = current.next;
      i++;
    }
    if(current.next === null){
      return undefined;
    }
    return current.element;
  }
  // Only change code above this line

}