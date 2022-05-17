package com.cormacx.auctionservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class InvalidEmailException extends ResponseStatusException {
    public InvalidEmailException(HttpStatus status, String reason) {
        super(status, reason);
    }
}
