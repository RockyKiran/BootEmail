package com.example.boot_email.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.boot_email.dto.Emai1;
import com.example.boot_email.dto.Email;
import com.example.boot_email.dto.EmailDetails;
import com.example.boot_email.service.EmailService;

@RestController
public class EmailController {
	
	@Autowired
	EmailService service;
	
	@GetMapping("/m1")
	public String m1() {
		return "Hii broooo";
		
	}
	
	@PostMapping("/send")
	public String sendMsgCORB(@RequestBody Email email) {
		try {
			service.sendMsg(email);
			return "msg send Successfullyyy....";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "External Issue try again...............";
		}
		
	}
	@PostMapping("/send1")
	public String sendMsgCORB1(@RequestBody Emai1 email) {
		try {
			service.sendMsg1(email);
			return "msg send Successfullyyy....";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "External Issue try again...............";
		}
		
	}
	
	@PostMapping("/send2")
	public String sendMsgCORB2() {
		try {
			service.sendHtmlEmail();;
			return "msg send Successfullyyy....";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "External Issue try again...............";
		}
		
	}
	
	@PostMapping("/send3")
	public String sendMsgCORB3(@RequestBody EmailDetails emailde) {
		try {
			service.sendEmailWithAttachment(emailde);
			return "msg send Successfullyyy....";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "External Issue try again...............";
		}
		
	}
	
	
	

}
