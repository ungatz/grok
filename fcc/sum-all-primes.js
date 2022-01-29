function sumPrimes(num) {
  let res = 0;
  function getPrimes(max){
    let sieve = [];
    let i ,j;
    let primes = [];
    for(i = 2; i <= max; ++i){
      if(!sieve[i]){
        primes.push(i);
        for(j = i << 1; j <= max; j += i){
          sieve[j] = true;
        }
      }
    }
    return primes;
  }

  var primes = getPrimes(num);
  for(var p = 0; p < primes.length; p++){
    res += primes[p];
  }
  return res;
}

sumPrimes(10);
