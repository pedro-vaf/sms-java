package dev.pedro.smsapi.config;

import org.springframework.beans.factory.annotation.Value;
/* A notação @Value retorna os parâmetros do arquivo application.yml para ser usado na class de configuração */
import org.springframework.context.annotation.Configuration;

@Configuration /* O Spring possui uma notação que transforma a class em configuração @Configuration */

public class TwilioConfiguration {
    private final String accountSid;
    private final String authToken;
    private final String trialNumber;

    public TwilioConfiguration(@Value("${twilio.account_sid}") String accountSid,
                               @Value("${twilio.auth_token}") String authToken,
                               @Value("${twilio.trial_number}") String trialNumber) {
        this.accountSid = accountSid;
        this.authToken = authToken;
        this.trialNumber = trialNumber;
    }

    public String getAccountSid() {
        return accountSid;
    }

    public String getAuthToken() {
        return authToken;
    }

    public String getTrialNumber() {
        return trialNumber;
    }
}
