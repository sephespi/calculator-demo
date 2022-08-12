package com.example.subtraction.model;

public class SubtractionModel {

	private double minuend;
	private double subtrahend;

	public double getMinuend() {
		return minuend;
	}

	public void setMinund(double minuend) {
		this.minuend = minuend;
	}

	public double getSubtrahend() {
		return subtrahend;
	}

	public void setSubtrahend(double subtrahend) {
		this.subtrahend = subtrahend;
	}

	public double calculateDifference() {
		return minuend - subtrahend;
	}

}
