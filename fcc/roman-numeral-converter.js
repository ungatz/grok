function convertToRoman(num) {
    let decimalValue = [1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1];
    let romanNumeral = ["M",
                    "CM",
                    "D",
                    "CD",
                    "C",
                    "XC",
                    "L",
                    "XL",
                    "X",
                    "IX",
                    "V",
                    "IV",
                    "I"]
    
    let roman = '';
    for (var index = 0; index < decimalValue.length; index++){
        while (decimalValue[index] <= num) {
            roman += romanNumeral[index];
            num -= decimalValue[index];
        }
    }
    console.log(roman);
    return roman;

}

convertToRoman(36);
