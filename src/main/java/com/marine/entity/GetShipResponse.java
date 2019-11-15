package com.marine.entity;

public class GetShipResponse{
	Integer Code ; //'json:"code"`
	String Message ; //'json:"message"`
	Integer[] Data ; //'json:"data"`

	public Integer getCode() {
		return Code;
	}

	public void setCode(Integer code) {
		Code = code;
	}

	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}

	public Integer[] getData() {
		return Data;
	}

	public void setData(Integer[] data) {
		Data = data;
	}
}