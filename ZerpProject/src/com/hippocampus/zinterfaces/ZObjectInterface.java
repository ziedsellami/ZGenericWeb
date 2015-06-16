package com.hippocampus.zinterfaces;

import com.hippocampus.zabstacts.ZObject;
import com.hippocampus.zdk.ZComponent;
import com.hippocampus.zformcomponent.ZFormComponent;

public interface ZObjectInterface {
	public  void addzFormComponents(ZFormComponent zFormComponent) ;
	public  String generateTag();
	public  void one2one(ZObject zobject2,ZComponent zComponent);
	public  void many2one(ZObject zobject2,ZComponent zComponent);
	public  void many2many( ZObject zObject2 ,ZComponent zComponent ,ZComponent zComponent2);
	public  void one2many(ZObject zobject2,ZComponent zComponent);
	public boolean isExistComponent(ZComponent zComponent);

}
