package com.frozan.exception;

public class FrozanGenericException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private String errMessage;

	public FrozanGenericException(String errMessage) {
		super(errMessage);
		this.errMessage = errMessage;
	}

	public String getErrMessage() {
		return errMessage;
	}

	public void setErrMessage(String errMessage) {
		this.errMessage = errMessage;
	}

}
