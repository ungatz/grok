class Stack {
  constructor(){
    this.collection = [];
  }
  push(element){
    return this.collection.push(element);
  }
  pop(){
    return this.collection.pop();
  }
  peek(){
    return this.collection[this.collection.length - 1];
  }
  isEmpty(){
    return this.collection.length === 0;
  }  
  clear(){
    return (this.collection.length = 0);
  }
}
