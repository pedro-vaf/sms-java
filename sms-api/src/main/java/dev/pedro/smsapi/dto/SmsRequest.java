package dev.pedro.smsapi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

/* O @JsonProperty garante o formato do arquivo JSON durante a requisição da API
 Por exemplo o JSON dessa API será:
 sender:
 ddd:
 phoneNumber:
 message: */

public record SmsRequest(
        String sender,
        int ddd,
        String phoneNumber,
        String message
) {

    public SmsRequest (@JsonProperty("sender") String sender,
                       @JsonProperty("ddd") int ddd,
                       @JsonProperty("phoneNumber") String phoneNumber,
                       @JsonProperty("message") String message){
        this.sender = sender;
        this.ddd = ddd;
        this.phoneNumber = phoneNumber;
        this.message = message;
    }

}
