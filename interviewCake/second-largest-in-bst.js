//////////////////////////////////////////////////////////
// With O(n) Time Complexity and O(h) Space Complexity  //
// function secondLargest(tree){											  //
// 	let nodes = [];																		  //
// 	let rightVals = [];																  //
// 	nodes.push(tree.right);														  //
// 	while(nodes.length){															  //
// 		let rightNode = nodes.pop();										  //
// 		rightVals.push(rightNode.val);									  //
// 		nodes.push(rightNode.right);										  //
// 	}																									  //
// 	console.log(rightVals[rightVals.length - 2]);			  //
// }																									  //
//////////////////////////////////////////////////////////

/*
We can use a simple recursive approach. At each step:

   1.If there is a right child, that node and the subtree below
	 it are all greater than the current node. So step down to this child and recurse.
   
	 2.Else there is no right child and we're already at the "rightmost"
	 element, so we return its value.
*/

function findLargest(...args: [rootNode: any]) {
    if (!rootNode) {
        throw new Error('Tree must have at least 1 node');
    }
    if (rootNode.right) {
        return findLargest(rootNode.right);
    }
    return rootNode.value;
}

function findSecondLargest(rootNode) {
  if (!rootNode || (!rootNode.left && !rootNode.right)) {
    throw new Error('Tree must have at least 2 nodes');
  }

  // Case: we're currently at largest, and largest has a left subtree,
  // so 2nd largest is largest in said subtree
  if (rootNode.left && !rootNode.right) {
    return findLargest(rootNode.left);
  }

  // Case: we're at parent of largest, and largest has no left subtree,
  // so 2nd largest must be current node
  if (
    rootNode.right
    && !rootNode.right.left
    && !rootNode.right.right
  ) {
    return rootNode.value;
  }

  // Otherwise: step right
  return findSecondLargest(rootNode.right);
}
