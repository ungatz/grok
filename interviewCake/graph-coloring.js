class GraphNode {
  constructor(label) {
    this.label = label;
    this.neighbors = new Set();
    this.color = null;
  }
}

const a = new GraphNode('a');
const b = new GraphNode('b');
const c = new GraphNode('c');

a.neighbors.add(b);
b.neighbors.add(a);
c.neighbors.add(b);
b.neighbors.add(c);

const graph = [a, b, c];

function graphColoring(graph, colors){
	graph.forEach(node => {
		if(node.neighbors.has(node)){
			throw new Error("Legal coloring not possible in loopy graphs");
		}

		let illegalColors = new Set();

		node.forEach(color => {
			if(node.neighbors.has(color)){
				illegalColors.add(color);
			}
		});
		for(let i = 0; i < colors.lenght; i++){
			color = colors[i];
			if(!illegalColors.has(color)){
				node.color = color;
				break;
			}
		}
	});
}
