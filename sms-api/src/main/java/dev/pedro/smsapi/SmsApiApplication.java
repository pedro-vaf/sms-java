package dev.pedro.smsapi;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmsApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(SmsApiApplication.class, args);
	}
}