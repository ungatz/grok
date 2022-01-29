function permAlone(str) {
// Create a regex to match repeated consecutive characters.
var regex = /(.)\1+/;
// Split the string into an array of characters.
var arr = str.split("");
var permutations = [];
var tmp;

// Return 0 if str contains same character.
if (str.match(regex) !== null && str.match(regex)[0] === str) return 0;

// Function to swap variables' content.
function swap(index1, index2) {
  tmp = arr[index1];
  arr[index1] = arr[index2];
  arr[index2] = tmp;
}

// Generate arrays of permutations using the algorithm.
function generate(int) {
if (int === 1) {
 permutations.push(arr.join(""));
} else {
  for (var i = 0; i != int; ++i) {
      generate(int - 1);
      swap(int % 2 ? 0 : i, int - 1);
}
}
}
generate(arr.length);

 // Filter the array of repeated permutations.
var filtered = permutations.filter(function(string) {
return !string.match(regex);
});
 return filtered.length;
  }
permAlone("aab");
