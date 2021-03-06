package entity;

import java.io.Serializable;

/**
 * 返回結果
 * @author 呆呆
 *
 */
public class Result implements Serializable{
	private boolean success;//是否成功
	private String message;//返回信息
	
	public Result() {
		super();
	}
	public Result(boolean success, String message) {
		super();
		this.success = success;
		this.message = message;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
