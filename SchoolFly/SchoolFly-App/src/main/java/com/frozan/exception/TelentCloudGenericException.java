package com.frozan.exception;

public class TelentCloudGenericException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private String errMessage;

	public TelentCloudGenericException(String errMessage) {
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
