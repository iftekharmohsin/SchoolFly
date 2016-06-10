package com.frozan.exception;

public enum DaoExceptionMsg {
	
	CONNECTION_FAILED("Error while connecting to database"),
	CONSTRAINT_ERROR("Duplicate record found."),
	UPDATE_FAILED("Operation save/update failed"),
	DATA_INTEGRITY_EXCEPTION("fjl fsdjklf fsdjh"),
	CONSTVAIlATION_MSG("Contrain vailation");
	
	
	
	 private String message;
	DaoExceptionMsg(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}

}
