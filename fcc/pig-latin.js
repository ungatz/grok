function translatePigLatin(str) {
  let consonentRegex = /^[^aeiou]+/;
  let consonants = str.match(consonentRegex);

  return consonants !== null ? str.replace(consonentRegex,"").concat(consonants).concat("ay") : str.concat("way");
}

console.log(translatePigLatin("consonant")
);