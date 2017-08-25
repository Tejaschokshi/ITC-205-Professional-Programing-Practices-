package bcccp.tickets.season;

import bcccp.tickets.season.ISeasonTicket;
import bcccp.tickets.season.IUsageRecordFactory;

public class SeasonTicketDAO implements ISeasonTicketDAO {

	private IUsageRecordFactory factory;

	
	
	public SeasonTicketDAO(IUsageRecordFactory factory) {
		//Implementing constructor
		this.factory = factory;
	}



	@Override
	public void registerTicket(ISeasonTicket ticket) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void deregisterTicket(ISeasonTicket ticket) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public int getNumberOfTickets() {
		// returning value from method
		int noOfTickets = 0;
             		return noOfTickets;
	}



	@Override
	public ISeasonTicket findTicketById(String ticketId) {
		ISeasonTicket ticket;               
		return ticket;
	}



	@Override
	public void recordTicketEntry(String ticketId) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void recordTicketExit(String ticketId) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
