package com.hippocampus.relations;

import com.hippocampus.statics.Statics;
import com.hippocampus.zabstacts.ZObject;
import com.hippocampus.zdk.ZComponent;
import com.hippocampus.zdk.ZRelations;

public class ZM2MRelations extends ZRelations  {

	public ZM2MRelations(ZObject zObject, ZObject zObject2,
			ZComponent zComponent, ZComponent zComponent2) {
		super(zObject, zObject2, zComponent); 
		 this.setzComponent2(zComponent2);
		 this.type=Statics.many2many;
		}
}
