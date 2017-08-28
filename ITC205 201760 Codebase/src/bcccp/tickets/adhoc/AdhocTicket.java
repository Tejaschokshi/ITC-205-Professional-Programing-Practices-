package bcccp.tickets.adhoc;

import java.util.Date;

public class AdhocTicket implements IAdhocTicket {
	
	private String carparkId;
	private int ticketNo;
	private long entryDateTime;
	private long paidDateTime;
	private long exitDateTime;
	private float charge;
	private String barcode;

	
	
	public AdhocTicket(String carparkId, int ticketNo, String barcode) {
		//TDO Implement constructor
		//This set of code helps with the implementation of the constructor
		AdhocTicket {
            carparkId= “tycar”;
           ticketNo= 2;
           barcode= “023ty”


	}


	@Override
	public int getTicketNo() {
		// TODO Auto-generated method stub
		//This sets of code gets the number of tickets
		AdhocTicket t= new AdhocTicket (ticketNo);
		return 0;
	}


	@Override
	public String getBarcode() {
		// TODO Auto-generated method stub
		// This set of code gets the barcode
		AdhocTicket bcode= new AdhocTicket (barcode);
		return null;
	}


	@Override
	public String getCarparkId() {
		// TODO Auto-generated method stub
		// This set of code gets the car park Id
		AdhocTicket id= new AdhocTicket (carparkId);
		return null;
	}


	@Override
	public void enter(long dateTime) {
		// TODO Auto-generated method stub
		//This constructor initializes the object with the current date and time.
		             dateTime= newTime;
		return null;
		
		
	}


	@Override
	public long getEntryDateTime() {
		// TODO Auto-generated method stub
		// This set of code returns the value of entry date and time
		return  entryDateTime;
		
	}


	@Override
	public boolean isCurrent() {
		// TODO Auto-generated method stub
		//This set of code returns the value as false
		isCurrent= NewTime;
		return false;
	}


	@Override
	public void pay(long dateTime, float charge) {
		// TODO Auto-generated method stub
		// This set of code initializes the object with current time
		dateTime=NewTime;
		// This set of code initializes the object with the charges for parking
		charge= NewCharge;
		

		
	}


	@Override
	public long getPaidDateTime() {
		// TODO Auto-generated method stub
		// this set of code uses a method to return the value 
		return paidDateTime;;
	}


	@Override
	public boolean isPaid() {
		// TODO Auto-generated method stub
		// this set of code initializes the object with a newpay
		isPaid= newPay;
		return false;
	}


	@Override
	public float getCharge() {
		// TODO Auto-generated method stub
		// This set of code uses a method to assign return a value
		return charge;
	}


	@Override
	public void exit(long dateTime) {
		// TODO Auto-generated method stub
		// This set of code uses a method to assign return a value
		return  exitDateTime;
		
	}


	@Override
	public long getExitDateTime() {
		// TODO Auto-generated method stub
		// this set of code uses a method to assign return a value
		return exitDateTime;
	}


	@Override
	public boolean hasExited() {
		// TODO Auto-generated method stub
		return false;
	}

	
	
}
