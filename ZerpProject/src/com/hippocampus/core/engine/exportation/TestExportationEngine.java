package com.hippocampus.core.engine.exportation;

import com.hippocampus.fromzdktosgbd.engine.ZSgbdConnexion;
import com.hippocampus.statics.Statics;
import com.hippocampus.zformcomponent.ZFormComponent;
import com.hippocampus.zformcomponent.ZText;

public class TestExportationEngine { 

	public static void main(String[] args) {
		ZSgbdConnexion connexion =ZSgbdConnexion.getInstance();
		ZFormComponent component=  connexion.getZcomponent(7);
		//System.out.println(component.get_type());
		if(component.get_type().equalsIgnoreCase(Statics.Ztext)){
			component = (ZText)component;
		}
		System.out.println("component type Ztext= "+component.isFormVisibility());

	}

}
