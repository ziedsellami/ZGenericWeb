package com.hippocampus.relations;

import com.hippocampus.statics.Statics;
import com.hippocampus.zabstacts.ZObject;
import com.hippocampus.zdk.ZComponent;
import com.hippocampus.zdk.ZRelations;

public class ZO2ORelations extends ZRelations {

	public ZO2ORelations(ZObject zObject, ZObject zObject2,
			ZComponent zComponent) {
		super(zObject, zObject2, zComponent);
		this.type=Statics.one2one;
		
	}

}
