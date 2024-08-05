package in.Dheeraj.binding;

import lombok.Data;

@Data
public class TicketInfo {

	private Integer ticketId;
	
	private String pnr;
	
	private String ticketStatus;
	
	private PassengerInfo passInfo;
}
