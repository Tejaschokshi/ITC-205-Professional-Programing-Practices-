package bcccp.carpark.exit;

import bcccp.carpark.Carpark;
import bcccp.carpark.ICarSensor;
import bcccp.carpark.ICarSensorResponder;
import bcccp.carpark.ICarpark;
import bcccp.carpark.IGate;
import bcccp.tickets.adhoc.IAdhocTicket;

public class ExitController 
		implements ICarSensorResponder,
		           IExitController {
	
	private IGate exitGate;
	private ICarSensor insideSensor;
	private ICarSensor outsideSensor; 
	private IExitUI ui;
	
	private ICarpark carpark;
	private IAdhocTicket  adhocTicket = null;
	private long exitTime;
	private String seasonTicketId = null;
	
	

	public ExitController(Carpark carpark, IGate exitGate, 
			ICarSensor is,
			ICarSensor os, 
			IExitUI ui) {
				os.resgisterResponder(this);
              is.resgisterResponder(this);
              ui.resgisterResponder(this);

            prevState = STATE.IDLE;
              setState( STATE.IDLE);
          
		//TODO Implement constructor
	}



	@Override
	public void ticketInserted(String ticketStr) {

		 If (state == STATE.WAITING){
              if (isADhocTicket(ticketStr)){
              adhocTicket = carpark.get.ADhocTicket(ticketStr);
              exitime = System.currentTimeMillies ();
              if (adhocTicket != null && adhocTicket.ispaid()){
                  setState (STATE.Processed );
}
              else {
                  ui.beep();
                  setState(STATE.REJECTED);
              }
                  
          }
              else if (carpark.isSeasonTicketValid(ticketStr) &&
                       carpark.isSeasonTicketInuse(ticketStr)){
                  SeasonTicket = ticketStr;
     	          setState(STATE.PROCESSED); 

}
            else {
                  ui.beep();
                  setState(STATE.REJECTED);
              }
              else {
                  ui.beep();
                      ui.discardTicket();
                   Log("ticketInserted:calledd ehile an incoorect state");
		// TODO Auto-generated method stub
		
	}



	@Override
	public void ticketTaken() {
		
			  If (state == STATE.PROCESSED) {
              exitGate.raise ();
              setState( STATE.TAKEN );
          }
	           else if (State == STATE.REJECTED ){
                   SetState(STATE.WAITING);
              }
              else {
                  ui.beep();
                       log("ticketTaken:calledd ehile an incoorect state");

		// TODO Auto-generated method stub
		
	}



	@Override
	public void carEventDetected(String detectorId, boolean detected) {
		
				
 	log("carEventDetected: " +  detectorID + ", car Detected : " + carDetected) {
 		
 switch (state) {
 	case BLOCKED;
 if (detectorId.equals.equales(is.getid() ) && !carDetected) {
 	setState(prevstate);
 	}
 	break;

case idle;
 	log ("eventDetected:IDLE");
 if (detectorId.equals(is.getID()) && !carDetected) {
 
 	log ("eventDetected: setting state to waiting");
 	setState (STATE.WAITING);
 
 }
 
 	else if (detectorId.equals(is.getID()) && !carDetected){
 	setState (STATE.BLOCKED);
 
 Break;
		case  WAITING;
 		case  PROCESSED; 
 		
 		if (detectorId.equals(outsideEntrySensor_getId() )&& !carDetected){
 	setState(STATE.IDLE);
 	}
 		else if (detectorId.equals(insideEntrySensor_getId() )&& !carDetected){ 
 		setState (STATE.BLOCKED);
 }
			
					// TODO Auto-generated method stub
		
	}

	
	
}