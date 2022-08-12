package com.example.division.model;

public class DivisionModel {

	private double dividend;
	private double divisor;

	public double getDividend() {
		return dividend;
	}

	public void setDividend(double dividend) {
		this.dividend = dividend;
	}

	public double getDivisor() {
		return divisor;
	}

	public void setDivisor(double divisor) {
		this.divisor = divisor;
	}

	public double calculateQuotient() {
		return dividend / divisor;
	}

}
