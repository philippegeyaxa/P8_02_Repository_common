package tripmaster.common.location;

import java.util.Date;
import java.util.UUID;

/**
 * Data structure containing information for a VisitedLocation
 * @see gpsUtil.location.VisitedLocation
 *
 */
public class VisitedLocationData {
	public UUID userId;
	public LocationData location;
	public Date timeVisited;

	public VisitedLocationData(UUID givenUserId, LocationData givenLocation, Date givenTimeVisited) {
		userId = givenUserId;
		location = givenLocation;
		timeVisited = givenTimeVisited;
	}
	
	public VisitedLocationData() {		
	}
}
