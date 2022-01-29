//If we're making all permutations for "cat," we take all permutations for
// "ca" and then put "t" in each possible position
// in each of those permutations. We use this approach recursively: 
function stringPermutation(string){
	if(string.length < 1) return new Set([string]);

	const allCharactersExceptLast = string.slice(0, -1);
	const lastChar = string[string.length - 1];

	const permutationOfAllCharsExceptLast = stringPermutation(allCharactersExceptLast);

	const permutations = new Set();
	permutationOfAllCharsExceptLast.forEach(permutationOfAllCharsExceptLast => {
		for (let position = 0; position <= allCharsExceptLast.length; position++) {
      const permutation = permutationOfAllCharsExceptLast.slice(0, position) + lastChar + permutationOfAllCharsExceptLast.slice(position);
      permutations.add(permutation);
    }
	});
	return permutations;
}
