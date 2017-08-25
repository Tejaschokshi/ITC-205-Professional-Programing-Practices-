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
		int x=get.adhocTicketDAO(carparkID);
		long y=get.adhocTicketDAO(date time);
		int i=0;
		if (IAdhocTicket[i]=(barcode){
			return null;
		}
		    else { i=i+1;
			 }
			    
		
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public List<IAdhocTicket> getCurrentTickets() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
