// https://leetcode.com/problems/meeting-rooms-ii

class Solution {
    public int minMeetingRooms(int[][] intervals) {
        if(intervals.length == 0) return 0;
        
        // Min heap a priority queue where priority is given to
        // minimum element.
        // to find minimum number of rooms
        // only get a new room when the we have a conflict.
        
        // add length of queue and initial comaprator to make it a min           // heap.
        
        PriorityQueue<Integer> alloc = new PriorityQueue<Integer>(intervals.length, new Comparator<Integer>(){
            public int compare(Integer a, Integer b) {return a-b;}
        });
        
        // sort the array according to earliest meeting times
        Arrays.sort(intervals, new Comparator<int[]>(){
            public int compare(int[] a, int[] b) {return a[0]-b[0];}
        });
        
        alloc.add(intervals[0][1]);
        
        for(int i = 1; i < intervals.length; i++){
            // if room is no longer occupied
            // if start time of current meeting is after 
            // the end time of the one with allocated room
            // then we can just use the same room for the current
            // meeting.
            if(intervals[i][0] >= alloc.peek()) alloc.poll();
            //if not then alloc a new room.
            alloc.add(intervals[i][1]);
        }
        // size of the min-heap is the number of rooms.
        return alloc.size();
    }
}