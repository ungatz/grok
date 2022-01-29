//////////////////////////////////////////////////////////////////////////////////////////////////////////////
// To find a duplicate integer:																																						  //
// 																																																				  //
//   1.We know the position of a node with multiple incoming pointers is a duplicate in our								  //
//   array because the nodes that pointed to it must have the same value.																	  //
// 	2.We find a node with multiple incoming pointers by finding the first node in a cycle.								  //
// 	3.We find the first node in a cycle by finding the length of the cycle and advancing									  //
//   two pointers: one starting at the head of the linked list, and the other starting ahead							  //
//   as many steps as there are nodes in the cycle. The pointers will meet at the first node in the cycle.  //
// 	4.We find the length of a cycle by remembering a position inside the cycle and counting the number of	  //
//   steps it takes to get back to that position.																													  //
// 	5.We get inside a cycle by starting at the head and walking nnn steps.																  //
// 	6.We know the head of the list is at position n+1n + 1n+1.																						  //
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
function findDuplicate(intArray) {

  const n = intArray.length - 1;

  // STEP 1: GET INSIDE A CYCLE
  // Start at position n+1 and walk n steps to
  // find a position guaranteed to be in a cycle
  let positionInCycle = n + 1;
  for (let i = 0; i < n; i++) {

    // We subtract 1 from the current position to step ahead:
    // the 2nd *position* in an array is *index* 1
    positionInCycle = intArray[positionInCycle - 1];
  }

  // STEP 2: FIND THE LENGTH OF THE CYCLE
  // Find the length of the cycle by remembering a position in the cycle
  // and counting the steps it takes to get back to that position
  const rememberedPositionInCycle = positionInCycle;
  let currentPositionInCycle = intArray[positionInCycle - 1];  // 1 step ahead
  let cycleStepCount = 1;

  while (currentPositionInCycle !== rememberedPositionInCycle) {
    currentPositionInCycle = intArray[currentPositionInCycle - 1];
    cycleStepCount += 1;
  }

  // STEP 3: FIND THE FIRST NODE OF THE CYCLE
  // Start two pointers
  //   (1) at position n+1
  //   (2) ahead of position n+1 as many steps as the cycle's length
  let pointerStart = n + 1;
  let pointerAhead = n + 1;
  for (let i = 0; i < cycleStepCount; i++) {
    pointerAhead = intArray[pointerAhead - 1];
  }

  // Advance until the pointers are in the same position
  // which is the first node in the cycle
  while (pointerStart !== pointerAhead) {
    pointerStart = intArray[pointerStart - 1];
    pointerAhead = intArray[pointerAhead - 1];
  }

  // Since there are multiple values pointing to the first node
  // in the cycle, its position is a duplicate in our array
  return pointerStart;
}
