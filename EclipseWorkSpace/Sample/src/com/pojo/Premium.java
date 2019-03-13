package com.pojo;

public class Premium {
	private String policy;
	private int premium;

	public Premium(String policy, int premium) {
		this.policy = policy;
		this.premium = premium;
	}

	public String getPolicy() {
		return policy;
	}

	public void setPolicy(String policy) {
		this.policy = policy;
	}

	public int getPremium() {
		return premium;
	}

	public void setPremium(int premium) {
		this.premium = premium;
	}

	@Override
	public String toString() {
		return "Premium [policy=" + policy + ", premium=" + premium + "]";
	}

}
