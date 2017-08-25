package bcccp.tickets.adhoc;

import java.util.List;

public class AdhocTicketDAO  implements IAdhocTicketDAO  {

	private IAdhocTicketFactory factory;
	private int currentTicketNo;

	

	
	public AdhocTicketDAO(IAdhocTicketFactory factory) { //start of the code
		IAdhocTicketDAO.factory= factory; 
		this.setIAdhocTicketDAO(factory); //addition of this  results in invoking of another method
	}
	
		
		public String getAdhocTicketDAO(){   //get methods
			return AdhocTicketDAO;    //returns the value

	                   //implement constructor
		}
	



	@Override
	public IAdhocTicket createTicket(String carparkId) { //start of the code 
		public void setIAdhocTicketDAO(carparkId);   
		 get.AdhocTicketDAO(carparkId);           //get method to get the ticket 
		
		return null;                        //returns the value
	}



	@Override
	public IAdhocTicket findTicketByBarcode(String barcode) {
		get.adhocTicketDAO(carparkID);
		get.adhocTicketDAO(date time);
		long barcode=AdhocTicketDAO();
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public List<IAdhocTicket> getCurrentTickets() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
