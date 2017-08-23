package bcccp.carpark.entry;

import bcccp.carpark.Carpark;
import bcccp.carpark.ICarSensor;
import bcccp.carpark.ICarSensorResponder;
import bcccp.carpark.ICarpark;
import bcccp.carpark.ICarparkObserver;
import bcccp.carpark.IGate;
import bcccp.tickets.adhoc.IAdhocTicket;

public class EntryController 
		implements ICarSensorResponder,
				   ICarparkObserver,
		           IEntryController {
	
	private IGate entryGate;
	private ICarSensor outsideSensor; 
	private ICarSensor insideSensor;
	private IEntryUI ui;
	
	private ICarpark carpark;
	private IAdhocTicket  adhocTicket = null;
	private long entryTime;
	private String seasonTicketId = null;
	
	

	public EntryController(Carpark carpark, IGate entryGate, 
			ICarSensor os, 
			ICarSensor is,
			IEntryUI ui) {

			// implementing the constructor			
		
	this.carpark = carpark;
	this.entryGate_ = entryGate;
	this.outsideEntrySensor_ = os;
	this.insideEntrySensor_ = is;
	this..ui = ui;

	outsideEntrySensor.registerResponder(this);
	insideEntrySensor.registerResponder(this);	
	ui.registerController(this);

	setState(STATE.IDLE);

			//TODO Implement constructor
	}



	@Override
	public void buttonPushed() {

	// implementing Auto-generated method stub

		if(state_ == STATE.WAITING) {
			if(!carpark.isFULL()) {
				adhocTicket = carpark.issueADHocTicket();
			
		String carparkID = adhocTicket.getCarparkID();
		int ticketNo= adhocTicket.getTicketNo();
		entrytime = sstem.CuurenttimeMillies();
		String barcode = adhocTicket.getBarcode();
	
		ui.printTicket(carparkId, ticketNo, entryTime, barcode);
		setState(STATE.ISSUED);
	
		}
		
		else { 
		setState(STATE.FULL);
		}
}
	else { 
		ui.beep();
		log(""buttonPushed: called while in incorrect state");
		}
		// TODO Auto-generated method stub
	
		
	}



	@Override
	public void ticketInserted(String barcode)

	 {
		
		// TODO Auto-generated method stub
		
	}



	@Override
	public void ticketTaken() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void notifyCarparkEvent() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void carEventDetected(String detectorId, boolean detected) {
		// TODO Auto-generated method stub
		
	}

	
	
}
