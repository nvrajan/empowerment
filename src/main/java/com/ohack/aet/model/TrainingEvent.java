package com.ohack.aet.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "events")
public class TrainingEvent {
	
	private String eventName;
	
	private int duration;
	
	private String description;
	
	private long stipend;
	
	private long contactNo;
	
	private Date startDate;
	
	private Date endDate;
	
	private List<String> eligiblities;
	
	private String tradeType;
	
	private byte[] eventPic;
	
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

	public List<String> getEligiblities() {
		return eligiblities;
	}

	public void setEligiblities(List<String> eligiblities) {
		this.eligiblities = eligiblities;
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
	
	
	

}
