class Node {
	constructor(value){
		this.value = value;
		this.prev = null;
		this.next = null;
	}
}

class DoublyLinkedList {
	constructor(){
		this.head = null;
		this.tail = null;
	}
	
	add(value){
		let node = new Node(value);

		if(!this.head){
			this.head = node;
			this.tail = node;
		} else {
			this.tail.next = node;
			node.prev = this.tail;
			this.tail = node;
		}
	}

	delete(value){
		if(!this.head) {
			return throw new Error("Nothing to delete ! List is empty");
		} else if (this.head.value = value){
			if(this.head == this.tail){
				this.head = null;
				this.tail = null;
			}
			this.head = this.head.next;
			this.head.prev = null;
		} else {
			let currentNode = this.head;
			while(currentNode.value !== value){
				currentNode = currentNode.next
			}
			if(currentNode == this.tail){
				this.tail = currentNode.prev;
				this.tail.next = null;
			} else if (currentNode){
				currentNode.prev.next = currentNode.next;
				currentNode.next.prev = currentNode.prev;
			}
		}
	}
}
