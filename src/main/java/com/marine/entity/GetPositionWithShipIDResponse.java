package com.marine.entity;

import java.util.List;

public class GetPositionWithShipIDResponse{
	Integer Code ; //'json:"code"`
	String Message ; //'json:"message"`
	List<PositionMeta> Data ; //'json:"data"`

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

	public List<PositionMeta> getData() {
		return Data;
	}

	public void setData(List<PositionMeta> data) {
		Data = data;
	}
}