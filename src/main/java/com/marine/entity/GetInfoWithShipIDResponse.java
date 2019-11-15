package com.marine.entity;
public class GetInfoWithShipIDResponse{
	Integer Code ; //'json:"code"`
	String Message ; //'json:"message"`
	InfoMeta[] Data ; //'json:"data"`

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

	public InfoMeta[] getData() {
		return Data;
	}

	public void setData(InfoMeta[] data) {
		Data = data;
	}
}