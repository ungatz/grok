function LinkedList() {
  var length = 0;
  var head = null;

  var Node = function(element){
    this.element = element;
    this.next = null;
  };

  this.size = function(){
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
        currentNode  = currentNode.next;
      }

      currentNode.next = node;
    }

    length++;
  };

  // Only change code below this line
  this.removeAt = function(index){
    if(index < 0 || index >= length){
      return null;
    } else {
      var curr , prev ,it = 0;
      curr = head;
      prev = curr;

      if(index === 0){
        head = curr.next;
      } else {
        while(it < index){
          it++;
          prev = curr;
          curr = curr.next;
        }
        prev.next = curr.next;
      }
      length--;
      return curr.element;
 }
    }
  // Only change code above this line
}
