package dev.pedro.smsapi.service;

import com.twilio.rest.api.v2010.account.Message;
import com.twilio.twiml.voice.Sms;
import dev.pedro.smsapi.config.TwilioConfiguration;
import dev.pedro.smsapi.dto.SmsRequest;
import org.springframework.stereotype.Service;
import com.twilio.type.PhoneNumber;

@Service("twilio")
public class TwilioSmsService implements SmsApi {

    public final TwilioConfiguration twilioConfiguration;

    public TwilioSmsService(TwilioConfiguration twilioConfiguration) {
        this.twilioConfiguration = twilioConfiguration;
    }

    @Override
    public void sendSms(SmsRequest smsRequest) {
        String to = "+55" + smsRequest.ddd() + smsRequest.phoneNumber();
        String from = "De " + smsRequest.sender() + "\n";

        if(isValidPhoneNumber(to)){
            Message message = Message
                    .creator(
                            new PhoneNumber(to),
                            new PhoneNumber(twilioConfiguration.getTrialNumber()),
                            from + smsRequest.message()
                    )
                    .create();
        } else {
            throw  new IllegalArgumentException("Invalid phone number: " + to);
        }

    }

    private boolean isValidPhoneNumber(String fullPhoneNumber){


        return true;
    }
}
