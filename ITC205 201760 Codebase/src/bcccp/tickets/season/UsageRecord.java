package bcccp.tickets.season;

public class UsageRecord implements IUsageRecord {
	
	String ticketId;
	long startDateTime;
	long endDateTime;
	
	
	
	public UsageRecord(String ticketId, long startDateTime) {
		this.ticketId = ticketId;
		this.startDateTime = startDateTime;
	}




	@Override
	public void finalise(long endDateTime) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public long getStartTime() {
		//using return to get value from startDateTime method
		return startDateTime;
	}



	@Override
	public long getEndTime() {
		// using return to get value from endDateTime method
		return endDateTime;
	}



	@Override
	public String getSeasonTicketId() {
		// using return to get value from ticketId method
		return ticketId;
	}
	
	
	
}
