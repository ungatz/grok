/*
One tip: Remember that breadth-first uses a queue ↴ and depth-first uses a stack ↴ (could be the call stack or an actual stack object). That's not just a clue about implementation, it also helps with figuring out the differences in behavior. Those differences come from whether we visit nodes in the order we see them (first in, first out) or we visit the last-seen node first (last in, first out).
*/
class BinaryTreeNode {
  constructor(value) {
    this.value = value;
    this.left = null;
    this.right = null;
  }

  insertLeft(value) {
    this.left = new BinaryTreeNode(value);
    return this.left;
  }

  insertRight(value) {
    this.right = new BinaryTreeNode(value);
    return this.right;
  }
}

function isSuperBalanced(binaryTree){
	if(!binaryTree){
		return true;
	}

	const depths = [];
	const nodes = [];
	nodes.push(binaryTree, 0);

	while(nodes.length){
		let nodePair = nodes.pop();
		let node = nodePair[0];
		let depth = nodePair[1];

		if(!node.left && !node.right){
			if(depths.indexOf(depth) < 0){
				depths.push(depth);
				if(depths.length < 2 || (depths.length === 2 && Math.abs(depths[0] - depths[1] > 1)){
					return false;
				}
			}
		} else {
			if(node.left){
				nodes.push(node.left, depth+1);
			}
			if(node.right){
				nodes.push(node.right, depth+1);
			}
		}
		}

		return true;
	}
}
