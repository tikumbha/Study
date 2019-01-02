package com.cg.assignment;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("SBU")
public class SBU 
{
	@Value("PES-BU")
	private String sbuCode;
	
	@Value("Kiran Rao")
	private String sbuHead;
	
	@Value("Product Engg. Services")
	private String sbuName;

	public String getSbuCode() {
		return sbuCode;
	}

	public void setSbuCode(String sbuCode) {
		this.sbuCode = sbuCode;
	}

	public String getSbuHead() {
		return sbuHead;
	}

	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}

	public String getSbuName() {
		return sbuName;
	}

	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}

	@Override
	public String toString() {
		return "SBU [sbuCode=" + sbuCode + ", sbuHead=" + sbuHead
				+ ", sbuName=" + sbuName + "]";
	}
	
	
}