// https://leetcode.com/problems/maximum-units-on-a-truck

class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int unitCount = 0;
        int remainingSize = truckSize;
        while(remainingSize > 0){
            int maxUnitBoxIndex = maxUnitBox(boxTypes);
            if(maxUnitBoxIndex == -1) break;
            int boxCount = Math.min(remainingSize, boxTypes[maxUnitBoxIndex][0]);
            unitCount += boxCount*boxTypes[maxUnitBoxIndex][1];
            remainingSize -= boxCount;
            boxTypes[maxUnitBoxIndex][1] = -1;
        }
        return unitCount;
    }
    public int maxUnitBox(int[][] boxTypes){
        int max = -1;
        int maxUnit = 0;
        for(int i = 0; i < boxTypes.length; i++){
            if(boxTypes[i][1] > maxUnit){
                maxUnit = boxTypes[i][1];
                max = i;
            }
        }
        return max;
    }
}