package com.engagement.model.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestDto {

	private int requestId;
	private String requestType;
	private String status;
	private String message;
	private String clientEmail;
	private LocalDate interventionDate;
}