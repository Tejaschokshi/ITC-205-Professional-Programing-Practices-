package bcccp.tickets.adhoc;

import java.util.List;

public class AdhocTicketDAO  implements IAdhocTicketDAO  {

	private IAdhocTicketFactory factory;
	private int currentTicketNo;

	
	
	public AdhocTicketDAO(IAdhocTicketFactory factory) {
		IAdhocTicketDAO.factory= factory;
		this.setIAdhocTicketDAO(factory); //addition of this  results in invoking of another method
	}
	
		
		public String getAdhocTicketDAO(){   //get methods
			return AdhocTicketDAO;          //returns the value
			
		}
		//TODO Implement constructor
	}



	@Override
	public IAdhocTicket createTicket(String carparkId) {
		public void setIAdhocTicketDAO(carparkId);   //set method
		 get.AdhocTicketDAO(carparkId); // TODO Auto-generated method stub
		return null;  //returns null
	}



	@Override
	public IAdhocTicket findTicketByBarcode(String barcode) {
		get.AdhocTicketDAO(barcode); //get method which gets the barcode
		// TODO Auto-generated method stub
		return null;         //returns value 
	}



	@Override
	public List<IAdhocTicket> getCurrentTickets() {
		get.AdhocticketDAO(tickets);//get method that returns the all the tickets value 
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
