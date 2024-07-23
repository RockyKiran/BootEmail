package com.example.boot_email.service;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.example.boot_email.dto.Emai1;
import com.example.boot_email.dto.Email;
import com.example.boot_email.dto.EmailDetails;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

@Service
public class EmailService {
	
	
	@Autowired
	JavaMailSender mailSender;
	public void sendMsg(Email email) {
		SimpleMailMessage message=new SimpleMailMessage();
		message.setTo(email.getTo());
		message.setSubject(email.getSubject());
		message.setText(email.getBody());;
		
		message.setFrom("rockykiran8085@gmail.com");
		
		mailSender.send(message);
		
	}
	
	public void sendMsg1(Emai1 email) {
		SimpleMailMessage message=new SimpleMailMessage();
		message.setTo(email.getTo()	);
		message.setSubject(email.getSubject());
		message.setText(email.getBody());;
		
		message.setFrom("rockykiran8085@gmail.com");
		
		mailSender.send(message);
		
	}



	public void sendHtmlEmail() throws MessagingException {
	    MimeMessage message = mailSender.createMimeMessage();

	    message.setFrom(new InternetAddress("rockykiran8085@gmail.com"));
	    message.setRecipients(MimeMessage.RecipientType.TO, "vittalyadav8328@gmail.com");
	    message.setSubject("Test email from Spring");

	    String htmlContent = "<h1>This is a test Spring Boot email</h1>" +
	                         "<p>It can contain <strong>HTML</strong> content.</p>";
	    message.setContent(htmlContent, "text/html; charset=utf-8");

	    mailSender.send(message);
	}
	
	public void sendEmailWithAttachment(EmailDetails emailde) throws MessagingException, IOException {

		MimeMessage message =mailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message, true);

		helper.setTo(emailde.getTo());
		helper.setSubject(emailde.getSubject());
		helper.setText(emailde.getBody());
		message.setFrom("rockykiran8085@gmail.com");

		FileSystemResource file = new FileSystemResource(new File(emailde.getAttachment()));
		helper.addAttachment(file.getFilename(), file);

		mailSender.send(message);
		}
}
