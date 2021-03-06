package com.javachip.carrotcountry.jmboard.faq.model.vo;

import java.sql.Date;

public class Faq {

	private int faqNo;
	private String memNo;
	private String faqTitle;
	private String faqContent;
	private String category;
	private Date faqEnrollDate;
	private String faqstatus;
	
public Faq() {}



public Faq(int faqNo, String faqTitle) {
	super();
	this.faqNo = faqNo;
	this.faqTitle = faqTitle;
}



public Faq(int faqNo, String memNo, String faqTitle, String faqContent, String category, Date faqEnrollDate) {
	super();
	this.faqNo = faqNo;
	this.memNo = memNo;
	this.faqTitle = faqTitle;
	this.faqContent = faqContent;
	this.category = category;
	this.faqEnrollDate = faqEnrollDate;
}



public Faq(String memNo, String faqTitle, String faqContent, String category) {
	super();
	this.memNo = memNo;
	this.faqTitle = faqTitle;
	this.faqContent = faqContent;
	this.category = category;
}
public Faq(int faqNo, String faqTitle, String faqContent, String faqWriter, Date faqEnrollDate) {
	super();
	this.faqNo = faqNo;
	this.faqTitle = faqTitle;
	this.faqContent = faqContent;
	this.faqEnrollDate = faqEnrollDate;
}



@Override
public String toString() {
	return "Faq [faqNo=" + faqNo + ", memNo=" + memNo + ", faqTitle=" + faqTitle + ", faqContent=" + faqContent
			+ ", category=" + category + ", faqEnrollDate=" + faqEnrollDate + 
			 ", faqstatus=" + faqstatus + "]";
}

public int getFaqNo() {
	return faqNo;
}

public void setFaqNo(int faqNo) {
	this.faqNo = faqNo;
}

public String getMemNo() {
	return memNo;
}

public void setMemNo(String memNo) {
	this.memNo = memNo;
}

public String getFaqTitle() {
	return faqTitle;
}

public void setFaqTitle(String faqTitle) {
	this.faqTitle = faqTitle;
}

public String getFaqContent() {
	return faqContent;
}

public void setFaqContent(String faqContent) {
	this.faqContent = faqContent;
}

public String getCategory() {
	return category;
}

public void setCategory(String category) {
	this.category = category;
}

public Date getFaqEnrollDate() {
	return faqEnrollDate;
}

public void setFaqEnrollDate(Date faqEnrollDate) {
	this.faqEnrollDate = faqEnrollDate;
}

public String getFaqstatus() {
	return faqstatus;
}

public void setFaqstatus(String faqstatus) {
	this.faqstatus = faqstatus;
}





	
	
}
