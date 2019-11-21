package com.marine.entity;

import java.util.List;

public class GetInfoWithShipIDResponse{
	Integer Code ; //'json:"code"`
	String Message ; //'json:"message"`
	List<InfoMeta> Data ; //'json:"data"`

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

	public List<InfoMeta> getData() {
		return Data;
	}

	public void setData(List<InfoMeta> data) {
		Data = data;
	}
}