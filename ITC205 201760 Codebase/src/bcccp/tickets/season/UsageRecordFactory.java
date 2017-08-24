package bcccp.tickets.season;

public class UsageRecordFactory implements IUsageRecordFactory {

	@Override
	public IUsageRecord make(String ticketId, long startDateTime) {
		IUsageRecord record = ticketId + startDateTime //Calculating result to return record value
		// obtaining value from method after method is called
		return UsageRecord;
	}


}
