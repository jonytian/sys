package com.tyj.common.util;

import java.io.Serializable;

public class OutResult implements Serializable {

	/**
	 * 返回客户端统一格式，包括状态码，提示信息，以及业务数据
	 */
	private static final long serialVersionUID = 1L;
	/*
	 * 状态码
	 */
	private final int errcode;
	/*
	 * 必要的提示信息
	 */
	private final String errmsg;
	/*
	 * 业务数据
	 */
	private final Object data;
	
	public OutResult(int errcode) {
		this.errcode = errcode;
		this.errmsg = "";
		this.data = "";
	}
	
	public OutResult(int errcode, String errmsg) {
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.data = "";
	}
	
	public OutResult(int errcode, String errmsg, Object data) {
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.data = data;
	}

	public OutResult(ErrorEnum error) {
		this.errcode = error.getCode();
		this.errmsg = error.getMessage();
		this.data = "";
	}
	
	public OutResult(ErrorEnum error, Object data) {
		this.errcode = error.getCode();
		this.errmsg = error.getMessage();
		this.data = data;
	}
	
	public int getErrcode() {
		return errcode;
	}

	public String getErrmsg() {
		return errmsg;
	}

	public Object getData() {
		return data;
	}
	
}
