package in.Dheeraj.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.Dheeraj.binding.PassengerInfo;
import in.Dheeraj.binding.TicketInfo;

@RestController
public class TicketInfoController {
	

	@PostMapping(value = "/bookTicket", produces = {"application/json"}, consumes = {"application/json"})
	public ResponseEntity<TicketInfo> bookTicket(@RequestBody PassengerInfo Info){
		TicketInfo info = new TicketInfo();
		info.setTicketId(101);
		info.setPnr("188885ffg");
		info.setTicketStatus("Ticket Booked");
		
		return new ResponseEntity<TicketInfo>(info, HttpStatus.OK);
		
		
		//Note - Even we pass a single value of PassengerInfo class from postman we will still get the same result as output.
	}
	

}
