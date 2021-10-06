package com.sabi.assessment.dto;

public class VideoPriceDTO {

	private String name;
    private String title;
    private String numberOfDays;
    private String price;
    
	public VideoPriceDTO(String name, String title, String numberOfDays, String price) {
		
		super();
		this.name = name;
		this.title = title;
		this.numberOfDays = numberOfDays;
		this.price = price;
		
	}

	public VideoPriceDTO () {
		
	}	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getNumberOfDays() {
		return numberOfDays;
	}

	public void setNumberOfDays(String numberOfDays) {
		this.numberOfDays = numberOfDays;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
    
}
