package com.napoleon.life.common.code;

import com.napoleon.life.exception.ModelCodeInterface;


public enum UtilModelCode implements ModelCodeInterface {
	
	UTIL_ENCRYPT_EXCEPTION("UTIL-0001", "UTIL_ENCRYPT_EXCEPTION", "加密出现异常"),
	UTIL_DECRYPT_EXCEPTION("UTIL-0002", "UTIL_DECRYPT_EXCEPTION", "解密出现异常"),
	UTIL_DIGEST_EXCEPTION("UTIL-0003", "UTIL_DIGEST_EXCEPTION", "获取数据指纹出现异常"),
	UTIL_CHECK_SIGN_EXCEPTION("UTIL-0004", "UTIL_CHECK_SIGN_EXCEPTION", "验证签名出现异常"),
	UTIL_VALIDATE_OBJECT_EXCEPTION("UTIL-0005", "UTIL_VALIDATE_OBJECT_EXCEPTION", "校验对象出现异常"),
	;
	
	private final String code;
	private final String message;
	private final String chineseMessage;
	
	private UtilModelCode(String code, String message, String chineseMessage){
		this.code = code;
		this.message = message;
		this.chineseMessage = chineseMessage;
	}

	public String getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

	public String getChineseMessage() {
		return chineseMessage;
	}
}
