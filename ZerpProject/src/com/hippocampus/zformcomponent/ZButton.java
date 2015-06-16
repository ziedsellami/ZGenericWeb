package com.hippocampus.zformcomponent;

import com.hippocampus.statics.Statics;

public class ZButton extends ZFormComponent { 
	 private String value ;
	 private boolean type;
	protected ZButton(String _name, String _value ,boolean _type) {
		super(_name, Statics.ZButton, true,true,true);
		this.setValue(_value);
		this.setType(_type);
	}

	@Override
	public String generateTag() {
		String tag="<button name=\""+this.get_name()+"\"";
		if (isType()){
			tag=tag+" type=\"submit\"";
		}else{
			tag=tag+" type=\"reset\"";
		}
		tag = tag + " value =\""+getValue()+"\"";
		tag = tag +" />"+this.get_name()+"</button>";
		return tag;
			
	}
 
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public boolean isType() {
		return type;
	}

	public void setType(boolean type) {
		this.type = type;
	}

	@Override
	public void insertZComponent() {
		// TODO Auto-generated method stub
		
	}

	
}
