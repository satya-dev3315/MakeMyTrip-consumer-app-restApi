package com.ait.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ait.binding.Passenger;
import com.ait.binding.Ticket;

@Service
public class MakeMyTripService {

	//book ticket-get passenger data n connect to prducer-app-irctc-app n get ticket, and send ticket to the passenger
	
	public Ticket bookTicket(Passenger passenger) {  //provider will take passeneger data as input n give  ticket as output
		String URL = "http://13.60.15.7:8080/bookTicket";  // to this url(available in cloud) we wanna send req
		RestTemplate restTemplate = new RestTemplate(); //use to connect to producer obj in cloud
		ResponseEntity<Ticket> responseEntity = 
				restTemplate.postForEntity(URL, passenger, Ticket.class);  //this method will send post request to provider
		Ticket ticket = responseEntity.getBody();
		return ticket;
		
	}
	
	public List<Ticket> getAllTickets(){
		String URL = "http://13.60.15.7:8080/getTickets";  
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Ticket[]> forEntity = restTemplate.getForEntity(URL, Ticket[].class);
		Ticket[] body = forEntity.getBody();      //ticket[] are arrays of json obj, convert to list
		List<Ticket> tickets = Arrays.asList(body);
		return tickets;
		
	}
	
	//controller to show all upcoming tickets data in a table ie. in UI,check controller
	
	
	
	 
}
