package dev.pedro.smsapi.config;

import com.twilio.Twilio;
import org.springframework.context.annotation.Configuration;

import java.util.logging.Logger;

@Configuration
public class SmsInitializer {
    public static Logger logger = Logger.getLogger(SmsInitializer.class.getName());

    public SmsInitializer(TwilioConfiguration smsConfiguration) {
        Twilio.init(smsConfiguration.getAccountSid(), smsConfiguration.getAuthToken());

        logger.info("Twilio initialized with account sid: " + smsConfiguration.getAccountSid() +
                " Auth Token: " + smsConfiguration.getAuthToken() +
                " and trial number: " + smsConfiguration.getTrialNumber());
    }
}
