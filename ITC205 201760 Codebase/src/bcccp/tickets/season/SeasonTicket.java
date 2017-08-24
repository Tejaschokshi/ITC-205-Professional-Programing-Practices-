package bcccp.tickets.season;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SeasonTicket implements ISeasonTicket {
	
	private List<IUsageRecord> usages;
	private IUsageRecord currentUsage = null;
	
	private String ticketId;
	private String carparkId;
	private long startValidPeriod;
	private long endValidPeriod;
	
	public SeasonTicket (String ticketId, 
			             String carparkId, 
			             long startValidPeriod,
			             long endValidPeriod) {
		SeasonTicket.ticketID=ticketId;          //assigning somemethod in ticketId
		SeasonTicket.carparkID=carparkId;           //assigning some method in  carparkId
		SeasonTicket.startValidPeriod=startvalidPeriod;       //assigning somemethod in startValidPeriod
		SeasonTicket.endvalidPeriod=endvalidPeriod;          //assigning some method in endvalidPeriod
		
		public int getcarparkId(){                              //get method
		return carparkId;                                       //return method
		}
		public int getticketId(){                   //get method for ticket
		return ticketId;                             //return ticketId
		} 
		public void setstartvalid period(startvalidperiod){      //This code set startvalidperiod to false
		startvalidperiod=false;
		}                                                     //end of the code
		public void setendvalid period(endValidPeriod){            //this code sets the value of endvalidPeriod to false
		endvalidPeriod=false;
		}                                                           //end of the code
		//TDO Implement constructor
	}

	@Override
	public String getId() {
		get.carpakId(ticketId); //get method that returns the ticketId
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCarparkId() {
		get.carparkId(CarparkId); //get method that returns the carparkId
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getStartValidPeriod() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long getEndValidPeriod() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean inUse() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void recordUsage(IUsageRecord record) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IUsageRecord getCurrentUsageRecord() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void endUsage(long dateTime) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<IUsageRecord> getUsageRecords() {
		// TODO Auto-generated method stub
		return null;
	}


}
