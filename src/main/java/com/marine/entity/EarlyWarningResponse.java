package com.marine.entity;

import java.util.List;

public class EarlyWarningResponse{
	List<Warning> Warning ; //预警信息

	public List<com.marine.entity.Warning> getWarning() {
		return Warning;
	}

	public void setWarning(List<com.marine.entity.Warning> warning) {
		Warning = warning;
	}
}