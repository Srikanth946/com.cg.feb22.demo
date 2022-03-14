package com.cg.feb22.demo;

public class VoterNotEligibleException extends Exception {

	private static final long serialVersionUID = 1L;

	public VoterNotEligibleException() {

	}

	public VoterNotEligibleException(String message) {
		super(message);

	}

}


//public class VoterNotEligibleException extends RunTimeException {
//
//	private static final long serialVersionUID = 1L;
//
//	public VoterNotEligibleException() {
//
//	}
//
//	public VoterNotEligibleException(String message) {
//		super(message);
//
//	}
//
//}