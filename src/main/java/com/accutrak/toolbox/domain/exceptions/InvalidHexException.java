package com.accutrak.toolbox.domain.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(value= HttpStatus.BAD_REQUEST, reason="Invalid Serial")
public class InvalidHexException extends RuntimeException {
}