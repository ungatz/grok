function inFlightCinema(flightLength, movieLength){
    let movieSet = new Set();
    for(let i = 0; i < movieLength.length; i++){
	let firstMovie = movieLength[i];
	let secondMovie = flightLength - firstMovie;
	if(movieSet.has(secondMovie)) return true;
	movieSet.add(firstMovie);
    }
    return false;
}
