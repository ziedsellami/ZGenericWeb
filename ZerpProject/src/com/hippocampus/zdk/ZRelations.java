package com.hippocampus.zdk;

import java.util.Vector;

import com.hippocampus.zabstacts.Z;
import com.hippocampus.zabstacts.ZObject;

public class ZRelations extends Z{ //Singleton {
	
	public static Vector<ZRelations> relations ;
	
	protected String type;
	protected ZObject zObject1 ;
	protected ZObject zObject2;
	protected ZComponent zComponent1;
	private ZComponent zComponent2;
	public ZRelations(ZObject zObject, ZObject zObject2,
			ZComponent zComponent) { //obj1 obj2 id1 id2
		if (zObject.hashCode() == zObject2.hashCode()) {
			try {
				throw new ZExceptions("Z000000006", true);
			} catch (ZExceptions e) {
				e.printStackTrace();
			}
		}
		if (zObject.isExistComponent(zComponent) == false) {
			try {
				throw new ZExceptions("Z000000007", true);
			} catch (ZExceptions e) {
				e.printStackTrace();
			}
		}
		this.zObject1 = zObject;
		this.zObject2 = zObject2;
		this.zComponent1 = zComponent;
	}
	public static void initRelations(){
		if (ZRelations.relations==null)
		ZRelations.relations = new Vector<ZRelations>();
	}
	public ZComponent getzComponent2() {
		return zComponent2;
	}
	public void setzComponent2(ZComponent zComponent2) {
		if (zObject2.isExistComponent(zComponent2) == false) {
			try {
				throw new ZExceptions("Z000000007", true);
			} catch (ZExceptions e) {
				e.printStackTrace();
			}
		}
		this.zComponent2=zComponent2;
	}
}
