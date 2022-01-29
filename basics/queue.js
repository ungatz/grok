class Queue {
	constructor {
		this.queue = [];
	}

	enqueue(element){
		return this.queue.push(element);
	}

	dequeue() {
	  return this.queue.shift();
	}

	isEmpty(){
		return this.queue.length === 0;
	}

	front(){
		return this.queue[0];
	}
}
