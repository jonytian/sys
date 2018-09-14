package com.tyj.common.util;

import javax.servlet.http.HttpServletRequest;

public class RequestUtils {

	/**
	 * 判断请求方式，ajax请求不能返回页面
	 * @param request
	 * @return
	 */
	public static boolean isAjax(HttpServletRequest request){
		if("XMLHttpRequest".equalsIgnoreCase(((HttpServletRequest) request).getHeader("X-Requested-With"))
			|| request.getHeader("accept").indexOf("application/json") > -1 ){
			return true;
		}
		return false;
	}
	
}
