// Take Out Orders: [17, 8, 24]
// Dine In Orders: [12, 19, 2]
// Served Orders: [17, 8, 12, 19, 24, 2]
// To ensure Served Orders are first-come-first-serve order

function verifyOrder(takeOut, dineIn, served){
    if (served.length === 0) return true;
    if (takeOut.length && takeOut[0] === served[0]){
	return verifyOrder(takeOut.slice(1), dineIn, served.slice(1));
    } else if(dineIn.length && dineIn[0] === served[0]){
	return verifyOrder(takeOut, dineIn.slice(1), served.slice(1));
    } else {
	return false;
    }
}

let takeOut = [17, 8, 24];
let dineIn = [12, 19, 2];
let served = [8, 17, 12, 19, 2, 24];
console.log(verifyOrder(takeOut, dineIn, served));
