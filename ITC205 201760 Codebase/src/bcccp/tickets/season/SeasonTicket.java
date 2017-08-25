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
			int y= x; 
			return 0;//if yes the value of x is assigned into y
			}
		if (x=0){
			int y=0; 
			return 0;//if yes the value of y is assigned zero   
		}
		else 
		// TODO Auto-generated method stub
		return 0;                   //returns the value
	}

	@Override
	public long getEndValidPeriod() {
		get.EndValidperiod(EndValidPeriod); //gets the value of endvalidPeriod
		long a=EndValidPeriod;           //creates a variable a and assign the value of endvalid period into a
		if (a>y){              
			int b=a; 
			return 0;//if statement if yes a new varaible b is created and value of a is assigned into it
		}
		if (a<y){
			int b=0; 
			return 0;//if statement if yes a new variable b is created and value of b made zero.
		}
		// TODO Auto-generated method stub
		return 0;              //returns the value
	}

	@Override
	public boolean inUse() {                   //start of the code
		get.startValidPeriod(startvalidperiod);        //gets the value of startvalidperiod
		get.EndValidPeriod(EndValidPeriod);                //gets the value of endvalidperiod
		if (EndValidPeriod>startvalidPeriod){               //if statement
			boolean inuse=true;                    //if true assing the value of inuse to true
			
		 }
		if (startValidperiod=EndValidPeriod){
			boolean inuse=false;                      //if true assign the value of inuse to false
		}
		if (Endvalidperiod<StartvalidPeriod){
			boolean inuse=false;          //if true assign the value of inuse to false
		}
		// TODO Auto-generated method stub
		return false;                  //returns false if nothing matches
	}                              //end of the program

	@Override
	import java.util.SimpleDateformat; 
	
	public void recordUsage(IUsageRecord record) {
		get.ticketId(ticketid);           //get method to get ticket Id
		get.CarparkId(carparkid);           //get method to get carparkId
		get.startValidTime(startValidTime);       //get method to get startvalidTime
		get.Endvalidtime(EndValidTime);            //get method to get end validValidTime
		
		this.ticketId=id;
		this.enter_time=new Date();
		System.out.println("ID: "+this.ticketId+" Enter time: "+this.enter_time); //prints the time the car entered
		
		SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");    //assign current time in sdf
	     long usage=sdf-startValidPeriod;                           //creates a variable usage and addign some value into it
	return usage;                                //returns the value
	                                        
	        
					   }// TODO Auto-generated method stub
		
	}

	@Override
	public IUsageRecord getCurrentUsageRecord() {
		get.ticketid(ticketid);
		get.CarparkId(CarparkId);
		get.StartValidTime(startValidTime);
		get.EndValidTime(EndValidTime);
		this.ticketId=Id;
		this.enter_time=new date();
		System.out.Println("Id: "+this.TicketId+"Enter time: "+this.enter_time);
		
		simpleDataFormat sdf=new simpleDateFormat("HH:mm:ss");
		long currentusage=sdf-startvalidperiod;
		
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
