package com.hippocampus.relations;

import com.hippocampus.statics.Statics;
import com.hippocampus.zabstacts.ZObject;
import com.hippocampus.zdk.ZComponent;
import com.hippocampus.zdk.ZRelations;

public class ZO2MRelations extends ZRelations {

	public ZO2MRelations(ZObject zObject, ZObject zObject2,
			ZComponent zFormComponent) {
		super(zObject, zObject2, zFormComponent);
		this.type=Statics.one2many;
	}

}
