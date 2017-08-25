package bcccp.tickets.adhoc;

public class AdhocTicketFactory implements IAdhocTicketFactory {

	@Override
	public IAdhocTicket make(String carparkId, int ticketNo) {
		//implementing constructor
		AdhocTicket adhocTicket= new AdhocTicket(carparkId,ticketNo," ");
		// calling result from method after implementation
		return AdhocTicket;
	}


}
