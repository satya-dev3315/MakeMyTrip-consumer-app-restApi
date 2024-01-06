package com.ait.binding;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Passenger {

	private String name;
	private String email;
	private String from;
	private String to;
	private String doj;
	private String trainNo;
}
