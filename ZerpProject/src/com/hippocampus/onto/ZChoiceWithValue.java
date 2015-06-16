package com.hippocampus.onto;

public class ZChoiceWithValue extends ZChoice {

	private String value;
	public ZChoiceWithValue(String choice, String value) {
		super(choice);
		this.setValue(value);
		
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	

}
