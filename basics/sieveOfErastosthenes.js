function sieve(n){
	var list = [];
	//load the list, defaulting to "true" as unmarked
	for(var i = 2; i <= n; i++){
		list[i]={index : i, value: true};
	}
	//figure out our multiplier limit
	var limit = Math.sqrt(n);
	//run over the list, starting at 2
	for(var i = 2; i <= limit; i++){
		for(var x = i + i; x <= n; x+=i){
			//set all multiples of i to false
			list[x]=false;
		}
		
	}
	//build an output array
	var out = [];
	for(var i = 2; i <= n; i++){
    //if the list value is true, push the index
		if(list[i]) out.push(i);
	}
		return out;
}
console.log(sieve(100));
