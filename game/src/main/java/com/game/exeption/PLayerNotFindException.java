package com.game.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PLayerNotFindException extends RuntimeException{
    public PLayerNotFindException() {
    }

    public PLayerNotFindException(String message) {
        super(message);
    }

    public PLayerNotFindException(String message, Throwable cause) {
        super(message, cause);
    }

    public PLayerNotFindException(Throwable cause) {
        super(cause);
    }
}
