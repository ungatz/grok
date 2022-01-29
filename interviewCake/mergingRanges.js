function mergedRanges(ranges){
    const meetingsCopy = JSON.parse(JSON.stringify(meetings));

    // Sort by start time
    const sortedMeetings = meetingsCopy.sort((a, b) => {
	return a.startTime - b.startTime;
    });

    //Initialize mergedMeetings array with first sorted meeting.
    const mergedMeetings = [sortedMeetings[0]];

    for(let i = 0; i < sortedMeetings.length - 1; i++){
	let currentMeeting = sortedMeetings[i];
	const lastMergedMeeting = mergedMeetings[mergedMeetings.length - 1];

	// If the current meeting overlaps with the last merged meeting, use the
	// later end time of the two
	if (currentMeeting.startTime <= lastMergedMeeting.endTime) {
	    lastMergedMeeting.endTime = Math.max(lastMergedMeeting.endTime, currentMeeting.endTime);
	} else {
	    // Add the current meeting since it doesn't overlap
	    mergedMeetings.push(currentMeeting);
	}
    }
    return mergedMeetings;
}
