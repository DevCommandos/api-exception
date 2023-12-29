package dev.commandos.apiexception.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_GATEWAY, reason = "옳지 않은 요청!!!")
public class BadRequestException extends RuntimeException {

    public BadRequestException(String message) {
        super(message);
    }
}
