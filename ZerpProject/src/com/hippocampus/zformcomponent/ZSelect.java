package com.hippocampus.zformcomponent;

import com.hippocampus.onto.ZChoice;
import com.hippocampus.onto.ZChoiceWithValue;
import com.hippocampus.statics.Statics;
import com.hippocampus.zdk.ZExceptions;

public class ZSelect extends ZFormComponent {// /VALIDE

	
	public ZSelect(String _name, boolean formVisibility, boolean treeVisibility) {
		super(_name, Statics.ZSelect, false, formVisibility, treeVisibility);
			// name , type , true if simple field , visible for crud , visible for show
	}

	@Override
	public String generateTag() {
		String tag="";
		
		tag="<select name=\""+get_name()+"\" >";
		for (ZChoice zChoice : composedChoice) {
			ZChoiceWithValue choiceWithValue = (ZChoiceWithValue) zChoice;
			tag=tag+"<option value=\""+choiceWithValue.getValue()+"\" >"+choiceWithValue.getChoice()+"</option>";
		}
		
		tag=tag+"</select>";
		return tag;
	}
	@Override
		public void addChoice(ZChoice choice) {
		if (choice instanceof ZChoiceWithValue) {
			super.composedChoice.add(choice);
		} else
			try {
				throw new ZExceptions("Z000000009", true);
			} catch (ZExceptions e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	@Override
	public void insertZComponent() {
		// TODO Auto-generated method stub
		
	}

}
