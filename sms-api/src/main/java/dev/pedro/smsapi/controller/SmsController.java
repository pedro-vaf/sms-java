package dev.pedro.smsapi.controller;

import dev.pedro.smsapi.dto.SmsRequest;
import dev.pedro.smsapi.service.SmsApi;
import dev.pedro.smsapi.service.TwilioSmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController /* Torna a classe um controlador */
public class SmsController {

    private final SmsApi smsApi;

    /* A notação @Qualifier injeta a interface e com ela o service que foi nomeado
     como 'twilio' na class service TwilioSmsService */
    public SmsController(@Qualifier("twilio") SmsApi smsApi) {
        this.smsApi = smsApi;
    }

    @PostMapping("/send-sms")/* Mapea com método HTTP */
    public void sendSms(@RequestBody SmsRequest smsRequest){
        smsApi.sendSms(smsRequest);
    }
}
