function LinkedList() {
  var length = 0;
  var head = null;

  var Node = function(element) {
    this.element = element;
    this.next = null;
  };

  this.size = function() {
    return length;
  };

  this.head = function() {
    return head;
  };

  this.add = function(element) {
    var node = new Node(element);
    if (head === null) {
      head = node;
    } else {
      var currentNode = head;

      while (currentNode.next) {
        currentNode = currentNode.next;
      }

      currentNode.next = node;
    }
    length++;
  };

  // Only change code below this line
  this.addAt = function(index,element){
    if(index < 0 || index > length){
      return false;
    } else {
      var newNode = new Node();
      var curr , prev;
      curr = head;
      if(index === 0){
        newNode = head;
        head = newNode;
      } else {
        curr = head;
        var it = 0;
        while(it < index){
          it++;
          prev = curr;
          curr = curr.next;
        }
        newNode.next = curr;
        pre.next = newNode;
      }
      length++;
    }
   
    
  }
  // Only change code above this line
}
