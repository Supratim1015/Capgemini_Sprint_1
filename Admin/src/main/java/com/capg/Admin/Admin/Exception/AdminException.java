package com.capg.Admin.Admin.Exception;

public class AdminException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;
	public AdminException(String message) {
		this.message=message;
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message.toString().trim();
	}
	

}
