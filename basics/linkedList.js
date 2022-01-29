class Node {
	constructor(value){
		this.value = value;
		this.next = null;
	}
}

class LinkedList {
	constructor(){
		this.head = null;
		this.length = 0;
	}
	
	add(value){
		let node = new Node(value);
		if(!this.head){
			this.head = node;
		} else {
			let currentNode = this.head;
			while(currentNode.next){
				currentNode = currentNode.next;
			}
			currentNode.next = node;
		}
		this.length++;
	}

	delete(value){
		if(this.head.value === value){
			this.head = null;
		} else {
			let currentNode = this.head;
			let prevNode;
			while(currentNode.value !== value){
				prevNode = currentNode;
				currentNode = currentNode.next;
			}
			prevNode.next = currentNode.next;
			currentNode.next = null;
		}
	}
}



