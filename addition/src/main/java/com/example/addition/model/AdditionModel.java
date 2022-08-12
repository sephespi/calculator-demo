package com.example.addition.model;

public class AdditionModel {

	private double augend;
	private double addend;

	public double getAugend() {
		return augend;
	}

	public void setAugend(double augend) {
		this.augend = augend;
	}

	public double getAddend() {
		return addend;
	}

	public void setAddend(double addend) {
		this.addend = addend;
	}

	public double calculateSum() {
		return augend + addend;
	}

}
