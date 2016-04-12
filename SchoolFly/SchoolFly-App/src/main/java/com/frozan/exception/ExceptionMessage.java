package com.frozan.exception;

public enum ExceptionMessage {
	
	CONSTVAIlATION_MSG("Contrain vailation");
	
	
	
	 private String message;
	ExceptionMessage(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}

}
