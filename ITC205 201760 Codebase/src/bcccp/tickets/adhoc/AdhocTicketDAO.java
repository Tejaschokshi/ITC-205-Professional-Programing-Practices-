package bcccp.tickets.adhoc;

import java.util.List;

public class AdhocTicketDAO  implements IAdhocTicketDAO  {

	private IAdhocTicketFactory factory;
	private int currentTicketNo;

	
	//This set of code implement methodsi.e. get and set method to retrieve and get value for the ticket,barcode.
	public AdhocTicketDAO(IAdhocTicketFactory factory) {
		IAdhocTicketDAO.factory= factory;
		this.setIAdhocTicketDAO(factory); //addition of this  results in invoking of another method
	}
	
		
		public String getAdhocTicketDAO(){   //get methods
			return AdhocTicketDAO;          //returns the value
			
		}
		//TODO Implement constructor
	}


          //this set of code get the ticket through get method and returns the value
	@Override
	public IAdhocTicket createTicket(String carparkId) {
		public void setIAdhocTicketDAO(carparkId);   //set method
		 get.AdhocTicketDAO(carparkId); // TODO Auto-generated method stub
		return null;  //returns null
	}


        // this set of code helps to find out the ticket by barcode and return the value
	@Override
	public IAdhocTicket findTicketByBarcode(String barcode) {
		get.AdhocTicketDAO(barcode); //get method which gets the barcode
		// TODO Auto-generated method stub
		return null;         //returns value 
	}


       //this set of code helps to list all of the tickets and return value
	@Override
	public List<IAdhocTicket> getCurrentTickets() {
		get.AdhocticketDAO(tickets);//get method that returns the all the tickets value 
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
