package com.capg.msc.MyShoppingCart.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyGlobalExceptionHandler {
	
	@ExceptionHandler
	public ResponseEntity<MyExceptionResponse> invalidCostInputByUser(InvalidCostRangeException ex)
	{
		int range1=ex.getRange1();
		int range2=ex.getRange2();
		
		MyExceptionResponse excResponse=new MyExceptionResponse();
		excResponse.setHttpStatus(HttpStatus.BAD_REQUEST.value());
		excResponse.setExceptionMsg("Invalid Cost Range"+range1+" and"+range2+",pls try again");
		return new ResponseEntity<MyExceptionResponse>(excResponse,HttpStatus.BAD_REQUEST);
		

	}
	
	
	

}
