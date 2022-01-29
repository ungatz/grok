/*
 * Find the solution with space complexity of O(1)
 * 1. Solution using Sets but space and time complexities are both O(n)
 * 2. Solution using two for loops checking each number against others
      but this gives time complexity of O(n^2) and space complexity of O(1).

	 3. Best Solution :
	     Our approach is similar to a binary search, except we divide the range of possible answers in half at each step, rather than dividing the array in half.

    1. Find the number of integers in our input array which lie within the range 1..n21..\frac{n}{2}1..2n​.
    2. Compare that to the number of possible unique integers in the same range.
    3. If the number of actual integers is greater than the number of possible integers,
		   we know there’s a duplicate in the range 1..n21..\frac{n}{2}1..2n​, so we iteratively use
			 the same approach on that range.
    4. If the number of actual integers is not greater than the number of possible integers,
		   we know there must be duplicate in the range n2+1..n\frac{n}{2} + 1..n2n​+1..n, so we 
			 iteratively use the same approach on that range.
    5. At some point, our range will contain just 1 integer, which will be our answer.

*/

function findRepeat(numbers) {

  let floor = 1;
  let ceiling = numbers.length - 1;

  while (floor < ceiling) {

    // Divide our range 1..n into an upper range and lower range
    // (such that they don't overlap)
    // lower range is floor..midpoint
    // upper range is midpoint+1..ceiling
    const midpoint = Math.floor(floor + ((ceiling - floor) / 2));
    const lowerRangeFloor = floor;
    const lowerRangeCeiling = midpoint;
    const upperRangeFloor = midpoint + 1;
    const upperRangeCeiling = ceiling;

    const distinctPossibleIntegersInLowerRange = lowerRangeCeiling - lowerRangeFloor + 1;

    // Count number of items in lower range
    let itemsInLowerRange = 0;
    numbers.forEach(item => {

      // Is it in the lower range?
      if (item >= lowerRangeFloor && item <= lowerRangeCeiling) {
        itemsInLowerRange += 1;
      }
    });

    if (itemsInLowerRange > distinctPossibleIntegersInLowerRange) {

      // There must be a duplicate in the lower range
      // so use the same approach iteratively on that range
      floor = lowerRangeFloor;
      ceiling = lowerRangeCeiling;
    } else {

      // There must be a duplicate in the upper range
      // so use the same approach iteratively on that range
      floor = upperRangeFloor;
      ceiling = upperRangeCeiling;
    }
  }

  // Floor and ceiling have converged
  // We found a number that repeats!
  return floor;
}
