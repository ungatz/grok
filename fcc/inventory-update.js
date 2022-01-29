function updateInventory(arr1, arr2) {
    var index;

    arr1.forEach(function(item1){
        arr2.forEach(function(item2){
            if(item1[1]===item2[1]){
                item1[0] = item1[0]+item2[0];
            }
        });
    });

    var newInv = [];
    var currentInv = [];

    arr2.forEach(function(item){
        newInv.push(item[1]);
    })
    arr1.forEach(function(item){
        currentInv.push(item[1]);
    })

    newInv.forEach(function(item){
        if(currentInv.indexOf(item)==-1){
            index = newInv.indexOf(item);
            arr1.push(arr2[index]);
        }
    });

    arr1.sort(function(currItem, nextItem) {
            //Ternary function to avoid using if else
                return currItem[1] > nextItem[1] ? 1 : -1;
                  });

    return arr1;
}

// Example inventory lists
var curInv = [
    [21, "Bowling Ball"],
    [2, "Dirty Sock"],
    [1, "Hair Pin"],
    [5, "Microphone"]
];

var newInv = [
    [2, "Hair Pin"],
    [3, "Half-Eaten Apple"],
    [67, "Bowling Ball"],
    [7, "Toothpaste"]
];

updateInventory(curInv, newInv);

