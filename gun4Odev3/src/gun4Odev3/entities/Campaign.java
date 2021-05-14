package gun4Odev3.entities;

import gun4Odev3.abstracts.Entity;

public class Campaign implements Entity{
		int id;
		int percentageOfDiscount;
		String campaignName;
	
	public Campaign () {
	}
	
	
	public Campaign(int id, int percentageOfDiscount, String campaignName) {
		super();
		this.id = id;
		this.percentageOfDiscount = percentageOfDiscount;
		this.campaignName = campaignName;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getPercentageOfDiscount() {
		return percentageOfDiscount;
	}


	public void setPercentageOfDiscount(int percentageOfDiscount) {
		this.percentageOfDiscount = percentageOfDiscount;
	}


	public String getCampaignName() {
		return campaignName;
	}


	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	
}
