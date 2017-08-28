package bcccp.tickets.season;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SeasonTicket implements ISeasonTicket { //start of this code
	
	private List<IUsageRecord> usages;         //assign an array
	private IUsageRecord currentUsage = null; //create a variable and assign its value to null
	
	private String ticketId;                //create a variable named ticketId
	private String carparkId;               //create a variable named carparkId
	private long startValidPeriod;            //create a variable named startvalidPeriod
	private long endValidPeriod;             //create a variable named endvalidperiod
	//This set of codeimplements a constructor by different stages either through assigning or creating new variables
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
	
          //This set of code gets the ticketId and returns the ticket
	@Override
	public String getId() {
		get.ticketId(ticketId);
		//get method that returns the ticketId
		// TODO Auto-generated method stub
		return null;
	}
	
             //This set of code gets the carparkId and return its value
	@Override
	public String getCarparkId() {
		get.carparkId(CarparkId); //get method that returns the carparkId
		// TODO Auto-generated method stub
		return null;
	}
          //this set of code gets the startvalid period of the customer 
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
             //this set of code gets the end valid period of the costomer
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
 
	//this set of code checks whether the ticket is in use or not and returns either true or false
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
         //this set of code gets records of the tickets
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
           
       
           //this set of code gets all the current records of the ticket
	@Override
        import java.util.SimpleDateformat;

	public IUsageRecord getCurrentUsageRecord() {  //start of the code
		get.ticketid(ticketid);    //gets the value of ticketId
		get.CarparkId(CarparkId);    //gets the value of carparkID
		get.StartValidTime(startValidTime);    //gets the value of startvalidtime
		get.EndValidTime(EndValidTime);           //gets the value of endvalidtime
		this.ticketId=Id;                
		this.enter_time=new date();
		System.out.Println("Id: "+this.TicketId+"Enter time: "+this.enter_time);
		
		simpleDataFormat sdf=new simpleDateFormat("HH:mm:ss");      //assign current time to sdf to get the current usage
		long currentusage=sdf-startvalidperiod;       //current usage is found through this equation
		
		// TODO Auto-generated method stub
		return null;
	}                //end of the code

          //This set of code checks the endperiod of the ticket
	@Override
	public void endUsage(long dateTime) {          //start of the code
		get.ticketid(ticketid);             //get method to get the value of ticketId
		get.CarparkId(CarparkId);               //get method to get the value of carparkID
		get.StartValidTime(startValidTime);      //get method to get the vale of startValidtime
		get.EndValidTime(EndValidTime);            //get method to get the value of endValidtime
		this.ticketId=Id;                
		this.enter_time=new date();
		System.out.Println("Id: "+this.TicketId+"Enter time: "+this.enter_time);
	
		long endusage=dateTime-starvalidTime;     //new variable is created and the result of the
		                                               //mathematical equation is assigned to it 
		if (endusage>0){
			return endusage;                 //if statement if true returns thevalue
			                                 //return value
		       
		}
		if (endusage<0){                             //if statement for the endusage
			endusage=endValidTime-startvalidtime;    //calculate this equation if true
			return Endusage;              //returns the value
		}
      
		// TODO Auto-generated method stub
		
	}

        //This set of code lists all the records
	@Override
	public List<IUsageRecord> getUsageRecords() {
		get.ticketid(ticketid);             //get method to get the value of ticketId
		get.CarparkId(CarparkId);               //get method to get the value of carparkID
		get.StartValidTime(startValidTime);      //get method to get the vale of startValidtime
		get.EndValidTime(EndValidTime);            //get method to get the value of endValidtime
		this.ticketId=Id;                
		this.enter_time=new date();
		
		long endusage=dateTime-starvalidTime;     //new variable is created and the result of the
		                                               //mathematical equation is assigned to it 
		if (endusage>0){
			                //if statement if true returns thevalue
			                                 
		       
		}
		if (endusage<0){                             //if statement for the endusage
			endusage=endValidTime-startvalidtime;    //calculate this equation if true
			              
		}
		int  []endusage= get.usage(usage);        //creates an array named endusage and assign some alue in it.
		           
		int i=length.endusage;                    //creates an variable i and assign some value in it
		int a=0;                                    //creates an variable and assign value zero in it.
		if (a>=0;a++){
			system.out.println("the enduasge are";endusage[a]);          //prints some value
		
		}
		return null;          //returns the value

}
