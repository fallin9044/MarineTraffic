package com.marine.entity;

public class GetPositionWithShipIDResponse{
	Integer Code ; //'json:"code"`
	String Message ; //'json:"message"`
	PositionMeta[] Data ; //'json:"data"`

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

	public PositionMeta[] getData() {
		return Data;
	}

	public void setData(PositionMeta[] data) {
		Data = data;
	}
}