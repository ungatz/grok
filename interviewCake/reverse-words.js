const message = [ 'c', 'a', 'k', 'e', ' ',
                'p', 'o', 'u', 'n', 'd', ' ',
                's', 't', 'e', 'a', 'l' ];

function reverseWords(message){
    reverseCharacters(message, 0, message.length - 1);
    let wordStart = 0;
    for(let i = 0; i <= message.length; i++){
	if(i === message.length || message[i] === " "){
	    reverseCharacters(message, wordStart, i-1);
	    wordStart = i+1;
	}
    }
}

function reverseCharacters(message,left,right){
    while(left < right){
	const temp = message[left];
	message[left] = message[right];
	message[right] = temp;
	left++;
	right--;
    } 
}
reverseWords(message);
console.log(message.join(''));
// Prints: 'steal pound cake'
