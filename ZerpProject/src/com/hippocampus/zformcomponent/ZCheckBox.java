package com.hippocampus.zformcomponent;

import com.hippocampus.statics.Statics;

public class ZCheckBox extends ZFormComponent { // /VALIDE
	String descTag;

	public ZCheckBox(String _name, String description, boolean formVisibility,
			boolean treeVisibility) {
		super(_name, Statics.ZCheckbox, true, formVisibility, treeVisibility);
		this.descTag = description;

	}

	@Override
	public String generateTag() {
		String tag = null;
		tag = this.descTag + " " + "<input type=\"" + get_type()
				+ "\" name=\"" + get_name() + "\" />";
		return tag;
	}

	@Override
	public void insertZComponent() {
		// TODO Auto-generated method stub
		
	}

}
