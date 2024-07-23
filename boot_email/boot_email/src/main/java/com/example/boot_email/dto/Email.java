package com.example.boot_email.dto;

import org.springframework.stereotype.Component;

import jakarta.mail.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class Email {
	String to;
	String subject;
	String body;
	@Override
	public String toString() {
		return "Email [to=" + to + ", subject=" + subject + ", body=" + body + "]";
	}
	

}
