package com.capgemini.SearchAPI.entities;

import java.time.LocalDateTime;

import com.capgemini.SearchAPI.beans.CardDetails;

public class Transaction {
	String transactionId;
	LocalDateTime transactionDate;
	double amount;
	Booking bookingReference;
	CardDetails paymentDetails;
}
