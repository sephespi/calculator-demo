package com.example.multiplication.model;

public class MultiplicationModel {

	private double multiplicand;
	private double multiplier;

	public double getMultiplicand() {
		return multiplicand;
	}

	public void setMultiplicand(double multiplicand) {
		this.multiplicand = multiplicand;
	}

	public double getMultiplier() {
		return multiplier;
	}

	public void setMultiplier(double multiplier) {
		this.multiplier = multiplier;
	}

	public double calculateProduct() {
		return multiplicand * multiplier;
	}

}
