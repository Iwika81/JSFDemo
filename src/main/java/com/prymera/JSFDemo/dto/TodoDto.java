package com.prymera.JSFDemo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TodoDto {
	private int id;
	private String message;
	private int priority;
}
