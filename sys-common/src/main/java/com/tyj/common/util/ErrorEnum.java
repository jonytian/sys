package com.tyj.common.util;

public enum ErrorEnum {
	
	/**
	 * NIO 状态码
	 */
	NIO_1000(1000, "SUCCESS"),
	READ_1001(1001, "数据流长度不符"),
	READ_1002(1002, "文件标识不合法"),
	READ_1003(1003, "文件标识不合法"),
	READ_1004(1004, "厂商代码长度不符"),
	READ_1005(1005, "用户名长度不符"),
	READ_1006(1006, "用户名不合法"),
	READ_1007(1007, "签名无效"),
	READ_1008(1008, "文件名长度不符"),
	READ_1009(1009, "文件名不合法"),
	READ_1010(1010, "文件内容长度不符"),
	READ_1011(1011, "文件内容为空"),
	
	READ_9997(9997, "不合法的包内容"),
	READ_9998(9998, "包格式错误"),
	READ_9999(9999, "接收内容长度为0"),
	
	
	 
	
	/**
	 * 全局状态码
	 */
	AUTH_FAIL(500, "授权失败"),
	UNAUTHORIZED(401, "未授权"),
	ERROR(-1, "unknown error"),
	SUCCESS(0, "success");
	
	private final int code;
	private final String message;
	
	ErrorEnum(int code, String message){
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}
	
}
