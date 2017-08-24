package bcccp.tickets.season;

public class UsageRecordFactory implements IUsageRecordFactory {

	@Override
	public IUsageRecord make(String ticketId, long startDateTime) {
		IUsageRecord record = ticketId + startDateTime
		// obtaining value from method after method is called
		return UsageRecord;
	}


}
