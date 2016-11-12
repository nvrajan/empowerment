package com.ohack.aet.model;

import java.util.Date;
import java.util.Map;

import org.springframework.data.mongodb.core.mapping.Document;

import com.ohack.aet.constants.Caste;
import com.ohack.aet.constants.Criteria;

@Document(collection = "events")
public class TrainingEvent {
	
	private String id;
	
	private String eventName;
	
	private int duration;
	
	private String description;
	
	private long stipend;
	
	private long contactNo;
	
	private Date startDate;
	
	private Date endDate;
	
	private String ageEligibility;
	
	private String qualification;
	
	private String maritalStatus;
	
	private long incomeBounded;
	
	private Caste caste;
	
	private String tradeType;
	
	private byte[] eventPic;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getStipend() {
		return stipend;
	}

	public void setStipend(long stipend) {
		this.stipend = stipend;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}


	public String getTradeType() {
		return tradeType;
	}

	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

	public byte[] getEventPic() {
		return eventPic;
	}

	public void setEventPic(byte[] eventPic) {
		this.eventPic = eventPic;
	}

	public String getAgeEligibility() {
		return ageEligibility;
	}

	public void setAgeEligibility(String ageEligibility) {
		this.ageEligibility = ageEligibility;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public long getIncomeBounded() {
		return incomeBounded;
	}

	public void setIncomeBounded(long incomeBounded) {
		this.incomeBounded = incomeBounded;
	}

	public Caste getCaste() {
		return caste;
	}

	public void setCaste(Caste caste) {
		this.caste = caste;
	}

}
