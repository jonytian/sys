package com.tyj.common.util;

public class ApiException extends Exception{

	private static final long serialVersionUID = -2412143028840726971L;
	
	private final OutResult outResult;
	
	public ApiException(OutResult outResult){
		this.outResult = outResult;
	}

	public OutResult getOutResult() {
		return outResult;
	}
	
}
