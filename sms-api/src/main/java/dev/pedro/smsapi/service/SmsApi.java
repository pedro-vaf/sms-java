package dev.pedro.smsapi.service;

import dev.pedro.smsapi.dto.SmsRequest;

public interface SmsApi {
    void sendSms(SmsRequest smsRequest);
}
