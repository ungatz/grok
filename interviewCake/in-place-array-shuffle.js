// Write a function for doing an in-place ↴ shuffle of an array.

// The shuffle must be "uniform," meaning each item in the original array must have
// the same probability of ending up in each spot in the final array.

// Assume that you have a function getRandom(floor, ceiling) for getting a random integer that is >= floor and <= ceiling.

// This algorithm is also known as Fisher-Yates Shuffle or Knuths Suffle

function getRamdom(floor, ceiling){
	return Math.floor(Math.random() * (ceiling - floor + 1)) + floor; 
}

function shuffle(array){

	if(array.length <= 1) return;

	for(let indexWeChoose = 0; indexWeChoose < array.length - 1; indexWeChoose++){
		let randomIndex = getRandom(indexWeChoose, array.length - 1);
		if(indexWeChoose !== randomIndex){
			let valueWeChoose = array[indexWeChoose];
			array[indexWeChoose] = array[randomIndex];
			array[randomIndex] = valueWeChoosey;
		}
	}
}
