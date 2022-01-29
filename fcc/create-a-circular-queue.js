class CircularQueue {
  constructor(size) {

    this.queue = [];
    this.read = 0;
    this.write = 0;
    this.max = size - 1;

    while (size > 0) {
      this.queue.push(null);
      size--;
    }
  }

  print() {
    return this.queue;
  }

  isFull(){

  let count = 0;

  for (let i = 0; i < this.queue.length; i++){
    if (this.queue[i] == null){
      count++
      }
    }
  if (count > 0){
    return false;
    } 
  return true;
}

//use write pointer in enqueue method
  enqueue(item) {
    if (this.isFull()) {
      this.write = 0;
      }
    if (this.write > this.max){
      this.write = 0;
      }
    if (this.queue[this.write] == null){
      this.queue[this.write] = item;
      this.write++;
      return this.queue[this.write - 1];
      } else {
        return null;
  }
  }
            
//use read pointer in dequeue method
dequeue() {
  console.log(this.queue);
  if (this.read > this.max){
  this.read = 0;
  }
  if (this.queue[this.read] !== null){
    var result = this.queue.splice(this.read, 1, null);
    if (this.queue[this.read + 1] !== null){
      this.read++; 
      return result[0];
      } else {
    return result[0];
 }} else {
    return null;
}
}
}

