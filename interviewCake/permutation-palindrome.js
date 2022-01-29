// "civic" should return true
// "ivicc" should return true
// "civil" should return false
// "livci" should return false
/*
  BRUTEFORCE Solution with O(n!n) time complexity.
function isPalindrome(string){
    let strArray = string.split("");
    let left = 0;
    let right = strArray.length - 1;
    while(left < right){
	let temp = strArray[left];
	strArray[left] = strArray[right];
	strArray[right] = temp;
	if(strArray.join("") === string) return true;
	left++;
	right--;
    }

    if(strArray.join("") === string) return true;
    else return false;
}

function makePermutations(string){
    let strArray = string.split("");
    let i = 0;
    if(isPalindrome(strArray.join(""))) return true;
    while(i < strArray.length){
	strArray.push(strArray[0]);
	strArray.shift();
	if(isPalindrome(strArray.join(""))) return true;
	i++;
    }
    return false;
}

console.log(makePermutations("ivicc"));
// returns true
*/

// Same problem with solution in O(n) time complexity
// We're essentially checking that each character left of the middle has a corresponding copy right of the middle.
// We can simply check that each character appears an even number of times (unless there is a middle character,
// which can appear once or some other odd number of times). 
// This ensures that the characters can be ordered so that each char on the left side of the string has a
// matching char on the right side of the string. 
// We could use an object.(Tip: using an object is the most common way to get from a brute force approach
//  to something more clever. It should always be your first thought.)
function hasPalindromePermutation(theString) {

  // Track characters we've seen an odd number of times
  const unpairedCharacters = new Set();

  for (let char of theString) {
    if (unpairedCharacters.has(char)) {
      unpairedCharacters.delete(char);
    } else {
      unpairedCharacters.add(char);
    }
  }

  // The string has a palindrome permutation if it
  // has one or zero characters without a pair
  return unpairedCharacters.size <= 1;
}


console.log(hasPalindromePermutation("ivicc"))
