package com.example.boot_email.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmailDetails {
	String to;
	String subject;
	String body;
	String attachment;
	@Override
	public String toString() {
		return "EmailDetails [to=" + to + ", subject=" + subject + ", body=" + body + ", attachment=" + attachment
				+ "]";
	}
	
}
