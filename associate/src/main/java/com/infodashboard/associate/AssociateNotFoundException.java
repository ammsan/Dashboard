package com.infodashboard.associate;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class AssociateNotFoundException extends RuntimeException {

	public AssociateNotFoundException(String exception) {
		super(exception);
	}

}
