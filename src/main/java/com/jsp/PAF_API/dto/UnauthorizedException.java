package com.jsp.PAF_API.dto;

public class UnauthorizedException extends RuntimeException
{
	public UnauthorizedException(String message) {
        super(message);
    }
}
