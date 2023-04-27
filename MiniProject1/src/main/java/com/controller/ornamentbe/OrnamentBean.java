package com.controller.ornamentbe;

public class OrnamentBean {
	  private String type;
	    private String brand;
	    private int cost;
	    private int ratings;
		public OrnamentBean(String type, String brand, int cost, int ratings) {
			super();
			this.type = type;
			this.brand = brand;
			this.cost = cost;
			this.ratings = ratings;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public int getCost() {
			return cost;
		}
		public void setCost(int cost) {
			this.cost = cost;
		}
		public int getRatings() {
			return ratings;
		}
		public void setRatings(int ratings) {
			this.ratings = ratings;
		}
	    
	
	

}
