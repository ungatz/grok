///////////////////////////////////////////////////////////////////////////////////////
// If only recursion is used we get O(2^n) time complexity which is horrible.				 //
// and If we mnemonize the problem to reduce time and number of calculations				 //
// we still have'nt made much improvment . So instead iterative bottom-up approach 	 //
// is best as it gives O(n) time complexity and O(1) in space. 											 //
// function getFibonacci(num){																											 //
// 	if(num == 1 || num == 0) return num;																						 //
// 																																									 //
// 	// To avoid repeating calculations and save time.																 //
// 	let doneCalcs = {};																															 //
// 	if(doneCalcs.hasOwnProperty(num)) return doneCalcs[num];												 //
// 																																									 //
// 	const result = getFibonacci(num - 1) + getFibonacci(num - 2);										 //
// 																																									 //
// 	doneCalcs[num] = result;																												 //
// 																																									 //
// 	return result;																																	 //
// }																																								 //
///////////////////////////////////////////////////////////////////////////////////////

function getFib(num) {

	if(num === 0 || num === 1) return num;

	let prevPrev = 0;
	let prev = 1;
	let fib;
	for(let i = 0; i < num; i++){
		fib = prev + prevPrev;
		prevPrev = prev;
		prev = fib;
	}

	return fib;
}
