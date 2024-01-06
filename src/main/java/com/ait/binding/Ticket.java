package com.ait.binding;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Ticket {

	private Integer ticketNo;
	private String name;
	private String email;
	private String from;
	private String to;
	private String doj;
	private String trainNo;
	private String status;
}
