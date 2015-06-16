package com.hippocampus.zformcomponent;

import com.hippocampus.onto.ZChoice;
import com.hippocampus.onto.ZChoiceWithValue;
import com.hippocampus.statics.Statics;
import com.hippocampus.zdk.ZExceptions;

public class ZRadio extends ZFormComponent {// /VAlIDE

	public ZRadio(String _name, boolean formVisibility, boolean treeVisibility) {
		super(_name, Statics.ZRadio, false, formVisibility, treeVisibility);
		// TODO Auto-generated constructor stub
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
	public String generateTag() {
		String tag = "";

		if (super.composedChoice != null) {
			for (ZChoice zChoice : composedChoice) {
				ZChoiceWithValue choiceWithValue = (ZChoiceWithValue) zChoice;

				tag = tag + choiceWithValue.getChoice() + " "
						+ "<input type=\"" + get_type() + "\" name=\""
						+ get_name() + "\" value=\""
						+ choiceWithValue.getValue() + "\" />";
			}

		}
		return tag;
	}

	@Override
	public void insertZComponent() {
		// TODO Auto-generated method stub
		
	}

}
