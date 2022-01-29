// In computer science, a heap is a specialized tree-based data structure that satisfies the heap property described below.
// In a min heap, if P is a parent node of C, then the key (the value) of P is less than or equal to the key of C.

class BinaryHeap {
	constructor() {
		this.heap = [];
	}

	insert(value){
		this.heap.push(value);
		this.bubbleUp();
	}

	bubbleUp(){
		let index = this.heap.length;

		while(index > 0){
			let parentIndex = Math.floor((index - 1) / 2); 
			let child = this.heap[index];
			let parent = this.heap[parentIndex];
			if(parent > child) break;
			this.heap[index] = parent;
			this.heap[parentIndex] = child;
			index = parentIndex;
		}
	}
	
	extractMax(){
		let max = this.heap[0];
		this.heap[0] = this.heap.pop();
		this.sinkDown(0);
		return max;
	}

	sinkDown(index){
		let largest = index;
		let left = index * 2 + 1;
		let right = index * 2 + 2;
		let length = this.heap.length;

		if(left <= length && this.heap[left] > this.heap[largest]){
			largest = left;
		}

		if(right <= length && this.heap[right] > this.heap[largest]){
			largest = right;
		}

		if(largest !== index){
			[this.heap[largest], this.heap[index]] = [this.heap[index], this.heap[largest]];
			this.sinkDown(largest);
		}
	}
}
