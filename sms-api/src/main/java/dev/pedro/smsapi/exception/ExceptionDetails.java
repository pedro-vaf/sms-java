package dev.pedro.smsapi.exception;

import java.time.LocalDateTime;

public record ExceptionDetails(
        String message,
        LocalDateTime timestamp,
        int status,
        String exception
) {
}
