package io.micro.service.userservice.exceptions;

import org.springframework.dao.DataAccessResourceFailureException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class UserExceptionController {

	@ExceptionHandler(UserException.class)
	public ResponseEntity<Error> handleCustomException(UserException userException) {
		Error error = new Error(HttpStatus.INTERNAL_SERVER_ERROR.value(), userException.getErrorMsg());
		return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);

	}

	@ExceptionHandler(DataAccessResourceFailureException.class)
	public ResponseEntity<Error> handleDataAccessResourceFailureException(Exception exception) {
		Error error = new Error(HttpStatus.INTERNAL_SERVER_ERROR.value(), "Internal Server Error");
		return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
