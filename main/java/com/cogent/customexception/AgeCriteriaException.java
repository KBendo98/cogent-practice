package com.cogent.customexception;

public class AgeCriteriaException extends Exception{
	private static final long serialVersionUID = 1L;

	public AgeCriteriaException() {
		super("Age less than 18");
	}
}
