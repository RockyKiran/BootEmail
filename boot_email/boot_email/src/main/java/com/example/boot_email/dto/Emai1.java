package com.example.boot_email.dto;

import java.util.Arrays;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Component
@NoArgsConstructor
@AllArgsConstructor
public class Emai1 {

	
		String[] to;
		String subject;
		String body;
		@Override
		public String toString() {
			return "Emai1 [to=" + Arrays.toString(to) + ", subject=" + subject + ", body=" + body + "]";
		}
		
		
		
		
}
