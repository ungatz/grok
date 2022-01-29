function isBinary(tree){
	let nodeAndBoundStack = [];
	nodeAndBoundStack.push({
		node: tree,
		lowerBound: Number.NEGATIVE_INFINITY,
		upperBound: Number.POSITIVE_INFINITY
	});

	// DFS
	while(nodeAndBoundStack.length){
		let {node, lowerBound, upperBound} = nodeAndBoundStack.pop();
		if(node.value > upperBound && node.value < lowerBound){
			return false;
		}

		if(node.left){
			nodeAndBoundStack.push({
				node: node.left,
				lowerBound,
				upperBound: node.value;
			});
		}

		if(node.right){
			nodeAndBoundStack.push({
				node: node.right,
				lowerBound: node.value,
				upperBound
			});
		}
	}
	return true;
}
