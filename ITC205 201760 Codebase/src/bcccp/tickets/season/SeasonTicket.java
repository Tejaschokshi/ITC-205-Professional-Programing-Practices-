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
		SeasonTicket.endvalidPeriod=endvalidPeriod; //assigning some method in endvalidPeriod
		startValidPeriod.registerresponder(this);
		endvalidperiod.registeresponder(this);
		prevState= STATE.IDLE;
		setState(STATE.IDLE);
		public string getcarparkId(){                              //get method
		return carparkId;                                       //return method
		}
		public string getticketId(){                   //get method for ticket
		return ticketId;                             //return ticketId
		} 
		public long setstartvalid period(startvalidperiod){      //This code set startvalidperiod to false
		 return startvalidperiod;
		}                                                     //end of the code
		public long setendvalid period(endValidPeriod){            //this code sets the value of endvalidPeriod to false
		return endvalidPeriod;
		}                                                           //end of the code
		//TDO Implement constructor
	}

	@Override
	public String getId() {
		get.ticketId(ticketId);
		//get method that returns the ticketId
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
		get.startValidperiod(startValidperiod);//gets the value of startvalidPeriod        
		 long x=startValidperiod;              //assigns the value of startvalidPeriod into x
		if (x>0){
			int y= x;                    //if yes the value of x is assigned into y
			}
		if (x=0){
			int y=0;                  //if yes the value of y is assigned zero   
		}
		else 
		// TODO Auto-generated method stub
		return 0;                   //returns the value
	}

	@Override
	public long getEndValidPeriod() {
		get.EndValidperiod(EndValidPeriod);
		long a=EndValidPeriod;
		if (a>y){
			int b=a;
		}
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
